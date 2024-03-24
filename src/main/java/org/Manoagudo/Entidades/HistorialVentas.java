package org.Manoagudo.Entidades;

public class HistorialVentas {
    private Vendedor vendedor;
    private Producto producto;
    private int cantidadVendida;
    private Double totalVendido;

    public HistorialVentas(Vendedor vendedor, Producto producto, int cantidadVendida, Double totalVendido) {
        this.vendedor = vendedor;
        this.producto = producto;
        this.cantidadVendida = cantidadVendida;
        this.totalVendido = totalVendido;
    }

    public HistorialVentas() {
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidadVendida() {
        return cantidadVendida;
    }

    public void setCantidadVendida(int cantidadVendida) {
        this.cantidadVendida = cantidadVendida;
    }

    public Double getTotalVendido() {
        return getCantidadVendida() * producto.getPrecioProducto();
    }

    public void setTotalVendido(Double totalVendido) {
        this.totalVendido = totalVendido;
    }

    @Override
    public String toString() {
        return vendedor.getTipoDocumento() + " " + " No. " + vendedor.getIdVendedor() + "Nombre Completo: " + vendedor.getNombreVendedor() + " " + vendedor.getApellidosVendedor() + " \n"
                + "\n " + " Producto con ID: " + producto.getIdProducto() + " Cantidad de productos vendida " + getCantidadVendida() + " Total facturado: " + getTotalVendido();
    }
}
