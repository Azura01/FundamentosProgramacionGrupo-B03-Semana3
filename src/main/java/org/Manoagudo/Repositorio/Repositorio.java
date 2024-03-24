package org.Manoagudo.Repositorio;

import java.util.List;

// Interfaz genérica para un repositorio

public interface Repositorio <T>{
    
// Método para listar elementos de tipo T
    
    List<T> listar();
    
// Método para guardar un elemento de tipo T
    
    void guardar(T t);

// Método para eliminar un elemento de tipo T
    
    void eliminar(T t);

}
