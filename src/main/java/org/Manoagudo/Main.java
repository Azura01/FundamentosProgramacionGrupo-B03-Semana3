package org.Manoagudo;

import org.Manoagudo.BaseDeDatos.BaseDatos;
import org.Manoagudo.Entidades.Vendedor;
import org.Manoagudo.Service.GenerateInfoFiles;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido docente!");
        GenerateInfoFiles generarArchivos = new GenerateInfoFiles();
        generarArchivos.createProductList();
        generarArchivos.createRecordSells();

    }
}