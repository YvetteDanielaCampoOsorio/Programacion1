package org.example;

public class Recaudador {
    private String nombreR;
    private String apellidosR;
    private String idR;
    private String fechaNacimientoR;
    private float sueldoMensualR;

    public Recaudador(String nombreR, String apellidosR, String idR, String fechaNacimientoR, float sueldoMensualR) {
        this.nombreR = nombreR;
        this.apellidosR = apellidosR;
        this.idR = idR;
        this.fechaNacimientoR = fechaNacimientoR;
        this.sueldoMensualR = sueldoMensualR;
    }

    @Override
    public String toString() {
        return "Recaudador{" +
                "nombreR='" + nombreR + '\'' +
                ", apellidosR='" + apellidosR + '\'' +
                ", idR='" + idR + '\'' +
                ", fechaNacimientoR='" + fechaNacimientoR + '\'' +
                ", sueldoMensualR=" + sueldoMensualR +
                '}';
    }

    public String getNombreR() {
        return nombreR;
    }

    public void setNombreR(String nombreR) {
        this.nombreR = nombreR;
    }

    public String getApellidosR() {
        return apellidosR;
    }

    public void setApellidosR(String apellidosR) {
        this.apellidosR = apellidosR;
    }

    public String getIdR() {
        return idR;
    }

    public void setIdR(String idR) {
        this.idR = idR;
    }

    public String getFechaNacimientoR() {
        return fechaNacimientoR;
    }

    public void setFechaNacimientoR(String fechaNacimientoR) {
        this.fechaNacimientoR = fechaNacimientoR;
    }

    public float getSueldoMensualR() {
        return sueldoMensualR;
    }

    public void setSueldoMensualR(float sueldoMensualR) {
        this.sueldoMensualR = sueldoMensualR;
    }
}
