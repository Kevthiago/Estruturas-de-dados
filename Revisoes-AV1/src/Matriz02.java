public class Matriz02 {
    public static void main(String[] args) {
        // Cria uma matriz 3x3
        int[][] matriz = new int[3][3];

        // Loop para percorrer cada linha da matriz
        for (int i = 0; i < matriz.length; i++) {
            // Loop para percorrer cada coluna da matriz
            for (int j = 0; j < matriz[i].length; j++) {
                // Verifica se estamos na diagonal principal
                if (i == j) {
                    matriz[i][j] = 1; // Atribui 1 aos elementos da diagonal principal
                }
                // Verifica se estamos na diagonal secundária
                else if (i + j == 2) {
                    matriz[i][j] = 3; // Atribui 3 aos elementos da diagonal secundária
                }
                // Se não estivermos em nenhuma das diagonais
                else {
                    matriz[i][j] = 0; // Atribui 0 aos demais elementos
                }
            }
        }

        // Imprimindo a matriz formatada
        System.out.print("[");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("  [ "); // Início da linha para cada sub-array
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]); // Imprime o elemento atual

                // Adiciona vírgula entre os elementos, exceto após o último
                if (j < matriz[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.print(" ]"); // Fecha a linha para cada sub-array
            if (i < matriz.length - 1) {
                System.out.print(", "); // Adiciona vírgula entre as linhas da matriz
            }
        }
        System.out.println(" ]"); // Fecha a matriz
    }
}
