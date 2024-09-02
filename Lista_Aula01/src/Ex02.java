//2. Escreva um programa que carregue um vetor inteiro de cem posições com números aleatórios entre 0 e 100. Percorrendo o vetor criado
//apenas uma vez, imprima a posição onde ocorre o menor o valor, a soma dos números armazenados e preencha os valores de um novo vetor
//com metade do tamanho do vetor original onde a primeira posição do novo vetor é igual à soma da primeira e da última posição do vetor
//original. A segunda posição do novo vetor é a soma da segunda e da penúltima posição do vetor original e assim em diante.

import java.util.Random;

public class Ex02 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] vetor1 = new int[100];

        for (int i = 0; i < vetor1.length; i ++){
            vetor1[i] = random.nextInt() * 100;
        }







        System.out.print("Vetor resultante: {");
        for (int i = 0; i < vetor1.length; i++) {
            System.out.print(vetor1[i]);
            if (i < vetor1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}
