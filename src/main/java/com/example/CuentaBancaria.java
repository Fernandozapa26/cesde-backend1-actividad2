package com.example;

public class CuentaBancaria {

    private String titular;    // Atributos privados
    private double saldo;

    // constructor
    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;

        //valiar saldo inicial
        if (saldoInicial < 0 ) {
            this.saldo = 0;
        }else {
            this.saldo = saldoInicial;
        }
    }
    // Getter de titular
    public String getTitular() {
        return titular;
    }


    public void setTitular(String titular) {
    this.titular = titular;
    }
    public double getSaldo() {
        return saldo;
    }

    // Metodo para depositar dinero
    public void depositar(double cantidad) {

        // Validar que la cantidad sea mayor a 0
        if (cantidad > 0) {
            saldo = saldo + cantidad;
        }
    }

    // Metodo para retirar dinero
    public void retirar(double cantidad) {

        // Validar que haya saldo suficiente
        if (cantidad > 0 && cantidad <= saldo) {
            saldo = saldo - cantidad;
        }
    }



}
