package org.example;

public class Camion extends Vehiculo {
    private int numeroEjes;
    private float capacidadCarga;

    public Camion(String placa, int cantidadPeajes, float valorBase, int numeroEjes, float capacidadCarga) {
        super(placa, cantidadPeajes, valorBase);
        this.numeroEjes = numeroEjes;
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public String toString() {
        return "Camion{" +
                "numeroEjes=" + numeroEjes +
                ", capacidadCarga=" + capacidadCarga +
                '}';
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    public float getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(float capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }
}
