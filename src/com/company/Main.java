package com.company;

public class Main {

    public static void main(String[] args) {

        //a. Inicialice un objeto de tipo Autor, “Joshua”, “Bloch”, “joshua@email.com”, ’M’.

        Autor autor1 = new Autor("Joshua","Bloch","joshua@email.com",'M');

        //b. Imprima por pantalla al autor previamente instanciado.

        //autor1.mostrarAutor(autor1);

        //c. Inicialice el libro “Effective Java” del Autor “Joshua Bloch” que cuesta 450 pesos con una cantidad de 150 copias.

        Libro libro1 =new Libro("Effective Java",450.0,150,autor1);

        //d. Imprima por pantalla el libro instanciado.

        libro1.mostrarLibro(libro1);

        //e. Modifique el precio del libro “Effective Java” a 500 pesos y aumente la cantidad en 50 copias.

        libro1.modificarLibro(libro1,500, libro1.getStock()+50);
        libro1.mostrarLibro(libro1);

        //f. Imprima por pantalla los atributos del Autor Joshua, accediendo desde el Libro “Effective Java”.

        libro1.mostrarAutorDesdeLibro(libro1);

    /*g. Agregue un método a la clase Libro que posibilite imprimir en pantalla el
    siguiente mensaje:“El libro, {título} de {nombre del autor}. Se vende a {precio} pesos.”*/

        libro1.mensajeLibro(libro1);

    /*h. Modificar la clase Libro, para que acepte más de 1 Autor. Y realizar los
    cambios necesarios en el método del punto g, para imprimir un nuevo
    mensaje que liste los autores que contribuyeron a ese libro.*/




    }

}