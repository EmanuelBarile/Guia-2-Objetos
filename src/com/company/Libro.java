package com.company;

public class Libro {
    private String titulo;
    private double precio;
    private int stock;

    public Autor getAutor() {
        return autor;
    }

    private Autor autor;

    //Constructores

    public Libro (String titulo, double precio, int stock, Autor autor){
        this.titulo=titulo;
        this.precio=precio;
        this.stock=stock;
        this.autor=autor;

    }

    public Libro(){}

    //Métodos

    public void mostrarLibro( Libro libro){
        System.out.println("Libro ");
        System.out.println("titulo: "+this.getTitulo());
        System.out.println("precio: "+this.getPrecio());
        System.out.println("stock: "+this.getStock());

    }

    public void mostrarLibroYautor( Libro libro){
        System.out.println("titulo: "+this.getTitulo());
        System.out.println("precio: "+this.getPrecio());
        System.out.println("stock: "+this.getStock());
        //libro.autor.mostrarAutor(libro.autor); consultar
        libro.getAutor().mostrarAutor(libro.getAutor());
    }

    public void mostrarAutorDesdeLibro(Libro libro){

        libro.autor.mostrarAutor(libro.autor);
    }

    public Libro modificarLibro(Libro libro, double nuevoPrecio, int nuevoStock){

        this.precio=nuevoPrecio;
        this.stock=nuevoStock;
        return libro;

    }

    public void mensajeLibro(Libro libro){

        System.out.println("El libro, {"+this.getTitulo()+"} de {"+libro.autor.getNombre()+" "+libro.autor.getApellido()+"}. Se vende a "+ this.getPrecio()+"} pesos.");

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
