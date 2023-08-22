package com.example;

class Cliente {
    double renda;
    char sexo;
    int anoNascimento;
}

public class AppClasses {

    public static void main(String[] args) {
        System.out.println("Criando classes");
        Cliente cliente = new Cliente();
        System.out.println("Renda: " + cliente.renda);
        System.out.println("Sexo: " + cliente.sexo);
        System.out.println("Ano de Nascimento: " + cliente.anoNascimento);
    }
}
