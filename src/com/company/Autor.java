package com.company;

public class Autor {
    private String nombre;
    private String apellido;
    private String email;
    private char genero;

    //Constructores

    public Autor (String nombre, String apellido, String email, char genero){
        this.nombre= nombre;
        this.apellido= apellido;
        this.email=email;
        this.genero=genero;
    }

    public Autor(){

    }

    //Métodos

    public void mostrarAutor(Autor autor){
        System.out.println("Autor ");
        System.out.println("nombre: "+this.getNombre());
        System.out.println("apellido: "+this.getApellido());
        System.out.println("email: "+this.getEmail());
        System.out.println("genero: "+this.getGenero());

    }

    //Getters & Setters

    public String getNombre(){
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public char getGenero() {
        return genero;
    }
}
