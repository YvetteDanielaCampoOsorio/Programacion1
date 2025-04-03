package org.example;

public class TransporteTropas extends Vehiculo {
    private int capacidadSoldados;

    public TransporteTropas(String id, String modelo, int anioFabricacion, double kilometrage, int misionesCompletadas, int capacidadSoldados ) {
        super(id,modelo, anioFabricacion, kilometrage, misionesCompletadas);
        this.capacidadSoldados = capacidadSoldados;
    }
}
