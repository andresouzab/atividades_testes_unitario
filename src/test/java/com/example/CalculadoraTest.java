package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    
    @Test
    void testarSoma(){
        Calculadora cl = new Calculadora();
       int resultado = cl.soma(2, 2);

       assertEquals(4, resultado);
    }
    @Test
    void testarAumento(){
        CalcularAumento ca = new CalcularAumento();
        double resultado = ca.calcularAumento(1400);
        assertEquals(210, resultado);
        double resultado2 = ca.calcularAumento(1500);
        assertEquals(180, resultado2);
        double resultado3 = ca.calcularAumento(5000);
        assertEquals(350, resultado3);
        double resultado4 = ca.calcularAumento(2500);
        assertEquals(300, resultado4);
        
    }

    @Test
    void testarPrimos(){
        CalcularPrimos cp = new CalcularPrimos();
        boolean resultado6 = cp.verificarPrimo(3);
        assertTrue(resultado6);
        boolean resultado7 = cp.verificarPrimo(6);
        assertFalse(resultado7);
        boolean resultado8 = cp.verificarPrimo(1);
        assertFalse(resultado8);
    }

    @Test
    void testarClassificar(){
        ClassificarAluno cla = new ClassificarAluno();
        String resultado9 = cla.classificarAluno(4);
        assertEquals("Reprovado", resultado9);
        String resultado10 = cla.classificarAluno(5);
        assertEquals("Recuperação", resultado10);
        String resultado11 = cla.classificarAluno(7);
        assertEquals("Aprovado", resultado11);
    }

    @Test
    void CalcularGeometria(){
        CalcularGeometria cg = new CalcularGeometria();
        double resultado12 = cg.calcularQuadrado(2, 2);
        assertEquals(4, resultado12);
        double resultado13 = cg.calcularTriangulo(3, 10);
        assertEquals(15, resultado13);

    }
}
