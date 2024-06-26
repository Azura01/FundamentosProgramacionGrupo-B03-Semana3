package org.Manoagudo.Entidades;

import org.Manoagudo.Enums.TipoDocumento;

import java.util.List;

// Clase que representa un vendedor

public class Vendedor implements Comparable<Vendedor>{
    
     // Atributos de la clase Vendedor
    
    private TipoDocumento tipoDocumento; // Tipo de documento del vendedor
    private Long idVendedor; // Identificador del vendedor
    private String nombreVendedor; // Nombre del vendedor
    private String apellidosVendedor; // Apellidos del vendedo
    private double totalRecaudado; //total vendido por el vendedor
    private List<HistorialVentas> historialVentas; // Lista de historial de ventas del vendedor

     // Constructor con parámetros para inicializar los atributos

    public Vendedor(TipoDocumento tipoDocumento, Long idVendedor, String nombreVendedor, String apellidosVendedor) {
        this.tipoDocumento = tipoDocumento;
        this.idVendedor = idVendedor;
        this.nombreVendedor = nombreVendedor;
        this.apellidosVendedor = apellidosVendedor;
    }

    public Vendedor() {
    }
    
// Métodos para obtener y establecer el tipo de documento
    
    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
    
 // Métodos para obtener y establecer el identificador del vendedor
    
    public Long getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(Long idVendedor) {
        this.idVendedor = idVendedor;
    }
    
// Métodos para obtener y establecer el nombre del vendedor
    
    public String getNombreVendedor() {
        return nombreVendedor;
    }

    public void setNombreVendedor(String nombreVendedor) {
        this.nombreVendedor = nombreVendedor;
    }
    
  // Métodos para obtener y establecer los apellidos del vendedor
    
    public String getApellidosVendedor() {
        return apellidosVendedor;
    }

    public void setApellidosVendedor(String apellidosVendedor) {
        this.apellidosVendedor = apellidosVendedor;
    }

    public double getTotalRecaudado() {
        return totalRecaudado;
    }

    public void setTotalRecaudado(double totalRecaudado) {
        this.totalRecaudado = totalRecaudado;
    }

    public List<HistorialVentas> getHistorialVentas() {
        return historialVentas;
    }

    // Método para agregar un registro de venta al historial de ventas del vendedor
    public void agregarVenta(HistorialVentas venta) {
        historialVentas.add(venta);
    }
    
// Método toString para representar la información del vendedor como una cadena de texto
    
    @Override
    public String toString() {
        return "Tipo de Documento: " + getTipoDocumento() + " No. " + getIdVendedor() + " Nombre Completo: " + getNombreVendedor() + " " + getApellidosVendedor();
    }

    @Override
    public int compareTo(Vendedor otroVendedor) {
        // Comparamos los vendedores en función del total recaudado
        return Double.compare(this.totalRecaudado, otroVendedor.totalRecaudado);
    }

}
