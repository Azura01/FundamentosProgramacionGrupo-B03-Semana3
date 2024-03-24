package org.Manoagudo.BaseDeDatos;

import org.Manoagudo.Entidades.HistorialVentas;
import org.Manoagudo.Entidades.Producto;
import org.Manoagudo.Entidades.Vendedor;
import org.Manoagudo.Enums.TipoDocumento;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class BaseDatos {

    public static List<Producto> baseDeDatosProductos() {

        List<Producto> listaProductos = new ArrayList<>();

        Producto producto1 = new Producto(1L, "Apple Iphone 15 Pro Max", 7685000.4);
        Producto producto2 = new Producto(2L, "Apple Iphone 14 Pro Max", 5532000.3);
        Producto productos3 = new Producto(3L, "Ipad 15' de 128 Gbs", 2435000.1);
        Producto productos4 = new Producto(4L, "Smart Watch 14`", 1685000.4);

        listaProductos.add(producto1);
        listaProductos.add(producto2);
        listaProductos.add(productos3);
        listaProductos.add(productos4);

        return listaProductos;

    }
    public static List<Vendedor> baseDeDatosVendedores() {

        List<Vendedor> listaVendedores = new ArrayList<>();

        Vendedor vendedor1 = new Vendedor(TipoDocumento.CC, 1075111254L, "Jose Manuel", "Agudo Benavides");
        Vendedor vendedor2 = new Vendedor(TipoDocumento.CC, 1075252123L, "Diego Fernando", "Suarez Sanchez");
        Vendedor vendedor3 = new Vendedor(TipoDocumento.CC, 1031123522L, "Helbert Sneider", "Hernandez Pabon");
        Vendedor vendedor4 = new Vendedor(TipoDocumento.CC, 1052431233L, "Juan Daniel", "Ramirez Pardo");
        Vendedor vendedor5 = new Vendedor(TipoDocumento.CC, 1052431233L, "Juan Sebastian", "Acelas Balaguera");

        listaVendedores.add(vendedor1);
        listaVendedores.add(vendedor2);
        listaVendedores.add(vendedor3);
        listaVendedores.add(vendedor4);
        listaVendedores.add(vendedor5);

        return listaVendedores;
    }

    public static HistorialVentas baseDatosVentas(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("De que vendedor le gustaria conocer su historial de ventas, por favor especifique ID");
        int id = scanner.nextInt();

        List<Producto> productos = new ArrayList<>(baseDeDatosProductos());
        List<Vendedor> vendedores = new ArrayList<>(baseDeDatosVendedores());
        List<HistorialVentas> historialVentas = new ArrayList<>();

        HistorialVentas historialVentas1 = new HistorialVentas();

        for(Vendedor vendedor : vendedores){
            historialVentas1.setVendedor(vendedor);
        }

        for(Producto producto : productos){
            historialVentas1.setProducto(producto);
        }


        historialVentas1.setVendedor(vendedores.get(id));

        return historialVentas1;

    }

    public static int generateRandomInt() {
        int min = 1;
        int max = 11;
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

}
