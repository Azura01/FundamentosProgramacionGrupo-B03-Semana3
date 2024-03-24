package org.Manoagudo.Entidades;

// Clase que representa un producto

public class Producto {
    
// Atributos de la clase Producto
    
    private Long idProducto; // Identificador del producto
    private String nameProducto; // Nombre del producto
    private Double precioProducto; // Precio del producto
    
// Constructor con parámetros para inicializar los atributos
    
    public Producto(Long idProducto, String nameProducto, Double precioProducto) {
        this.idProducto = idProducto;
        this.nameProducto = nameProducto;
        this.precioProducto = precioProducto;
    }

    public Producto() {
    }
    
// Métodos para obtener y establecer el nombre del producto
    
    public String getNameProducto() {
        return nameProducto;
    }

    public void setNameProducto(String nameProducto) {
        this.nameProducto = nameProducto;
    }
    
// Métodos para obtener y establecer el identificador del producto
    
    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }
    
// Métodos para obtener y establecer el precio del producto
    
    public Double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(Double precioProducto) {
        this.precioProducto = precioProducto;
    }
    
 // Método toString para representar la información del producto como una cadena de texto
    
    @Override
    public String toString() {

        return "ID: " + getIdProducto() + " Nombre del Producto: " + getNameProducto() + " Precio: " + getPrecioProducto();
    }
}
