package org.Manoagudo.Entidades;

import org.Manoagudo.Enums.TipoDocumento;

public class Vendedor {
    private TipoDocumento tipoDocumento;
    private Long idVendedor;
    private String nombreVendedor;
    private String apellidosVendedor;

    public Vendedor(TipoDocumento tipoDocumento, Long idVendedor, String nombreVendedor, String apellidosVendedor) {
        this.tipoDocumento = tipoDocumento;
        this.idVendedor = idVendedor;
        this.nombreVendedor = nombreVendedor;
        this.apellidosVendedor = apellidosVendedor;
    }

    public Vendedor() {
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public Long getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(Long idVendedor) {
        this.idVendedor = idVendedor;
    }

    public String getNombreVendedor() {
        return nombreVendedor;
    }

    public void setNombreVendedor(String nombreVendedor) {
        this.nombreVendedor = nombreVendedor;
    }

    public String getApellidosVendedor() {
        return apellidosVendedor;
    }

    public void setApellidosVendedor(String apellidosVendedor) {
        this.apellidosVendedor = apellidosVendedor;
    }

    @Override
    public String toString() {
        return "Tipo de Documento: " + getTipoDocumento() + " No. " + getIdVendedor() + " Nombre Completo: " + getNombreVendedor() + " " + getApellidosVendedor();
    }
}
