package org.Manoagudo.Repositorio;

import java.util.List;

public interface Repositorio <T>{
    List<T> listar();
    void guardar(T t);
    void eliminar(T t);

}
