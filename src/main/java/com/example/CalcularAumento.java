package com.example;

public class CalcularAumento {
    public double calcularAumento(double salario) {
        double aumento;
        if (salario < 1500) {
        aumento = salario * 0.15;
        } else if (salario >= 1500 && salario <= 3000) {
        aumento = salario * 0.12;
        } else {
        aumento = salario * 0.07;
        }
        return Math.round(aumento);
        }
        
    
}
