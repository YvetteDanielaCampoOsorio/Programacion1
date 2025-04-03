package org.example;

import java.time.LocalDate;

public class Mision {
    private LocalDate fecha;
    private String ubicacion;
    private List<String> listPersonal;

    public Mision(LocalDate fecha, String ubicacion) {
        this.fecha = fecha;
        this.ubicacion = ubicacion;
        this.listPersonal = new ArrayList<>();
    }
}
