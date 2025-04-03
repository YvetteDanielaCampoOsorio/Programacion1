package org.example;

public class VehiculoApoyo extends Vehiculo{
    private TipoFuncion tipoFuncion;

    public VehiculoApoyo(String id, String modelo, int anioFabricacion, double kilometrage, int misionesCompletadas, TipoFuncion tipoFuncion ) {
        super(id, modelo, anioFabricacion, kilometrage, misionesCompletadas);
        this.tipoFuncion = tipoFuncion;
    }
}
