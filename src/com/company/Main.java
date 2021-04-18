package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        /*//a. Inicialice un objeto de tipo Autor, “Joshua”, “Bloch”, “joshua@email.com”, ’M’.

        Autor autor1 = new Autor("Joshua","Bloch","joshua@email.com",'M');
        Autor autor2 = new Autor("Jesus","Christ","jc@email.com",'M');
        Autor autor3 = new Autor("Jack","Spade","jackS@email.com",'M');


        ArrayList<Autor> autoresArreglo = new ArrayList<>();// declaro array autores en main
        autoresArreglo.add(autor1);// agrego el autor instanciado, por defecto en [0]
        autoresArreglo.add(autor2);
        autoresArreglo.add(autor3);

        //b. Imprima por pantalla al autor previamente instanciado.

        //autor1.mostrarAutor(autor1);

        //c. Inicialice el libro “Effective Java” del Autor “Joshua Bloch” que cuesta 450 pesos con una cantidad de 150 copias.

        Libro libro1 =new Libro("Effective Java",450.0,150,autoresArreglo);

        //d. Imprima por pantalla el libro instanciado.

        //libro1.mostrarLibro(libro1);

        //e. Modifique el precio del libro “Effective Java” a 500 pesos y aumente la cantidad en 50 copias.

        //libro1.modificarLibro(libro1,500, libro1.getStock()+50);
        //libro1.mostrarLibro(libro1);

        //f. Imprima por pantalla los atributos del Autor Joshua, accediendo desde el Libro “Effective Java”.

        //libro1.mostrarAutores(autoresArreglo);

    *//*g. Agregue un método a la clase Libro que posibilite imprimir en pantalla el
    siguiente mensaje:“El libro, {título} de {nombre del autor}. Se vende a {precio} pesos.”*//*

        libro1.mensajeLibro(libro1);

    *//*h. Modificar la clase Libro, para que acepte más de 1 Autor. Y realizar los
    cambios necesarios en el método del punto g, para imprimir un nuevo
    mensaje que liste los autores que contribuyeron a ese libro.*//*

        //Realizado en inciso C
*/



        //EJERCICIO 2

    //a. Investigue la clase UUID y sus métodos estáticos para la generación de los
        //ids. Investigue la clase LocalDate y sus métodos estáticos para la generación
        //de la fecha.

    //b. Cree un objeto de tipo Cliente, imprima sus detalles por pantalla. Para esto
        //haga uso de un método que facilite la impresión del mismo.
        //Cliente[id=?, nombre=?, email=?, descuento=?]

        Cliente cliente1 = new Cliente("Dwight","DSchrute@hotmail.com",35f);

        //cliente1.mostrarCliente();

    //c. Cree un objeto de tipo Factura que posea al Cliente anteriormente creado.
        //Una vez hecho esto, imprima por pantalla el monto total de esta Factura y el
        //monto total luego de aplicarle el descuento.

        ItemVenta item1 =new ItemVenta("teclado","mecanico",5900);
        ItemVenta item2 =new ItemVenta("monitor","curvo",29700);
        ItemVenta item3 =new ItemVenta("parlante","edifier",7100);

        ArrayList<ItemVenta> listaItems= new ArrayList<>();
        listaItems.add(item1);
        listaItems.add(item2);
        listaItems.add(item3);

        Factura facturaDeCliente1= new Factura(cliente1,listaItems);

        facturaDeCliente1.imprimirMontoTotal();

        facturaDeCliente1.imprimirMontoConDescuento();

    //d. Cree un método que facilite la impresión del objeto de tipo Factura y que
        //siga el siguiente formato.
        //Factura[id=?, fecha=?, monto=?, montoDesc=?, Cliente[id=?, nombre=?,
        //email=?, descuento=?]]

        facturaDeCliente1.mostarFactura();

    //e. Analizar de agregar el tipo ItemVenta, que representa un producto que
        //forma parte de la venta. El mismo contiene un id, un nombre, descripción y
        //precio unitario. Considere las modificaciones necesarias en el tipo Factura
        //para que el mismo pueda almacenar múltiples Ítems de venta y a su vez
        //calcular los montos totales con y sin el descuento aplicado.

        //Realizado , se muestra en inciso D


    }

}