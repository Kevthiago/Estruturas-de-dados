package Lista01;

public class ListaNumerica01<T> {
    private No<T>inicio;
    private No<T>ultimo;
    private int tamanho = 0;

    public int getTamanho() {
        return tamanho;
    }

    private No<T> buscaNo (int posicao){
        if (posicao < 0 || posicao > this.tamanho) {
            throw new IllegalArgumentException("Posição inválida!");
        }
        No<T> noAtual = this.inicio;
        for (int i = 0; i < posicao; i++){
            noAtual = noAtual.getProximo();
        }
        return noAtual;
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

    public void inserirPosicao(int posicao, T elemento){
        if (posicao < 0 || posicao > this.tamanho){
            throw new IllegalArgumentException("Posição inválida!");
        }
        if (posicao == 0) {
            this.inserirInicio(elemento);
        } else if (posicao == this.tamanho) {
            this.inserirFinal(elemento);
        } else {
            No<T> noAnterior = this.buscaNo(posicao - 1);
            No<T> proximoNo = noAnterior.getProximo();
            No<T> celula = new No<>(elemento);
            celula.setProximo(proximoNo);
            noAnterior.setProximo(celula);
            this.tamanho++;
        }
    }

    public void removerInicio(){
        if (this.tamanho == 0){
            this.ultimo = null;
            throw new RuntimeException("Lista está vazia.");
        } else {
            this.inicio = this.inicio.getProximo();
        }
        this.tamanho--;
    }

    public void removerFinal() {
        if (this.tamanho == 0) {
            this.ultimo = null;
            throw new RuntimeException("Lista está vazia.");
        } else if (this.tamanho == 1) {
            this.removerInicio();
        }else {
            No<T> noAnterior = this.buscaNo(this.tamanho - 2);
            T removido = noAnterior.getProximo().getElemento();
            noAnterior.setProximo(null);
        }
        this.tamanho--;
    }

    public void removerPosicao(int posicao){
        if (posicao < 0 || posicao > this.tamanho){
            throw new IllegalArgumentException("Posição inválida!");
        } else if (posicao == 0) {
            System.out.println("Lista vazia.");
        } else {
            No<T> noAnterior = this.buscaNo(posicao - 2);
            No<T> noProximo = noAnterior.getProximo().getProximo();
            noAnterior.setProximo(noProximo);
        }
        this.tamanho--;
    }

    public void removerElemento(int elemento){ //primeir aparição
        if (this.tamanho == 0){
            System.out.println("Lista vazia! Não há elementos para remover.");
        } else if (this.tamanho == 1){
            this.removerInicio();
        }
        No<T> noAnterior = null;
        No<T> noAtual = this.inicio;

        while(noAtual != null && !noAtual.getElemento().equals(elemento)){
            noAnterior = noAtual;
            noAtual = noAtual.getProximo();
        }
        if (noAtual == null){
            throw new RuntimeException("Elemento não existe na lista!");
        }
        noAnterior.setProximo(noAtual.getProximo());
        if (noAtual == this.ultimo){
            this.ultimo = noAnterior;
        }
        this.tamanho--;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ListaNumerica01: [");

        No<T> atual = inicio;
        while (atual != null) {
            sb.append(atual.getElemento());
            atual = atual.getProximo();
            if (atual != null) {
                sb.append(", ");
            }
        }

        sb.append("]");
        return sb.toString();
    }
}
