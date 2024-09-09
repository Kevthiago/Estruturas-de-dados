//Escreva um programa que receba um número inteiro 2 ≤ 𝑁 ≤ 5, crie uma
//matriz quadrada 𝑁 × 𝑁, preencha a matriz com valores de 1 até 𝑁2, calcule o
//quadrado da matriz criada e exiba o resultado na tela.

import java.util.Scanner;
import java.util.Random;

public class Ex07 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Cria um objeto Random para gerar números aleatórios
        Random random = new Random();

        // Solicita ao usuário que insira um número inteiro entre 2 e 5
        System.out.println("Digite um número inteiro (N) entre 2 (inclusive) e 5 (inclusive): ");
        int num = scanner.nextInt();  // Lê o número digitado pelo usuário

        // Verifica se o número está no intervalo especificado
        if (num >= 2 && num <= 5) {
            // Declara e inicializa uma matriz quadrada de tamanho N x N
            int[][] matrizN = new int[num][num];

            // Preenche a matriz com valores aleatórios de 1 até N²
            for (int i = 0; i < matrizN.length; i++) {
                for (int j = 0; j < matrizN.length; j++) {
                    // Gera um número aleatório entre 1 e N² (inclusive)
                    matrizN[i][j] = random.nextInt(1, num * num + 1);
                }
            }

            // Exibe a matriz preenchida com valores aleatórios
            System.out.println("Preenchendo a matriz com valores de 1 até N²:");
            for (int i = 0; i < matrizN.length; i++) {
                for (int j = 0; j < matrizN[i].length; j++) {
                    // Imprime cada elemento da matriz
                    System.out.print(matrizN[i][j] + " ");
                }
                // Quebra de linha após imprimir cada linha da matriz
                System.out.println();
            }

            // Calcula o quadrado da matriz (multiplicando a matriz por ela mesma)
            int[][] matrizQuadrada = quadradoDaMatriz(matrizN);

            // Exibe a matriz resultante após o cálculo do quadrado
            System.out.println("Calculando o quadrado da MatrizN:");
            for (int i = 0; i < matrizQuadrada.length; i++) {
                for (int j = 0; j < matrizQuadrada[i].length; j++) {
                    // Imprime cada elemento da matriz quadrada
                    System.out.print(matrizQuadrada[i][j] + " ");
                }
                // Quebra de linha após imprimir cada linha da matriz
                System.out.println();
            }

        } else {
            // Mensagem de erro se o número não estiver entre 2 e 5
            System.out.println("Número diferente dos requisitados.");
        }

        // Fecha o scanner para evitar vazamento de recursos
        scanner.close();
    }

    // Função que calcula o quadrado de uma matriz (multiplicação de matriz por ela mesma)
    public static int[][] quadradoDaMatriz(int[][] matriz) {
        int n = matriz.length;  // Obtém o tamanho da matriz (número de linhas/colunas)
        int[][] resultado = new int[n][n];  // Cria uma nova matriz para armazenar o resultado

        // Realiza a multiplicação de matrizN * matrizN
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                resultado[i][j] = 0;  // Inicializa o elemento do resultado em 0
                for (int k = 0; k < n; k++) {
                    // Calcula o produto dos elementos correspondentes e soma ao resultado
                    resultado[i][j] += matriz[i][k] * matriz[k][j];
                }
            }
        }

        // Retorna a matriz resultante
        return resultado;
    }
}


