package org.Manoagudo.Entidades;

import org.Manoagudo.BaseDeDatos.BaseDatos;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HistorialVentas {

    private static HistorialVentas instanciaUnica = new HistorialVentas(); // Instancia única
    private List<Vendedor> vendedores = BaseDatos.baseDeDatosVendedores();
    private List<Producto> productos = BaseDatos.baseDeDatosProductos();
    private Map<Vendedor, Map<Producto, Integer>> ventasPorVendedor;
    private Map<Producto, Double> totalVendidoPorProducto; // Mapa para almacenar el total vendido por producto

    private HistorialVentas() {
        vendedores = BaseDatos.baseDeDatosVendedores();
        productos = BaseDatos.baseDeDatosProductos();
    }
    public static HistorialVentas obtenerInstancia() {
        return instanciaUnica;
    }

    public void reporteVentasGeneral() {
        ventasPorVendedor = new HashMap<>();
        totalVendidoPorProducto = new HashMap<>();

        for (Vendedor vendedor : vendedores) {
            Map<Producto, Integer> ventasPorProducto = new HashMap<>();
            double totalVendidoVendedor = 0.0; // Variable para almacenar el total vendido por este vendedor

            for (Producto producto : productos) {
                int cantidadProductosVendidos = BaseDatos.generateRandomInt();
                ventasPorProducto.put(producto, cantidadProductosVendidos);
                double totalVentaProducto = cantidadProductosVendidos * producto.getPrecioProducto();
                totalVendidoVendedor += totalVentaProducto; // Sumar al total vendido por este vendedor
                totalVendidoPorProducto.put(producto, totalVendidoPorProducto.getOrDefault(producto, 0.0) + totalVentaProducto);
            }

            ventasPorVendedor.put(vendedor, ventasPorProducto);
            vendedor.setTotalRecaudado(totalVendidoVendedor); // Actualizar el total vendido por este vendedor
        }
    }

    public Map<Vendedor, Map<Producto, Integer>> getVentasPorVendedor() {
        return ventasPorVendedor;
    }

    public Map<Producto, Double> getTotalVendidoPorProducto() {
        return totalVendidoPorProducto;
    }

    public List<Vendedor> getVendedores() {
        return vendedores;
    }
}
