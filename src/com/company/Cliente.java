package com.company;

public class Cliente {

    private String idCliente; //se genera de manera aleatoria al crear un cliente , UUID
    private String nombre;
    private String email;
    private float descuento;


    //Constructor

    public  Cliente (String nombre, String email, float descuento){

        this.nombre=nombre;
        this.email=email;
        this.descuento=descuento;
        this.idCliente = java.util.UUID.randomUUID().toString();//asigno id random de tipo String

    }



    public void mostrarCliente(){

        System.out.print("Cliente[id="+this.idCliente+", nombre="+this.nombre+", email="+this.email+ ", descuento="+this.descuento+"]"); ;
    }


    //getters

    public String getIdCliente() {
        return idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public float getDescuento() {
        return descuento;
    }
}
