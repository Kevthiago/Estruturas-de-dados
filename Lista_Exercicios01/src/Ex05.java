//Faça um programa que leia um valor e apresente o número de Fibonacci
//correspondente a este valor lido. Lembre-se que os 2 primeiros elementos da
//série de Fibonacci são 0 e 1 e cada próximo termo é a soma dos 2 anteriores a
//ele. Todos os valores de Fibonacci calculados neste problema devem caber em
//um inteiro de 64 bits sem sinal.

import java.util.Scanner;

// Classe principal do programa
public class Ex05 {
    public static void main(String[] args) {
        // Criação de um objeto Scanner para leitura de dados do usuário
        Scanner scn = new Scanner(System.in);

        // Definindo a constante 'n' que representa o maior índice para calcular Fibonacci
        final int n = 93;

        // Criação de um array de long para armazenar os valores da sequência de Fibonacci
        // O array tem tamanho n + 1 porque os índices começam em 0
        long[] vetorFibonacci = new long[n + 1];

        // Inicializando os dois primeiros elementos da sequência de Fibonacci
        vetorFibonacci[0] = 0;  // Fibonacci(0) = 0
        vetorFibonacci[1] = 1;  // Fibonacci(1) = 1

        // Loop para calcular os valores de Fibonacci de 2 até n (93)
        for (int i = 2; i <= n; i++) {
            // Cada elemento é a soma dos dois anteriores
            vetorFibonacci[i] = vetorFibonacci[i - 1] + vetorFibonacci[i - 2];
        }

        // Solicita ao usuário que insira um número entre 0 e 93
        System.out.println("Digite um número entre 0 e 93 para descobrir seu correspondente em Fibonacci: ");
        int numLido = scn.nextInt();  // Lê o número inserido pelo usuário

        // Verifica se o número lido está dentro do intervalo permitido
        if (numLido >= 0 && numLido <= 93) {
            // Se estiver no intervalo, imprime o valor de Fibonacci correspondente
            System.out.println("Fibonacci(" + numLido + ") = " + vetorFibonacci[numLido]);
        } else {
            // Se não estiver no intervalo, imprime uma mensagem de erro
            System.out.println("Insira um número dentro do intervalo permitido (0 a 93)!");
        }

        // Fecha o Scanner para liberar o recurso
        scn.close();
    }
}

