package org.Manoagudo.Service;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class ProyectoFinal {

    public void createSalesMenFile(int randomSalesCount, String name, long id) {
        String fileName = "Ventas_" + name.replace(" ", "_") + "_" + id + ".txt";

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("===== Historial de ventas para " + name + " =====\n");
            Random random = new Random();
            for (int i = 0; i < randomSalesCount; i++) {
                writer.write("Venta " + (i + 1) + ": $" + (random.nextDouble() * 1000) + "\n");
            }
            System.out.println("Archivo de ventas generado con éxito: " + fileName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // Método para crear un archivo con información pseudoaleatoria de productos
    public void createProductsFile(int productsCount) {
        String fileName = "ProductosAleatorios.txt";

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("===== Información de productos aleatorios =====\n");
            Random random = new Random();
            for (int i = 0; i < productsCount; i++) {
                writer.write("Producto " + (i + 1) + ": Precio $" + (random.nextDouble() * 1000) + "\n");
            }
            System.out.println("Archivo de productos aleatorios generado con éxito: " + fileName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // Método para crear un archivo con información pseudoaleatoria de vendedores
    public void createSalesManInfoFile(int salesmanCount) {
        String fileName = "InformacionVendedores.txt";
        String[] nombres = {"Juan", "Maria", "Carlos", "Laura", "Pedro"};
        String[] apellidos = {"Perez", "Gomez", "Rodriguez", "Lopez", "Martinez"};

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("===== Información de vendedores pseudoaleatoria =====\n");
            Random random = new Random();
            for (int i = 0; i < salesmanCount; i++) {
                String nombre = nombres[random.nextInt(nombres.length)];
                String apellido = apellidos[random.nextInt(apellidos.length)];
                long id = 1000000000L + random.nextInt(99999999);
                writer.write("Vendedor " + (i + 1) + ": " + nombre + " " + apellido + ", ID: " + id + "\n");
            }
            System.out.println("Archivo de información de vendedores generado con éxito: " + fileName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
