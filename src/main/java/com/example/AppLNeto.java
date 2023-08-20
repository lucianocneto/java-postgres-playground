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
       double vetor[] = {10, 20, 30, 40, 50, 60};
    
       System.out.println(Arrays.toString(vetor));

       System.out.println("Valor da posicao 0: "+vetor[0]);
       System.out.println("Valor da posicao 1: "+vetor[1]);
       System.out.println("Valor da posicao 2: "+vetor[2]);
       System.out.println("Valor da posicao 3: "+vetor[3]);
       System.out.println("Valor da posicao 4: "+vetor[4]);
       System.out.println("Valor da posicao 5: "+vetor[5]);

       vetor[0] = 1;
       System.out.println("Valor da posicao 0: "+vetor[0]);
    
    //trabalhando com matrizes
       double vetorDouble1[] = {1, 2, 3};
       double vetorDouble2[] = vetorDouble1;

       System.out.println("VetorDouble3: "+ Arrays.toString(vetorDouble2));

       int vetor3[] = new int[4];
       vetor3[0] = 100;
       vetor3[1] = 200;
       vetor3[2] = 300;
       vetor3[3] = 400;

       System.out.println("Vetor3: "+Arrays.toString(vetor3));

    
       System.out.println(Arrays.toString(vetor));

       System.out.println("Valor da posicao 0: "+vetor[0]);
       System.out.println("Valor da posicao 1: "+vetor[1]);
       System.out.println("Valor da posicao 2: "+vetor[2]);
       System.out.println("Valor da posicao 3: "+vetor[3]);
       System.out.println("Valor da posicao 4: "+vetor[4]);
       System.out.println("Valor da posicao 5: "+vetor[5]);

       vetor[0] = 1;
       System.out.println("Valor da posicao 0: "+vetor[0]);
    

    }
     
}
