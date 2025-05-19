package org.example;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ConductorTest {

    @Test
    void asignarVehiculo() {
        Conductor c = new Conductor("Juan", "Pérez", "123", LocalDate.parse("2000-01-01"), new ArrayList<>());
        Vehiculo carro = new Carro("ABC123", 1,123,TipoCarro.ELECTRICO);
        c.asignarVehiculo(carro);
        System.out.println(c.getVehiculos().size()); // Debe imprimir 1
    }


    @Test
    void obtenerVehiculosTipo() {
        Conductor c = new Conductor("Juan", "Pérez", "123", LocalDate.parse("2000-01-01"), new ArrayList<>());
        Vehiculo carro = new Carro("ABC123", 1, 123, TipoCarro.ELECTRICO);
        c.asignarVehiculo(carro);

        List<Vehiculo> carros = c.obtenerVehiculosTipo("Carro");
        System.out.println(carros.size()); // debería imprimir 1
    }

}