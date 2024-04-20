package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.StringUtil;

public class StringUtilTest {

    @Test
    void inverterString(){
        String resultado = StringUtil.inverterString("ola");
        assertEquals("alo", resultado);
    }
    
    @Test
    void contarVogais(){
        int resultado2 = StringUtil.contarVogais("caio");
        assertEquals(3, resultado2);
    }

    @Test
    void isPalindromo(){
        boolean resultado3 = StringUtil.isPalindromo("pedro");
        assertTrue(resultado3);

    }
}
