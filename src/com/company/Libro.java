package com.company;

import java.util.ArrayList;

public class Libro {
    private String titulo;
    private double precio;
    private int stock;
    ArrayList<Autor> autores = new ArrayList<>();


    private Autor autor;

    //Constructores

    public Libro (String titulo, double precio, int stock, ArrayList<Autor> autores){
        this.titulo=titulo;
        this.precio=precio;
        this.stock=stock;

        for (Autor variableAutor : autores)
        {
            this.autores.add(variableAutor);
        }

    }

    public Libro(){}

    //Métodos

    public void mostrarLibro( Libro libro){
        System.out.println("Libro ");
        System.out.println("titulo: "+this.titulo);
        System.out.println("precio: "+this.titulo);
        System.out.println("stock: "+this.stock);

    }

    public void mostrarAutores(ArrayList<Autor> autores){

        for (int i=0; i<autores.size();i++){

            autores.get(i).mostrarAutor();
        }
    }

    public Libro modificarLibro(Libro libro, double nuevoPrecio, int nuevoStock){

        this.precio=nuevoPrecio;
        this.stock=nuevoStock;
        return libro;

    }

    public void mensajeLibro(Libro libro){

        System.out.print("El libro, {"+this.titulo+"} de { ");

        for (Autor variableAutor : autores)
        {
            System.out.print("["+variableAutor.getNombre()+"] ");

        }

        System.out.print("} tiene un precio de "+this.precio+" pesos \n");

    }

    //Getters & Setters

    public String getTitulo() {
        return titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }
}
