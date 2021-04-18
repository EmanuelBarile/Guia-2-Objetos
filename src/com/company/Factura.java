package com.company;

import java.time.LocalDate;
import java.time.LocalTime;

public class Factura {

    private String idFactura; //se genera de manera aleatoria al realizar una venta
    private double montoTotal;
    private Cliente cliente;
    private LocalTime fechaVenta = LocalTime.now(); //tentativo

}
