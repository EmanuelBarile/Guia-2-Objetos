package com.company;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

public class Factura {

    private String idFactura; //se genera de manera aleatoria al realizar una venta
    private double montoTotal;
    private Cliente cliente;
    private LocalTime fechaVenta = LocalTime.now(); //tentativo


    public Factura (double montoTotal, Cliente cliente ){

        this.montoTotal=montoTotal;
        this.cliente=cliente;
        this.fechaVenta=LocalTime.now();
        this.idFactura=java.util.UUID.randomUUID().toString();

    }

    public void imprimirMontoTotal(){

        System.out.println("el monto total es:"+this.getMontoTotal());

    }

    public double montoConDescuento(){

          return   this.montoTotal-=(this.montoTotal* this.cliente.getDescuento())/100;

    }

    public void imprimirMontoConDescuento(){

        System.out.println("el monto con el descuento aplicado es:"+this.montoConDescuento());

    }

    public  void mostarFactura(){

        System.out.print("Factura[id="+this.idFactura);
        System.out.print(", fecha="+this.fechaVenta);
        System.out.print(", monto="+this.montoTotal);
        System.out.print(", montoDesc="+this.montoConDescuento());
        this.cliente.mostrarCliente();
        System.out.print("]");
    }



    //getters & setters

    public double getMontoTotal() {
        return montoTotal;
    }
}
