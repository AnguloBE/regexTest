package org.example;

public class Fila {

    private String nombreCampo;
    private String tipoDato;
    private String longitud;
    private String descripcion;

    public Fila () {}

    @Override
    public String toString() {
        return "Fila{" +
                "nombreCampo='" + nombreCampo + '\'' +
                ", tipoDato='" + tipoDato + '\'' +
                ", longitud='" + longitud + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }

    public String getNombreCampo() {
        return nombreCampo;
    }

    public void setNombreCampo(String nombreCampo) {
        this.nombreCampo = nombreCampo;
    }

    public String getTipoDato() {
        return tipoDato;
    }

    public void setTipoDato(String tipoDato) {
        this.tipoDato = tipoDato;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
