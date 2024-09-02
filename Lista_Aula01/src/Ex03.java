//3. Escreva um programa que carregue dois vetores inteiros com 5 posições, sendo um com números pares e o outro com números ímpares. O
//usuário pode digitar os números em qualquer sequência e o programa deverá armazená-los no vetor correto na ordem em que foram informados
//pelo usuário.

import java.util.Arrays;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int numLido; // Variável para armazenar o número lido do usuário

        int contPar = 0; // Contador para o vetor de números pares
        int contImpar = 0; // Contador para o vetor de números ímpares

        int[] pares = new int[5]; // Vetor para armazenar números pares
        int[] impares = new int[5]; // Vetor para armazenar números ímpares

        System.out.println("Digite 10 números para serem armazenados em vetores de pares ou ímpares:");

        // Loop para ler 10 números do usuário
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numLido = scn.nextInt(); // Lê o número digitado pelo usuário

            // Verifica se o número é par ou ímpar
            if (numLido % 2 == 0) {
                // Verifica se ainda há espaço no vetor de pares
                if (contPar < 5) {
                    pares[contPar] = numLido; // Adiciona o número ao vetor de pares
                    contPar++; // Incrementa o contador de pares
                } else {
                    System.out.println("Vetor de pares está cheio. Não é possível adicionar o número " + numLido);
                }
            } else {
                // Verifica se ainda há espaço no vetor de ímpares
                if (contImpar < 5) {
                    impares[contImpar] = numLido; // Adiciona o número ao vetor de ímpares
                    contImpar++; // Incrementa o contador de ímpares
                } else {
                    System.out.println("Vetor de ímpares está cheio. Não é possível adicionar o número " + numLido);
                }
            }
        }

        // Exibe o conteúdo dos vetores de pares e ímpares
        System.out.println("Vetor de pares: " + Arrays.toString(pares));
        System.out.println("Vetor de ímpares: " + Arrays.toString(impares));
    }
}

