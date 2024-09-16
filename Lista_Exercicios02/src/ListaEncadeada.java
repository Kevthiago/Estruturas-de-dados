//1. Implemente a classe ListaEncadeada utilizando um arranjo de inteiros para armazenar os elementos da lista.
//2. Crie um método para criar uma lista vazia.
//3. Crie um método responsável por inserir um elemento no início da lista.
//4. Crie um método responsável por inserir um elemento no fim da lista.
//5. Crie um método responsável por inserir um elemento em uma posição específica da lista.
//6. Crie um método responsável por remover um elemento no início da lista.
//7. Crie um método responsável por remover um elemento no fim da lista.
//8. Crie um método responsável por remover um elemento em uma posição específica da lista.
//9. Crie um método responsável por remover um elemento específico da lista.
//10. Crie um método para exibir o conteúdo de uma lista.
//11. Crie um método para pesquisar por um elemento específico em uma lista e informar, caso o elemento exista, a posição na qual ele está armazenado.
//12. Crie um método que retorne o número de elementos existentes na lista.


public class ListaEncadeada {
    private int[] elementos; // Array para armazenar os elementos da lista
    private int tamanho;     // Controla quantos elementos estão na lista

    // Construtor que inicializa a lista com a capacidade fornecida
    public ListaEncadeada(int capacidade) {
        elementos = new int[capacidade]; // Cria um array com o tamanho especificado
        tamanho = 0; // A lista começa vazia, então o tamanho é 0
    }

    // Método para "esvaziar" a lista, apenas ajusta o tamanho para 0
    public void criarListaVazia() {
        tamanho = 0; // Indica que não há elementos, mas o array permanece o mesmo
    }

    // Insere um elemento no início da lista
    public void inserirInicio(int elemento) {
        if (tamanho < elementos.length) { // Verifica se há espaço na lista
            // Desloca todos os elementos uma posição para frente
            for (int i = tamanho; i > 0; i--) {
                elementos[i] = elementos[i - 1];
            }
            // Insere o novo elemento na posição 0
            elementos[0] = elemento;
            tamanho++; // Aumenta o contador de elementos
        }
    }

    // Insere um elemento no fim da lista
    public void inserirFim(int elemento) {
        if (tamanho < elementos.length) { // Verifica se há espaço na lista
            elementos[tamanho] = elemento; // Insere o elemento na última posição disponível
            tamanho++; // Aumenta o contador de elementos
        }
    }

    // Insere um elemento em uma posição específica
    public void inserirPosicaoEspecifica(int posicao, int elemento) {
        // Verifica se a posição é válida e se há espaço na lista
        if (posicao >= 0 && posicao <= tamanho && tamanho < elementos.length) {
            // Desloca os elementos da posição dada para frente
            for (int i = tamanho; i > posicao; i--) {
                elementos[i] = elementos[i - 1];
            }
            // Insere o elemento na posição desejada
            elementos[posicao] = elemento;
            tamanho++; // Aumenta o contador de elementos
        }
    }

    // Remove o primeiro elemento da lista
    public void removerInicio() {
        if (tamanho > 0) { // Verifica se a lista não está vazia
            // Desloca todos os elementos uma posição para trás
            for (int i = 0; i < tamanho - 1; i++) {
                elementos[i] = elementos[i + 1];
            }
            tamanho--; // Diminui o contador de elementos
        }
    }

    // Remove o último elemento da lista
    public void removerFim() {
        if (tamanho > 0) { // Verifica se a lista não está vazia
            tamanho--; // Apenas reduz o tamanho da lista
        }
    }

    // Remove um elemento de uma posição específica
    public void removerPosicaoEspecifica(int posicao) {
        if (posicao >= 0 && posicao < tamanho) { // Verifica se a posição é válida
            // Desloca os elementos da posição dada para trás
            for (int i = posicao; i < tamanho - 1; i++) {
                elementos[i] = elementos[i + 1];
            }
            tamanho--; // Diminui o contador de elementos
        }
    }

    // Remove um elemento específico da lista
    public void removerElementoEspecifico(int elemento) {
        // Busca a posição do elemento
        int posicao = -1;
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i] == elemento) { // Se encontrar o elemento
                posicao = i; // Armazena a posição
                break;
            }
        }
        // Se o elemento foi encontrado, remove-o
        if (posicao != -1) {
            removerPosicaoEspecifica(posicao);
        }
    }

    // Exibe o conteúdo da lista
    public void exibirConteudo() {
        for (int i = 0; i < tamanho; i++) {
            System.out.print(elementos[i] + " "); // Exibe cada elemento seguido por um espaço
        }
        System.out.println(); // Quebra de linha após exibir todos os elementos
    }

    // Pesquisa por um elemento e informa sua posição, caso exista
    public void pesquisarElementoDescreverPosicao(int elemento) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i] == elemento) { // Se o elemento for encontrado
                System.out.println("Elemento encontrado na posição: " + i);
                return; // Encerra a busca
            }
        }
        // Se não encontrar o elemento
        System.out.println("Elemento não encontrado.");
    }

    // Retorna o número de elementos presentes na lista
    public void numeroElementosLista() {
        System.out.println("Número de elementos na lista: " + tamanho); // Exibe o tamanho da lista
    }

    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada(10);

        lista.inserirInicio(5);
        lista.exibirConteudo();

        lista.inserirFim(7);
        lista.exibirConteudo();

        lista.inserirPosicaoEspecifica(1, 9);
        lista.exibirConteudo();

        lista.removerInicio();
        lista.exibirConteudo();

        lista.removerFim();
        lista.exibirConteudo();

        lista.removerElementoEspecifico(5);
        lista.exibirConteudo();

        lista.pesquisarElementoDescreverPosicao(7);
        lista.pesquisarElementoDescreverPosicao(9);

        lista.numeroElementosLista();
    }
}
