//Lista de exercícios 03 – Estruturas de Dados
//1. Implemente a classe ListaEncadeada para armazenar valores inteiros referências para ligar os elementos da lista.
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

package Lista;

public class ListaEncadeadaNo<T> {

    private No<T> inicio;
    private No<T> ultimo;
    private int tamanho = 0;

    public int getTamanho(){
        return this.tamanho;
    }

    public void inserirInicio(T elemento){
        No<T> celula = new No<>(elemento);
        celula.setProximo(this.inicio);
        this.inicio = celula;
        if (this.tamanho == 0){
            this.ultimo = celula;
        }
        this.tamanho++;
    }

    public void inserirFinal(T elemento){
        No<T> celula = new No<>(elemento);
        if (this.tamanho == 0){
            this.inicio = celula;
        } else {
            this.ultimo.setProximo(celula);
        }
        this.ultimo = celula;
        this.tamanho++;
    }

    public void inserirQualquer(int posicao, T elemento){
        if (posicao < 0 || posicao > this.tamanho) {
            throw new IllegalArgumentException("Posição Inválida. ");
        }
        if (posicao == 0){
            this.inserirInicio(elemento);
        } else if (posicao == this.tamanho){
            this.inserirFinal(elemento);
        } else {
            No<T> noAnterior = this.buscaNo(posicao - 1);
            No<T> proximoNo = noAnterior.getProximo();
            No<T> novoNo = new No<>(elemento);
            novoNo.setProximo(proximoNo);
            noAnterior.setProximo(novoNo);
            this.tamanho++;
        }
    }

    public T removeInicio(){
        if (this.tamanho == 0){
            throw new RuntimeException("Lista está vazia.");
        }
        T removido = this.inicio.getElemento();
        this.inicio = this.inicio.getProximo();
        if (this.tamanho == 0){
            this.ultimo = null;
        }
        tamanho--;
        return removido;
    }

    public T removeFinal(){
        if (this.tamanho == 0){
            throw new RuntimeException("Lista está vazia.");
        }
        if (this.tamanho == 1){
            return this.removeInicio();
        }
        No<T> penultimoNo = this.buscaNo(this.tamanho - 2);
        T removido = penultimoNo.getProximo().getElemento();
        penultimoNo.setProximo(null);
        this.ultimo = penultimoNo;
        tamanho--;
        return removido;
    }

    public T removeQualquer(int posicao){
        if (posicao < 0 || posicao > this.tamanho) {
            throw new IllegalArgumentException("Posição Inválida. ");
        }
        if (this.tamanho == 0){
            throw new RuntimeException("Lista está vazia.");
        }
        if (posicao == 0){
            return this.removeInicio();
        }
        if (posicao == this.tamanho - 1){
            return this.removeFinal();
        }
        No<T> noAnterior = this.buscaNo(posicao - 1);
        No<T> noAtual = noAnterior.getProximo();
        No<T> noProximo = noAtual.getProximo();
        noAnterior.setProximo(noProximo);
        noAtual.setProximo(null);
        tamanho--;
        return noAtual.getElemento();
    }

    public T removerElemento(T elemento){
        if (this.tamanho == 0){
            throw new RuntimeException("Lista está vazia.");
        }
        if (this.inicio.getElemento().equals(elemento)){
            return this.removeInicio();
        }
        No<T> anterior = null;
        No<T> atual = this.inicio;
        while (atual != null && !atual.getElemento().equals(elemento)){
            anterior = atual;
            atual = atual.getProximo();
        }
        if (atual == null) {
            throw new RuntimeException("Elemento não encontrado na lista.");
        }
        anterior.setProximo(atual.getProximo());
        if (atual == this.ultimo) {
            this.ultimo = anterior;
        }

        this.tamanho--;
        return atual.getElemento();
    }

    public String verificarExistencia(T elemento) {
        if (this.tamanho == 0) {
            System.out.println("Lista está vazia.");
            return "Lista está vazia.";
        }
        No<T> atual = this.inicio;
        int posicao = 0;
        while (atual != null) {
            if (atual.getElemento().equals(elemento)) {
                System.out.println("Elemento " + elemento + " encontrado na posição: " + posicao);
                return "Elemento encontrado na posição: " + posicao;
            }
            atual = atual.getProximo();
            posicao++;
        }
        System.out.println("Elemento não encontrado na lista.");
        return "Elemento" + elemento +" não encontrado na lista.";
    }


    private No<T> buscaNo(int posicao){
        if (posicao < 0 || posicao > this.tamanho) {
            throw new IllegalArgumentException("Posição Inválida. ");
        }
        No<T> noAtual = this.inicio;
        for (int i = 0; i < posicao; i++){
            noAtual = noAtual.getProximo();
        }
        return noAtual;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        No<T> atual = this.inicio;
        sb.append("[");
        while (atual != null) {
            sb.append(atual.getElemento());
            if (atual.getProximo() != null) {
                sb.append(" -> ");
            }
            atual = atual.getProximo();
        }
        sb.append("]");
        return sb.toString();
    }
}
