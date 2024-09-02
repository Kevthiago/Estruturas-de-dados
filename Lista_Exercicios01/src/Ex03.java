//Leia um valor e faça um programa que coloque o valor lido na primeira posição
//de um vetor de 10 posições. Em cada posição subsequente, coloque o dobro do
//valor da posição anterior. Por exemplo, se o valor lido for 1, os valores do vetor
//devem ser 1, 2, 4, 8 e assim sucessivamente. Mostre o vetor em seguida.

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int[] vetor1 = new int[10];

        System.out.println("Digite um valor para a primeira posição do vetor: ");
        int valor = scn.nextInt();
        vetor1[0] = valor;

        for (int i = 1; i < 10; i++){
            vetor1[i] = vetor1[i - 1] * 2;
        }
        System.out.print("Vetor resultante: [");
        for (int i = 0; i < vetor1.length; i++) {
            System.out.print(vetor1[i]);
            if (i < vetor1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
