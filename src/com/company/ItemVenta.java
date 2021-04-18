package com.company;

public class ItemVenta {

    private String idVenta;
    private String nombreItem;
    private String descripcionItem;
    private double precioUnitarioItem;

    public ItemVenta(String nombreItem, String descripcionItem, double precioUnitarioItem){

        this.nombreItem=nombreItem;
        this.descripcionItem=descripcionItem;
        this.precioUnitarioItem=precioUnitarioItem;
        this.idVenta=java.util.UUID.randomUUID().toString();

    }


    public double getPrecioUnitarioItem() {
        return precioUnitarioItem;
    }
}
