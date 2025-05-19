package org.example;

import java.util.List;

public class EstacionPeaje {
    private String nit;
    private String nombre;
    private String departamento;
    private double totalRecaudado;
    private List<Vehiculo> vehiculosAtendidos;
    private List<Recaudador> recaudadores;

    public EstacionPeaje(String nit, String nombre, String departamento, double totalRecaudado, List<Vehiculo> vehiculosAtendidos, List<Recaudador> recaudadores) {
        this.nit = nit;
        this.nombre = nombre;
        this.departamento = departamento;
        this.totalRecaudado = totalRecaudado;
        this.vehiculosAtendidos = vehiculosAtendidos;
        this.recaudadores = recaudadores;
    }

    @Override
    public String toString() {
        return "EstacionPeaje{" +
                "nit='" + nit + '\'' +
                ", nombre='" + nombre + '\'' +
                ", departamento='" + departamento + '\'' +
                ", totalRecaudado=" + totalRecaudado +
                ", vehiculosAtendidos=" + vehiculosAtendidos +
                ", recaudadores=" + recaudadores +
                '}';
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getTotalRecaudado() {
        return totalRecaudado;
    }

    public void setTotalRecaudado(double totalRecaudado) {
        this.totalRecaudado = totalRecaudado;
    }

    public List<Vehiculo> getVehiculosAtendidos() {
        return vehiculosAtendidos;
    }

    public void setVehiculosAtendidos(List<Vehiculo> vehiculosAtendidos) {
        this.vehiculosAtendidos = vehiculosAtendidos;
    }

    public List<Recaudador> getRecaudadores() {
        return recaudadores;
    }

    public void setRecaudadores(List<Recaudador> recaudadores) {
        this.recaudadores = recaudadores;
    }
}
