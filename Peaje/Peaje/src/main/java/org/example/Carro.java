package org.example;

public class Carro extends Vehiculo {
    private TipoCarro tipoCarro;

    public Carro(String placa, int cantidadPeajes, float valorBase, TipoCarro tipoCarro) {
        super(placa, cantidadPeajes, valorBase);
        this.tipoCarro = tipoCarro;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "tipoCarro=" + tipoCarro +
                '}';
    }

    public TipoCarro getTipoCarro() {
        return tipoCarro;
    }

    public void setTipoCarro(TipoCarro tipoCarro) {
        this.tipoCarro = tipoCarro;
    }
}
