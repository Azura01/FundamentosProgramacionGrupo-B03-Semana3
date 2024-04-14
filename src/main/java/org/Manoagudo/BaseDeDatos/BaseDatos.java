package org.Manoagudo.BaseDeDatos;

import org.Manoagudo.Entidades.Producto;
import org.Manoagudo.Entidades.Vendedor;
import org.Manoagudo.Enums.TipoDocumento;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BaseDatos {
    
 // Método para generar una lista de productos predefinidos

    public static List<Producto> baseDeDatosProductos() {

        List<Producto> listaProductos = new ArrayList<>();

        Producto producto1 = new Producto(1L, "Apple Iphone 15 Pro Max", 785.4);
        Producto producto2 = new Producto(2L, "Apple Iphone 14 Pro Max", 400.53);
        Producto productos3 = new Producto(3L, "Ipad 15' de 128 Gbs", 342.2);
        Producto productos4 = new Producto(4L, "Smart Watch 14`", 160.4);

// Agregar productos a la lista

        listaProductos.add(producto1);
        listaProductos.add(producto2);
        listaProductos.add(productos3);
        listaProductos.add(productos4);


        return listaProductos;
    }

// Método para generar una lista de vendedores predefinidos
    public static List<Vendedor> baseDeDatosVendedores() {

        List<Vendedor> listaVendedores = new ArrayList<>();
        
// Creación de vendedores con información específica
        
        Vendedor vendedor1 = new Vendedor(TipoDocumento.CC, 1075111254L, "Jose Manuel", "Agudo Benavides");
        Vendedor vendedor2 = new Vendedor(TipoDocumento.CC, 1075252123L, "Diego Fernando", "Suarez Sanchez");
        Vendedor vendedor3 = new Vendedor(TipoDocumento.CC, 1031123522L, "Helbert Sneider", "Hernandez Pabon");
        Vendedor vendedor4 = new Vendedor(TipoDocumento.CC, 1052431233L, "Juan Daniel", "Ramirez Pardo");
        Vendedor vendedor5 = new Vendedor(TipoDocumento.CC, 1052431233L, "Juan Sebastian", "Acelas Balaguera");
        
// Agregar vendedores a la lista
        
        listaVendedores.add(vendedor1);
        listaVendedores.add(vendedor2);
        listaVendedores.add(vendedor3);
        listaVendedores.add(vendedor4);
        listaVendedores.add(vendedor5);

        return listaVendedores;
    }
    
// Método para simular la base de datos de ventas y obtener el historial de ventas de un vendedor


    public static int generateRandomInt() {
        int min = 1;
        int max = 11;
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

}
