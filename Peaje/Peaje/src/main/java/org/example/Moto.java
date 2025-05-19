package org.example;

public class Moto extends Vehiculo {
    private int cilindraje;

    public Moto(String placa, int cantidadPeajes, float valorBase) {
        super(placa, cantidadPeajes, valorBase);
    }

    @Override
    public String toString() {
        return "Moto{" +
                "cilindraje=" + cilindraje +
                '}';
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }
}
