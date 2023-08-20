package com.example;

public class AppLNeto {
    public static void main(String[] args) {
        System.out.println("Minha App Java\n");

        //byte idade = 128;
        int aniversario = 127;
        byte idade = (byte)aniversario; //conversao de inteiro pra byte
        //byte aceita de 1 a 127

        double peso = 88.5;
        System.out.println("Idade é: "+idade+" Peso é: "+peso);

        char sexo = 'M';
        System.out.println("Sexo do participante é: "+sexo);

        boolean pessoaPcD = true;
        //case pessoaPcD = true {
        //    'Sim'
        //}

        System.out.println("Pessoa com necessidades especiais? "+pessoaPcD);
    }
}
