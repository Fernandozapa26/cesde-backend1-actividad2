package com.example;

public class Main {
    public static void main(String[] args) {

        Libro libro1 = new Libro();
        libro1.mostrarDetalles();  //Salida esperada por valores por defectos

        Libro libro2 = new Libro("La tranquilidad intranquila", "Juan Veronica");
        libro2.mostrarDetalles();

        Libro libro3 = new Libro("El maus rojo", "Fernando Zapa", 120);
        libro3.mostrarDetalles();


        //clase CuentaBancaria
        CuentaBancaria cuenta = new CuentaBancaria("Maria", 500);

        cuenta.depositar(200);

        System.out.println(cuenta.getSaldo());


           // clase Estudiante

        Estudiante e = new Estudiante("Pedro", 21, 2.5);

        e.mostrarInfo(); //dsw
    }
}