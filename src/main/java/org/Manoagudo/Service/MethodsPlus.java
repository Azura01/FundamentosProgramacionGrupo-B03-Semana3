package org.Manoagudo.Service;

import org.Manoagudo.BaseDeDatos.BaseDatos;
import org.Manoagudo.Entidades.HistorialVentas;
import org.Manoagudo.Entidades.Producto;
import org.Manoagudo.Entidades.Vendedor;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

// Clase que implementa la interfaz GeneradorArchivo para generar archivos de información

public class MethodsPlus implements GeneradorArchivo {

    private HistorialVentas historialVentas = HistorialVentas.obtenerInstancia();



    // Método para crear un archivo con la lista de productos

    @Override
    public void createProductList() {
        String fileName = "Productos.txt"; // Nombre del archivo de productos

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("===== Listado de productos =====\n");
            for (Producto producto : BaseDatos.baseDeDatosProductos()) {
                writer.write(producto.toString() + "\n");
            }
            System.out.println("Archivo generado con exito, nombrado: " + fileName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

// Método para crear un archivo con la lista de vendedores

    @Override
    public void createVendorList() {
        String fileName = "Vendedores.txt"; // Nombre del archivo de vendedores

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(" ===== Listado de vendedores registrados ========\n");
            for (Vendedor vendedor : BaseDatos.baseDeDatosVendedores()) {
                writer.write(vendedor.toString() + "\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

// Método para crear un archivo con el historial de ventas de cada vendedor

    @Override
    public void createRecordSells() {
        historialVentas.reporteVentasGeneral(); // Generar el reporte de ventas

        int i = 1; // Variable para numerar los archivos de historial de ventas

        for (Vendedor vendedor : historialVentas.getVendedores()) {
            String fileName = "HistorialVentas_" + (i++) + ".txt";

            try (FileWriter writer = new FileWriter(fileName)) {
                writer.write("===== El vendedor " + vendedor.getNombreVendedor() + " =====\n \n");

                double totalVentasVendedor = vendedor.getTotalRecaudado(); // Obtener el total vendido por este vendedor

                Map<Producto, Integer> ventasPorProducto = historialVentas.getVentasPorVendedor().get(vendedor);

                for (Map.Entry<Producto, Integer> entry : ventasPorProducto.entrySet()) {
                    Producto producto = entry.getKey();
                    int cantidadVendida = entry.getValue();
                    double totalVendido = cantidadVendida * producto.getPrecioProducto();
                    writer.write("Producto: " + producto.getNameProducto() + "\n");
                    writer.write("Cantidad vendida: " + cantidadVendida + "\n");
                    writer.write("Total vendido: " + totalVendido + "\n");
                    writer.write("\n");
                }

                writer.write("Total vendido por " + vendedor.getNombreVendedor() + ": " + totalVentasVendedor + "\n");

                System.out.println("Archivo generado con éxito: " + fileName);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void generarReporteVendedores() {
        String nombreArchivo = "RankingVentasPorVendedor.csv";

        // Obtener la lista de vendedores ordenados por el total vendido de mayor a menor
        List<Vendedor> vendedoresOrdenados = new ArrayList<>(historialVentas.getVendedores());
        Collections.sort(vendedoresOrdenados, Comparator.comparingDouble(Vendedor::getTotalRecaudado).reversed());

        try (FileWriter writer = new FileWriter(nombreArchivo)) {
            // Escribir la cabecera del archivo CSV
            writer.write("Nombre del Vendedor;Total Vendido\n");

            // Recorrer los vendedores ordenados y escribir la información en el archivo CSV
            for (Vendedor vendedor : vendedoresOrdenados) {
                // Obtener el total vendido por el vendedor actual
                double totalVentasVendedor = vendedor.getTotalRecaudado();

                // Escribir la información del vendedor en el archivo CSV
                writer.write(vendedor.getNombreVendedor() + ";" + totalVentasVendedor + "\n");
            }
            System.out.println("Archivo de reporte generado con éxito: " + nombreArchivo);
        } catch (IOException e) {
            throw new RuntimeException("Error al escribir el archivo de reporte: " + e.getMessage());
        }
    }

    public void createProductSoldFile() {
        String nombreArchivo = "ProductosVendidos.csv";

        try (FileWriter writer = new FileWriter(nombreArchivo)) {
            // Ordenar el mapa totalVendidoPorProducto por cantidad de forma descendente
            historialVentas.getTotalVendidoPorProducto().entrySet().stream()
                    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                    .forEach(entry -> {
                        Producto producto = entry.getKey();
                        double precio = producto.getPrecioProducto();
                        double cantidad = entry.getValue();

                        // Escribir la información del producto en el archivo CSV
                        try {
                            writer.write(producto.getNameProducto() + ";" + precio + ";" + cantidad + "\n");
                        } catch (IOException e) {
                            throw new RuntimeException("Error al escribir en el archivo: " + e.getMessage());
                        }
                    });

            System.out.println("Archivo de productos vendidos generado con éxito: " + nombreArchivo);
        } catch (IOException e) {
            throw new RuntimeException("Error al crear el archivo: " + e.getMessage());
        }
    }

}




