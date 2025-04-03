package org.example;

public abstract class Vehiculo {
    protected String id;
    protected String modelo;
    protected int anioFabricacion;
    protected double kilometrage;
    protected int misionesCompletadas;
    private EstadoOperativo estadoOperativo;

    public Vehiculo(String id, String modelo, int anioFabricacion, double kilometrage, int misionesCompletadas, EstadoOperativo estadoOperativo) {
        this.id = id;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.kilometrage = kilometrage;
        this.misionesCompletadas = misionesCompletadas;
        this.estadoOperativo = estadoOperativo;
    }
}
