package org.Manoagudo.Enums;

// Enumeración que representa diferentes tipos de documentos

public enum TipoDocumento {
    CC("Cedula de Ciudadania"),
    CE("Cedula de Extranjeria"),
    PS("Pasaporte");
    
 // Atributo que almacena la descripción del tipo de documento
    
    private String tipoDocumento;
    
// Constructor privado para inicializar el tipo de documento
    
    private TipoDocumento(String tipoDocumento){
        this.tipoDocumento = tipoDocumento;
    }
    
// Método para obtener la descripción del tipo de documento
    
    public String getTipoDocumento(){
        return tipoDocumento;
    }

}
