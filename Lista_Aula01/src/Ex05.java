//5. Implemente dois algoritmos que ordenem os elementos de um vetor em ordem crescente e compare o número de trocas que eles efetuam
//durante a ordenação de:
//a) um vetor criado com os números de 1 até 100 aleatoriamente distribuídos.
//b) um vetor criado com os números de 1 até 100 ordenados em ordem decrescente.

import java.util.Random;

public class Ex05 {
    public static void main(String[] args) {

        Random random = new Random();

        // Criação de dois vetores de tamanho 100
        int[] vetorAleatorio = new int[100];
        int[] vetorDescrescente = new int[100];

        // Preenchendo o vetor aleatório desordenado
        System.out.print("Vetor Aleatório Desordenado:\n[");
        for (int i = 0; i < vetorAleatorio.length; i++) {
            // Gera um número aleatório entre 0 e 100
            vetorAleatorio[i] = random.nextInt(101);
            // Imprime o valor gerado
            System.out.print(vetorAleatorio[i]);
            if (i < vetorAleatorio.length - 1) {
                // Adiciona uma vírgula e espaço para separação
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // Preenchendo o vetor com números aleatórios e ordenando de forma decrescente
        for (int i = 0; i < vetorDescrescente.length; i++) {
            int valor = random.nextInt(101);
            vetorDescrescente[i] = valor;

            // Inserção ordenada decrescente (similar a um Insertion Sort em ordem decrescente)
            for (int j = i; j > 0 && vetorDescrescente[j] > vetorDescrescente[j - 1]; j--) {
                int temp = vetorDescrescente[j];
                vetorDescrescente[j] = vetorDescrescente[j - 1];
                vetorDescrescente[j - 1] = temp;
            }
        }

        // Imprimindo o vetor ordenado de forma decrescente
        System.out.print("\nVetor Aleatório Decrescente:\n[");
        for (int i = 0; i < vetorDescrescente.length; i++) {
            System.out.print(vetorDescrescente[i]);
            if (i < vetorDescrescente.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // Ordenação do vetor aleatório desordenado usando o algoritmo Bubble Sort
        int trocasDesordenado = 0;  // Contador de trocas
        for (int i = 0; i < vetorAleatorio.length - 1; i++) {
            for (int j = 0; j < vetorAleatorio.length - 1 - i; j++) {
                if (vetorAleatorio[j] > vetorAleatorio[j + 1]) {
                    // Troca de posições para ordenar em ordem crescente
                    int aux = vetorAleatorio[j];
                    vetorAleatorio[j] = vetorAleatorio[j + 1];
                    vetorAleatorio[j + 1] = aux;
                    trocasDesordenado++;  // Incrementa o contador de trocas
                }
            }
        }

        // Impressão do vetor aleatório agora ordenado de forma crescente
        System.out.print("\nVetor Aleatório Desordenado ordenado de forma crescente:\n[");
        for (int i = 0; i < vetorAleatorio.length; i++) {
            System.out.print(vetorAleatorio[i]);
            if (i < vetorAleatorio.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // Ordenação do vetor decrescente usando o algoritmo Bubble Sort para ordem crescente
        int trocasDecrescente = 0;  // Contador de trocas
        for (int i = 0; i < vetorDescrescente.length - 1; i++) {
            for (int j = 0; j < vetorDescrescente.length - 1 - i; j++) {
                if (vetorDescrescente[j] > vetorDescrescente[j + 1]) {
                    // Troca de posições para ordenar em ordem crescente
                    int aux = vetorDescrescente[j];
                    vetorDescrescente[j] = vetorDescrescente[j + 1];
                    vetorDescrescente[j + 1] = aux;
                    trocasDecrescente++;  // Incrementa o contador de trocas
                }
            }
        }

        // Impressão do vetor decrescente agora ordenado de forma crescente
        System.out.print("\nVetor Aleatório Decrescente ordenado de forma crescente:\n[");
        for (int i = 0; i < vetorDescrescente.length; i++) {
            System.out.print(vetorDescrescente[i]);
            if (i < vetorDescrescente.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // Impressão do número de trocas realizadas durante a ordenação
        System.out.println("Após realizar a ordenação crescente:");
        System.out.println("Número de trocas do Vetor Aleatório Desordenado: " + trocasDesordenado);
        System.out.println("Número de trocas do Vetor Aleatório Decrescente: " + trocasDecrescente);
    }
}

