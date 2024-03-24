package org.Manoagudo.Service;

import org.Manoagudo.BaseDeDatos.BaseDatos;
import org.Manoagudo.Entidades.HistorialVentas;
import org.Manoagudo.Entidades.Producto;
import org.Manoagudo.Entidades.Vendedor;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class GenerateInfoFiles implements GeneradorArchivo {


    @Override
    public void createProductList() {
        String fileName = "Productos.txt";

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

    @Override
    public void createVendorList() {
        String fileName = "Vendedores.txt";

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(" ===== Listado de vendedores registrados ========\n");
            for (Vendedor vendedor : BaseDatos.baseDeDatosVendedores()) {
                writer.write(vendedor.toString() + "\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void createRecordSells() {

        List<Vendedor> vendedores = BaseDatos.baseDeDatosVendedores();
        List<Producto> productos = BaseDatos.baseDeDatosProductos();

        int i = 1;

        for (Vendedor vendedor : vendedores) {
            String fileName = "HistorialVentas_" + (i++) + ".txt";

            try (FileWriter writer = new FileWriter(fileName)) {
                writer.write("===== El vendedor " + vendedor.getNombreVendedor() + " =====\n");

                for (Producto producto : productos) {
                    int cantidadVendida = BaseDatos.generateRandomInt();
                    Double totalVendido = cantidadVendida * producto.getPrecioProducto();
                    writer.write("Producto: " + producto.getNameProducto() + "\n");
                    writer.write("Cantidad vendida: " + cantidadVendida + "\n");
                    writer.write("Total vendido: " + totalVendido + "\n");
                    writer.write("\n");
                }

                System.out.println("Archivo generado con éxito: " + fileName);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
/*
        HistorialVentas historialVentas = new HistorialVentas();
        List<HistorialVentas> historialVentasList = new ArrayList<>();

        for (Vendedor vendedor : BaseDatos.baseDeDatosVendedores()) {

            StringBuilder fileName = new StringBuilder();

            historialVentas.setVendedor(vendedor);

            for(Producto producto : BaseDatos.baseDeDatosProductos()){
                historialVentas.setProducto(producto);
            }

            for (int i = 1; i <= BaseDatos.baseDeDatosVendedores().size(); i++) {
                fileName.append("Vendedor-No: ").append(i);
            }

            try (FileWriter writer = new FileWriter(fileName.toString())) {
                writer.write(" ===== El vendedor " + historialVentas.getVendedor().getNombreVendedor());

                historialVentas.setCantidadVendida(BaseDatos.generateRandomInt());
                historialVentas.getTotalVendido();

                historialVentasList.add(historialVentas);

                for(HistorialVentas record : historialVentasList){
                    writer.write(record.toString());
                }


            } catch (IOException e) {
                throw new RuntimeException(e);
            }


        }*/
    }


}
