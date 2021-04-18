package com.company;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.UUID;

public class Factura {

    //private double montoTotal; // se retira a partir de modificaciones pedidas en inciso E

    private String idFactura; //se genera de manera aleatoria al realizar una venta
    private Cliente cliente;
    private LocalTime fechaVenta = LocalTime.now(); //tentativo
    private ArrayList <ItemVenta> listaItems= new ArrayList<>();

    public Factura ( Cliente cliente, ArrayList<ItemVenta> listaItems ){

        this.cliente=cliente;
        this.fechaVenta=LocalTime.now();
        this.idFactura=java.util.UUID.randomUUID().toString();

        for (ItemVenta varItem:listaItems) { // itero sobre el array de items
            this.listaItems.add(varItem);
        }

    }

    public double calcularMontoTotal(){

        double montoTotal=0;
        for (ItemVenta varItem:this.listaItems) {

            montoTotal+= varItem.getPrecioUnitarioItem();
        }
        return montoTotal;
    }

    public void imprimirMontoTotal(){

        System.out.println("el monto total es:"+calcularMontoTotal());

    }

    public double montoConDescuento(){

        double montoConDesc =0;
        montoConDesc= (calcularMontoTotal()-(calcularMontoTotal()*this.cliente.getDescuento())/100);

        return  montoConDesc;

    }

    public void imprimirMontoConDescuento(){

        System.out.println("el monto con el descuento aplicado es:"+this.montoConDescuento());

    }

    public  void mostarFactura(){

        System.out.print("Factura[id="+this.idFactura);
        System.out.print(", fecha="+this.fechaVenta);
        System.out.print(", monto="+this.calcularMontoTotal());
        System.out.print(", montoDesc="+this.montoConDescuento());
        this.cliente.mostrarCliente();
        System.out.print("]");
    }



}
