//Escreva um programa que calcule a multiplicação entre duas matrizes quaisquer.
//Seu programa deve determinar se é possível executar a multiplicação, e mostrar
//o resultado do cálculo para os casos possíveis. Quando não for possível efetuar a
//operação, uma mensagem deve ser exibida na tela.

import java.util.Random;
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int num1, num2, num3, num4;

        System.out.println("Digite o tamanho de LINHAS da matriz 1: ");
        num1 = scanner.nextInt();
        System.out.println("Digite o tamanho de COLUNAS da matriz 1: ");
        num2 = scanner.nextInt();
        System.out.println("Digite o tamanho de LINHAS da matriz 2: ");
        num3 = scanner.nextInt();
        System.out.println("Digite o tamanho de COLUNAS da matriz 2: ");
        num4 = scanner.nextInt();

        int[][] matriz1 = new int[num1][num2];
        int[][] matriz2 = new int[num3][num4];

        // Preenche a matriz1 com valores aleatórios de 0 até 10
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matriz1[i][j] = random.nextInt(0, 10);
            }
        }

        // Exibe a matriz1
        System.out.println("Preenchendo a matriz 1 com valores de 0 a 10:");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println();
        }

        // Preenche a matriz2 com valores aleatórios de 0 até 10
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                matriz2[i][j] = random.nextInt(0, 10);
            }
        }

        // Exibe a matriz2
        System.out.println("Preenchendo a matriz 2 com valores de 0 a 10:");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println();
        }
    }
}

