package org.example;

public class VehiculoBlindado extends Vehiculo {
    private int nivelBlindaje;

    public VehiculoBlindado(String id, String modelo, int anioFabricacion, double kilometrage, int misionesCompletadas, int nivelBlindaje) {
        super(id, modelo, anioFabricacion, kilometrage, misionesCompletadas);
        this.nivelBlindaje = nivelBlindaje;
    }
}