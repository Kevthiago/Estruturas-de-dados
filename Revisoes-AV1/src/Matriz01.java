import java.util.Random; // Importa a classe Random para gerar números aleatórios

public class Matriz01 {
    public static void main(String[] args) {
        Random random = new Random(); // Cria uma instância da classe Random

        int[][] notas = new int[5][4]; // Declara uma matriz para armazenar as notas de 5 alunos em 4 disciplinas

        // Arrays para armazenar a soma das notas de cada aluno e de cada disciplina
        int[] somaAlunos = new int[notas.length]; // Um array para somar as notas de cada aluno
        int[] somaDisciplinas = new int[notas[0].length]; // Um array para somar as notas de cada disciplina

        System.out.println("[ "); // Início da impressão da matriz
        for (int i = 0; i < notas.length; i++) { // Loop para cada aluno
            System.out.print("  [ "); // Início da linha para cada aluno
            for (int j = 0; j < notas[i].length; j++) { // Loop para cada disciplina do aluno
                notas[i][j] = random.nextInt(11); // Preenche a nota com um número aleatório entre 0 e 10
                System.out.print(notas[i][j]); // Imprime a nota

                // Adiciona vírgula entre as notas, mas não no final da linha
                if (j < notas[i].length - 1) {
                    System.out.print(", ");
                }
                somaAlunos[i] += notas[i][j]; // Acumula a soma das notas do aluno
                somaDisciplinas[j] += notas[i][j]; // Acumula a soma das notas da disciplina
            }
            System.out.println(" ]"); // Fecha a linha para cada aluno
        }
        System.out.println("]"); // Fecha a impressão da matriz

        // Cálculo e impressão das médias de cada aluno
        for (int i = 0; i < somaAlunos.length; i++) {
            double mediaAluno = (double) somaAlunos[i] / notas[i].length; // Calcula a média do aluno
            System.out.printf("Média do Aluno %d é: %.2f%n", (i + 1), mediaAluno); // Imprime a média formatada
        }

        // Cálculo e impressão das médias de cada disciplina
        for (int j = 0; j < somaDisciplinas.length; j++) {
            double mediaDisciplina = (double) somaDisciplinas[j] / notas.length; // Calcula a média da disciplina
            System.out.printf("Média da Disciplina %d é: %.2f%n", (j + 1), mediaDisciplina); // Imprime a média formatada
        }
    }
}
