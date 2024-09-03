//Crie uma matriz bidimensional quadrada para armazenar 9 valores inteiros
//informados pelo usuário. Depois, calcule e mostre na tela o determinante da
//matriz.

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaração de uma matriz bidimensional de inteiros de 3x3
        int[][] matriz1 = new int[3][3];

        // Preenchimento da matriz com valores informados pelo usuário
        for (int i = 0; i < 3; i++) { // Loop para percorrer as linhas
            for (int j = 0; j < 3; j++) { // Loop para percorrer as colunas
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                matriz1[i][j] = scanner.nextInt(); // Lê o valor inserido pelo usuário e armazena na matriz
            }
        }

        // Exibição da matriz 3x3 gerada
        System.out.println("Matriz 3x3 gerada: ");
        for (int i = 0; i < 3; i++) { // Loop para percorrer as linhas
            for (int j = 0; j < 3; j++) { // Loop para percorrer as colunas
                System.out.print(matriz1[i][j] + " "); // Exibe o valor da posição atual
            }
            System.out.println(); // Pula para a próxima linha após imprimir todos os elementos da linha atual
        }

        scanner.close(); // Fecha o Scanner para liberar recursos

        // Cálculo do determinante da matriz 3x3 usando a Regra de Sarrus
        // Fórmula do determinante:
        // a*e*i + b*f*g + c*d*h - (c*e*g + a*f*h + b*d*i)
        int determinante = matriz1[0][0] * (matriz1[1][1] * matriz1[2][2] - matriz1[1][2] * matriz1[2][1])
                - matriz1[0][1] * (matriz1[1][0] * matriz1[2][2] - matriz1[1][2] * matriz1[2][0])
                + matriz1[0][2] * (matriz1[1][0] * matriz1[2][1] - matriz1[1][1] * matriz1[2][0]);

        // Exibição do determinante calculado
        System.out.println("Determinante da matriz: " + determinante);
    }
}

