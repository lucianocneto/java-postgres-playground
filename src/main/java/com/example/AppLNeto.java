package com.example;

import java.util.Arrays;

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
        //boolean é true ou false

        System.out.println("Pessoa com necessidades especiais? "+pessoaPcD);
    
       //trabalhando com vetores
       double vetor[] = {10, 20, 30, 40, 50};
    
       System.out.println(Arrays.toString(vetor));
    
    }
     
}
