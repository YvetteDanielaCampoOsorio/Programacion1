package org.example;

public abstract class Vehiculo {
    private String placa;
    private int cantidadPeajes;
    private float valorBase;

    public Vehiculo(String placa, int cantidadPeajes, float valorBase) {
        this.placa = placa;
        this.cantidadPeajes = cantidadPeajes;
        this.valorBase = valorBase;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "placa='" + placa + '\'' +
                ", cantidadPeajes='" + cantidadPeajes + '\'' +
                ", valorBase='" + valorBase + '\'' +
                '}';
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getCantidadPeajes() {
        return cantidadPeajes;
    }

    public void setCantidadPeajes(int cantidadPeajes) {
        this.cantidadPeajes = cantidadPeajes;
    }

    public float getValorBase() {
        return valorBase;
    }

    public void setValorBase(float valorBase) {
        this.valorBase = valorBase;
    }
}
