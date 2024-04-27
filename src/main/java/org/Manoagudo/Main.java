package org.Manoagudo;

import org.Manoagudo.Service.MethodsPlus;

// Clase principal que contiene el método main para iniciar la aplicación

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido docente!"); // Mensaje de bienvenida
        
// Creación de una instancia de GenerateInfoFiles para generar archivos de información 
        
        MethodsPlus generarArchivos = new MethodsPlus();

// Llamada a los métodos para generar archivos de productos y de historial de ventas
        
        generarArchivos.createProductList();
        generarArchivos.createRecordSells();
        generarArchivos.generarReporteVendedores();
        generarArchivos.createVendorList();
        generarArchivos.createProductSoldFile();

    }
}
