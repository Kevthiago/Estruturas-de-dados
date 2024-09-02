//Escreva um programa que leia 10 valores inteiros, informados pelo usuário e
//armazene-os em um vetor. Após isso, lendo o vetor uma única vez e sem criar
//outros vetores, mostre na tela a média dos valores armazenados no vetor
//ponderados pelos índices nos quais estão armazenados.

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int[] vetor1 = new int[10];

        int somaIndices = 0;
        double somaPonderada = 0;

        System.out.println("Digite 10 números para preencher o vetor:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Número " + (i + 1) + ": ");
            vetor1[i] = scn.nextInt();

            somaPonderada = somaPonderada + vetor1[i] * i; //Ou poderia fazer o +=
            somaIndices = somaIndices + i; //Ou poderia fazer o +=

        }
        double mediaPonderada = somaPonderada / somaIndices;
        System.out.println("Média Ponderada: " + mediaPonderada);
    }
}
