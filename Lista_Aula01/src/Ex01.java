//1. Escreva um programa que leia dois vetores inteiros com dez posições cada. A partir desses vetores, carregue um terceiro vetor onde o valor
//de cada elemento será a média dos elementos de mesmo índice nos dois vetores anteriores.

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        double[] vetor3 = new double[10];

        Scanner scn = new Scanner(System.in);

        for (int i = 0; i < 10; i++){
            System.out.println("Digite o " + (i + 1) + " número para ser armazenado no vetor 1: ");
            vetor1[i] = scn.nextInt();
        }
        for (int i = 0; i < 10; i++){
            System.out.println("Digite o " + (i + 1) + " número para ser armazenado no vetor 2: ");
            vetor2[i] = scn.nextInt();
        }
        for (int i = 0; i < 10; i++){
            vetor3[i] = (double) (vetor1[i] + vetor2[i]) / 2;
        }
        System.out.print("Vetor resultante: {");
        for (int i = 0; i < vetor3.length; i++) {
            System.out.print(vetor3[i]);
            if (i < vetor3.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}

