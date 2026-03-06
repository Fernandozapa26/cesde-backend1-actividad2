package com.example;

public class Estudiante {

    // Atributos privados
    private String nombre;
    private int edad;
    private double promedio;

    // Constructor vacío
    public Estudiante() {
        nombre = "Sin nombre";
        edad = 0;
        promedio = 0.0;
    }

    // Constructor completo
    public Estudiante(String nombre, int edad, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }

    // Getter nombre
    public String getNombre() {
        return nombre;
    }

    // Setter nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter edad
    public int getEdad() {
        return edad;
    }

    // Setter edad con validación
    public void setEdad(int edad) {

        if (edad > 0) {
            this.edad = edad;
        }
    }

    // Getter promedio
    public double getPromedio() {
        return promedio;
    }

    // Setter promedio
    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    // Metodo que verifica si aprobo
    public boolean haAprobado() {

        if (promedio >= 3.0) {
            return true;
        } else {
            return false;
        }
    }

    // Metodo para mostrar información
    public void mostrarInfo() {

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Promedio: " + promedio);

        if (haAprobado()) {
            System.out.println("Estado: APROBADO");
        } else {
            System.out.println("Estado: REPROBADO");
        }
    }
}