//2. Escreva um programa que carregue um vetor inteiro de cem posições com números aleatórios entre 0 e 100. Percorrendo o vetor criado
//apenas uma vez, imprima a posição onde ocorre o menor o valor, a soma dos números armazenados e preencha os valores de um novo vetor
//com metade do tamanho do vetor original onde a primeira posição do novo vetor é igual à soma da primeira e da última posição do vetor
//original. A segunda posição do novo vetor é a soma da segunda e da penúltima posição do vetor original e assim em diante.

import java.util.Random;

public class Ex02 {
    public static void main(String[] args) {
        Random random = new Random();

        int min = 0;
        int max = 100;
        int soma = 0;

        int menorValor = Integer.MAX_VALUE; // Inicializa com o maior valor possível
        String posicoesMenorValor = ""; // Para armazenar todas as posições do menor valor

        int[] vetor1 = new int[100]; // Vetor original de 100 posições


        // Preencher o vetor e calcular a soma, encontrar o menor valor e suas posições
        System.out.print("Vetor 1: [");
        for (int i = 0; i < vetor1.length; i++) {
            // Gera um número aleatório entre 0 e 100 (inclusive)
            vetor1[i] = random.nextInt(max - min + 1) + min;
            soma += vetor1[i]; // Calcula a soma dos elementos

            // Encontrar o menor valor e suas posições
            if (vetor1[i] < menorValor) {
                menorValor = vetor1[i];
                posicoesMenorValor = i + ""; // Inicializa com a primeira posição encontrada
            } else if (vetor1[i] == menorValor) {
                posicoesMenorValor += ", " + i; // Adiciona novas posições com o mesmo valor
            }

            // Impressão dos elementos do vetor em linha única
            System.out.print(vetor1[i]);
            if (i < vetor1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // Exibe todas as posições onde ocorre o menor valor
        System.out.println("Posições onde ocorre o menor valor (" + menorValor + "): " + posicoesMenorValor);
        System.out.println("Soma dos valores do vetor: " + soma);

        // Preencher o vetor resultante de tamanho 50
        int[] vetorResultante = new int[50];
        System.out.print("Vetor resultante: [");
        for (int i = 0; i < vetorResultante.length; i++) {
            vetorResultante[i] = vetor1[i] + vetor1[vetor1.length - 1 - i]; // Soma dos elementos espelhados
            System.out.print(vetorResultante[i]);
            if (i < vetorResultante.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
