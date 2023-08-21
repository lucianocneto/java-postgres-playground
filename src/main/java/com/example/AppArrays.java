package com.example;

import java.util.Arrays;

public class AppArrays {
    public static void main(String[] args) {
        System.out.println("Meu primeiro programa com Vetores e Arrays\n");
    
    
    //trabalhando com matrizes
    double vetorDouble1[] = {4, 5, 6};
    double vetorDouble2[] = vetorDouble1;

    System.out.println("VetorDouble1: "+ Arrays.toString(vetorDouble1));
    //System.out.println("VetorDouble2: "+ Arrays.toString(vetorDouble2));

    int vetor3[] = new int[4];
    vetor3[0] = 100;
    vetor3[1] = 200;
    vetor3[2] = 300;
    vetor3[3] = 400;

    System.out.println("Vetor3: "+Arrays.toString(vetor3));

 
    System.out.println(Arrays.toString(vetor3));

    System.out.println("Valor da posicao 0: "+vetor3[0]);
    System.out.println("Valor da posicao 1: "+vetor3[1]);
    System.out.println("Valor da posicao 2: "+vetor3[2]);
    System.out.println("Valor da posicao 3: "+vetor3[3]);

    vetor3[0] = 1;
    System.out.println("Valor da posicao 0: "+vetor3[0]);
 
    
    
    }
}
