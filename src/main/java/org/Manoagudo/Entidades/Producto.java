package org.Manoagudo.Entidades;

public class Producto {

    private Long idProducto;
    private String nameProducto;
    private Double precioProducto;

    public Producto(Long idProducto, String nameProducto, Double precioProducto) {
        this.idProducto = idProducto;
        this.nameProducto = nameProducto;
        this.precioProducto = precioProducto;
    }

    public Producto() {
    }

    public String getNameProducto() {
        return nameProducto;
    }

    public void setNameProducto(String nameProducto) {
        this.nameProducto = nameProducto;
    }

    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }

    public Double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(Double precioProducto) {
        this.precioProducto = precioProducto;
    }

    @Override
    public String toString() {

        return "ID: " + getIdProducto() + " Nombre del Producto: " + getNameProducto() + " Precio: " + getPrecioProducto();
    }
}
