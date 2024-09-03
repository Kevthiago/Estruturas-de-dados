// Escreva um programa que ordene um vetor de tamanho arbitrário preenchido com números aleatórios e execute a pesquisa por um valor
//passado como parâmetro utilizando o algoritmo da busca binária.

import java.util.Random;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        // Instância do gerador de números aleatórios
        Random random = new Random();
        int min = 0; // Valor mínimo para os números aleatórios
        int max = 100; // Valor máximo para os números aleatórios

        // Criação de um vetor de inteiros com 20 posições
        int[] vetorInicial = new int[20];

        // Preenchimento do vetor com números aleatórios e impressão do vetor desordenado
        System.out.print("Vetor desordenado: [");
        for (int i = 0; i < vetorInicial.length; i++) {
            vetorInicial[i] = random.nextInt(max - min + 1) + min;
            System.out.print(vetorInicial[i]);
            if (i < vetorInicial.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // Ordenação do vetor usando o algoritmo de ordenação por bolha
        for (int i = 0; i < vetorInicial.length - 1; i++) {
            for (int j = 0; j < vetorInicial.length - 1 - i; j++) {
                if (vetorInicial[j] > vetorInicial[j + 1]) {
                    // Troca de posições
                    int aux = vetorInicial[j];
                    vetorInicial[j] = vetorInicial[j + 1];
                    vetorInicial[j + 1] = aux;
                }
            }
        }

        // Impressão do vetor ordenado
        System.out.print("Vetor ordenado: [");
        for (int i = 0; i < vetorInicial.length; i++) {
            System.out.print(vetorInicial[i]);
            if (i < vetorInicial.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // Leitura do número a ser buscado
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para realizar a busca binária: ");
        int numLido = scanner.nextInt();

        // Executando a busca binária
        int resultado = buscaBinaria(vetorInicial, numLido);

        // Verificando o resultado da busca
        if (resultado != -1) {
            System.out.println("O número " + numLido + " existe no vetor, na posição: " + resultado);
        } else {
            System.out.println("O número " + numLido + " não foi encontrado no vetor.");
        }

        // Fechando o scanner
        scanner.close();
    }

    // Método para busca binária
    public static int buscaBinaria(int[] vetor, int valor) {
        int posicaoInicial = 0;
        int posicaoFinal = vetor.length - 1;

        while (posicaoInicial <= posicaoFinal) {
            // Calcula a posição do meio do vetor
            int meio = posicaoInicial + (posicaoFinal - posicaoInicial) / 2;

            // Verifica se o valor está no meio
            if (vetor[meio] == valor) {
                return meio;
            }
            // Ajusta a posição inicial para a metade superior
            else if (vetor[meio] < valor) {
                posicaoInicial = meio + 1;
            }
            // Ajusta a posição final para a metade inferior
            else {
                posicaoFinal = meio - 1;
            }
        }
        // Retorna -1 se o valor não for encontrado
        return -1;
    }
}
