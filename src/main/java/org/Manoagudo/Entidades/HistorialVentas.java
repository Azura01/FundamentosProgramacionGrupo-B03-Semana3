package org.Manoagudo.Entidades;

public class HistorialVentas {
 // Atributos de la clase    
    private Vendedor vendedor; // Vendedor asociado al historial de ventas
    private Producto producto; // Producto asociado al historial de ventas
    private int cantidadVendida; // Cantidad de productos vendidos
    private Double totalVendido; // Total facturado por la venta
    
// Constructor con parámetros
    
    public HistorialVentas(Vendedor vendedor, Producto producto, int cantidadVendida, Double totalVendido) {
        this.vendedor = vendedor;
        this.producto = producto;
        this.cantidadVendida = cantidadVendida;
        this.totalVendido = totalVendido;
    }

    public HistorialVentas() {
    }
    
// Métodos para obtener y establecer el vendedor
    
    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
    
// Métodos para obtener y establecer el producto
    
    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
 // Métodos para obtener y establecer la cantidad vendida
    
    public int getCantidadVendida() {
        return cantidadVendida;
    }

    public void setCantidadVendida(int cantidadVendida) {
        this.cantidadVendida = cantidadVendida;
    }
    
// Método para obtener el total vendido
    
    public Double getTotalVendido() {
        return getCantidadVendida() * producto.getPrecioProducto();
    }

    public void setTotalVendido(Double totalVendido) {
        this.totalVendido = totalVendido;
    }
// Método toString para representar el historial de ventas como una cadena de texto
    @Override
    public String toString() {
        return vendedor.getTipoDocumento() + " " + " No. " + vendedor.getIdVendedor() + "Nombre Completo: " + vendedor.getNombreVendedor() + " " + vendedor.getApellidosVendedor() + " \n"
                + "\n " + " Producto con ID: " + producto.getIdProducto() + " Cantidad de productos vendida " + getCantidadVendida() + " Total facturado: " + getTotalVendido();
    }
}
