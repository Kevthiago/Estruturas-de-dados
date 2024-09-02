//Escreva um programa que crie um vetor de números inteiros, receba 10 valores
//informados pelo usuário, imprima todos os valores pares e depois todos os
//valores ímpares.

import java.util.ArrayList;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        int[] vetor1 = new int[10];

        Scanner scn = new Scanner(System.in);

        ArrayList<Integer> vetorPares = new ArrayList<>();
        ArrayList<Integer> vetorImpares = new ArrayList<>();

        System.out.println("Digite 10 números para preencher o vetor:");
        for (int i = 0; i < 10; i++){
            System.out.println("Número " + (i + 1) + ": ");
            vetor1[i] = scn.nextInt();

            if (vetor1[i] % 2 == 0){
                vetorPares.add(vetor1[i]);
            } else {
                vetorImpares.add(vetor1[i]);
            }
        }
        System.out.println("Pares: " + vetorPares);
        System.out.println("Impares: " + vetorImpares);
    }
}
