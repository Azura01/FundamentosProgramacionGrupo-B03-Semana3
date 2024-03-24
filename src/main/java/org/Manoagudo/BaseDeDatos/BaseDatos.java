package org.Manoagudo;

import org.Manoagudo.Entidades.Producto;
import org.Manoagudo.Entidades.Vendedor;
import org.Manoagudo.Enums.TipoDocumento;

import java.util.ArrayList;
import java.util.List;

public class BaseDatos {


    public static void baseDeDatos() {

        List<Producto> listaProductos = new ArrayList<>();
        List<Vendedor> listaVendedores = new ArrayList<>();

        Producto producto1 = new Producto(1L, "Apple Iphone 15 Pro Max", 7685000.4);
        Producto producto2 = new Producto(2L, "Apple Iphone 14 Pro Max", 5532000.3);
        Producto productos3 = new Producto(3L, "Ipad 15' de 128 Gbs", 2435000.1);
        Producto productos4 = new Producto(4L, "Smart Watch 14`", 1685000.4);

        listaProductos.add(producto1);
        listaProductos.add(producto2);
        listaProductos.add(productos3);
        listaProductos.add(productos4);


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

    }
}
