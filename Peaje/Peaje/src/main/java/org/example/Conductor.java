package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Conductor {
    private String nombresC;
    private String apellidosC;
    private String idC;
    private LocalDate fechaNacimientoC;
    private List<Vehiculo> vehiculos;

    public Conductor(String nombresC, String apellidosC, String idC, LocalDate fechaNacimientoC, List<Vehiculo> vehiculos) {
        this.nombresC = nombresC;
        this.apellidosC = apellidosC;
        this.idC = idC;
        this.fechaNacimientoC = fechaNacimientoC;
        this.vehiculos = vehiculos;
    }

    @Override
    public String toString() {
        return "Conductor{" +
                "nombresC='" + nombresC + '\'' +
                ", apellidosC='" + apellidosC + '\'' +
                ", idC='" + idC + '\'' +
                ", fechaNacimientoC=" + fechaNacimientoC +
                ", vehiculos=" + vehiculos +
                '}';
    }

    public String getNombresC() {
        return nombresC;
    }

    public void setNombresC(String nombresC) {
        this.nombresC = nombresC;
    }

    public String getApellidosC() {
        return apellidosC;
    }

    public void setApellidosC(String apellidosC) {
        this.apellidosC = apellidosC;
    }

    public String getIdC() {
        return idC;
    }

    public void setIdC(String idC) {
        this.idC = idC;
    }

    public LocalDate getFechaNacimientoC() {
        return fechaNacimientoC;
    }

    public void setFechaNacimientoC(LocalDate fechaNacimientoC) {
        this.fechaNacimientoC = fechaNacimientoC;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public void asignarVehiculo(Vehiculo v) {
        vehiculos.add(v);
    }

    public List<Vehiculo> obtenerVehiculosTipo(String tipo) {
        List<Vehiculo> filtrados = new ArrayList<>();
        for (Vehiculo v : vehiculos) {
            if (v.getClass().getSimpleName().equalsIgnoreCase(tipo)) {
                filtrados.add(v);
            }
        }
        return filtrados;
    }


}

