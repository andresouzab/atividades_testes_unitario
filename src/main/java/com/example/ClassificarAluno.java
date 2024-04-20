package com.example;

public class ClassificarAluno {
    public String classificarAluno(double nota) {
        String classificacao;
        if (nota < 5) {
        classificacao = "Reprovado";
        } else if (nota >= 5 && nota < 7) {
        classificacao = "Recuperação";
        } else {
        classificacao = "Aprovado";
        }
        return classificacao;
        }
        
    
}
