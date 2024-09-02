//Leia um valor X. Coloque este valor na primeira posição de um vetor N de 100
//posições. Em cada posição subsequente de N (1 até 99), coloque a metade do
//valor armazenado na posição anterior, conforme o exemplo abaixo. Imprima o
//vetor N.

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        double[] vetorN = new double[100];

        System.out.println("Digite um valor para a primeira posição do Vetor: ");
        vetorN[0] = scn.nextInt();

        System.out.println("Vetor Resultante: [");
        for (int i = 1; i < 100; i++ ){
            vetorN[i] = vetorN[i - 1] / 2;
            System.out.println(vetorN[i]);
            if (vetorN[i] < vetorN.length - 1){
                System.out.println(", ");
            }
        }
        System.out.println("]");
    }
}
