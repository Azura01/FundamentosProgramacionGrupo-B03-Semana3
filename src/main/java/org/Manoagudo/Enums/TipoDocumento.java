package org.Manoagudo.Enums;

public enum TipoDocumento {
    CC("Cedula de Ciudadania"),
    CE("Cedula de Extranjeria"),
    PS("Pasaporte");

    private String tipoDocumento;

    private TipoDocumento(String tipoDocumento){
        this.tipoDocumento = tipoDocumento;
    }

    public String getTipoDocumento(){
        return tipoDocumento;
    }

}
