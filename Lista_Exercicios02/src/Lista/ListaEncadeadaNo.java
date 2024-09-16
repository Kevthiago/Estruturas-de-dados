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
        if (tamanho == 0){
            this.inicio = celula;
        } else {
            this.ultimo.setProximo(celula);
        }
        this.ultimo = celula;
        tamanho++;
    }

    public void inserirFinal(T elemento){
        No<T> celula = new No<>(elemento);

    }

    @Override
    public String toString() {
        return "Lista.ListaEncadeadaNo{" +
                "inicio=" + inicio +
                '}';
    }
}
