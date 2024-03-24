package org.Manoagudo.Repositorio;

import org.Manoagudo.Entidades.Producto;

import java.util.ArrayList;
import java.util.List;

// Implementación concreta de un repositorio para la entidad Producto

public class ProductoRepositorioImpl implements Repositorio{
    
// Método para listar productos
    
    @Override
    public List listar() {
        
// Se crea una lista de productos vacía
        
        List<Producto>productos =new ArrayList<>();
        
// Se devuelve la lista de productos
        
        return null;
    }
    
 // Método para guardar un objeto
    @Override
    public void guardar(Object o) {

    }
// Método para eliminar un objeto
    @Override
    public void eliminar(Object o) {

    }


}
