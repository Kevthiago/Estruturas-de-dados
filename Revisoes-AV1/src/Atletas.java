import java.util.Random;

public class Atletas {
    public static void main(String[] args) {
        // Criando uma instância da classe Random para gerar números aleatórios
        Random random = new Random();

        // Declarando arrays que vão armazenar as pontuações de 5 atletas, cada um com 10 notas
        int[] atleta1 = new int[10];
        int[] atleta2 = new int[10];
        int[] atleta3 = new int[10];
        int[] atleta4 = new int[10];
        int[] atleta5 = new int[10];

        // Preenchendo as pontuações de cada atleta com valores aleatórios (0 a 10)
        preencherPontuacao(random, atleta1);
        preencherPontuacao(random, atleta2);
        preencherPontuacao(random, atleta3);
        preencherPontuacao(random, atleta4);
        preencherPontuacao(random, atleta5);

        // Arrays para armazenar as médias calculadas e os nomes dos atletas
        double[] medias = new double[5];  // Um array para guardar as médias dos 5 atletas
        String[] nomesAtletas = {"Atleta 1", "Atleta 2", "Atleta 3", "Atleta 4", "Atleta 5"};  // Array com os nomes dos atletas

        // Calculando as médias de cada atleta e armazenando no array de médias
        medias[0] = processarAtleta(atleta1, "Atleta 1");  // Calcula média e imprime resultados para Atleta 1
        medias[1] = processarAtleta(atleta2, "Atleta 2");  // Calcula média e imprime resultados para Atleta 2
        medias[2] = processarAtleta(atleta3, "Atleta 3");  // Calcula média e imprime resultados para Atleta 3
        medias[3] = processarAtleta(atleta4, "Atleta 4");  // Calcula média e imprime resultados para Atleta 4
        medias[4] = processarAtleta(atleta5, "Atleta 5");  // Calcula média e imprime resultados para Atleta 5

        // Chama o método para identificar qual atleta teve a maior média
        String atletaComMaiorMedia = calcularMaiorMedia(medias, nomesAtletas);

        // Exibe o nome do atleta com a maior média
        System.out.println("Atleta com maior média: " + atletaComMaiorMedia);
    }

    // Método para preencher as pontuações de um atleta de forma aleatória
    private static void preencherPontuacao(Random random, int[] atleta) {
        // Preenche o array de pontuações do atleta com valores aleatórios entre 0 e 10
        for (int i = 0; i < atleta.length; i++) {
            atleta[i] = random.nextInt(11);  // Gera um número entre 0 e 10 e armazena no array
        }
    }

    // Método que processa os dados de um atleta: calcula e exibe a média, menor e maior pontuação
    private static double processarAtleta(int[] atleta, String nomeAtleta) {
        int soma = 0;  // Variável para acumular a soma das pontuações
        int menorValor = Integer.MAX_VALUE;  // Inicializa com o maior valor possível para encontrar o menor
        int maiorValor = Integer.MIN_VALUE;  // Inicializa com o menor valor possível para encontrar o maior

        // Loop para percorrer as pontuações do atleta
        for (int i = 0; i < atleta.length; i++) {
            soma += atleta[i];  // Soma as pontuações para depois calcular a média

            // Atualiza o menor valor encontrado
            if (atleta[i] < menorValor) {
                menorValor = atleta[i];
            }

            // Atualiza o maior valor encontrado
            if (atleta[i] > maiorValor) {
                maiorValor = atleta[i];
            }
        }

        // Calcula a média das pontuações
        double media = (double) soma / atleta.length;

        // Exibe os resultados (média, menor e maior pontuação)
        System.out.println(nomeAtleta + " - Média: " + media);
        System.out.println(nomeAtleta + " - Menor Pontuação: " + menorValor);
        System.out.println(nomeAtleta + " - Maior Pontuação: " + maiorValor);
        System.out.println();  // Linha em branco para separar a saída

        // Retorna a média calculada para ser armazenada no array de médias
        return media;
    }

    // Método que calcula qual atleta teve a maior média
    public static String calcularMaiorMedia(double[] medias, String[] nomesAtletas) {
        double maiorMedia = medias[0];  // Inicializa com a primeira média do array
        String atletaMaiorMedia = nomesAtletas[0];  // Inicializa com o primeiro atleta

        // Loop para encontrar a maior média
        for (int i = 1; i < medias.length; i++) {  // Começa do índice 1, pois já inicializamos com o índice 0
            if (medias[i] > maiorMedia) {  // Se encontrar uma média maior
                maiorMedia = medias[i];  // Atualiza o valor da maior média
                atletaMaiorMedia = nomesAtletas[i];  // Atualiza o nome do atleta com a maior média
            }
        }

        System.out.println("Maior média: " + maiorMedia);
        // Retorna o nome do atleta que obteve a maior média
        return atletaMaiorMedia;
    }
}
