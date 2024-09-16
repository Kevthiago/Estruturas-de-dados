package Lista.teste;

import Lista.ListaEncadeadaNo;

public class ListaEncadeadaTeste {
    public static void main(String[] args) {
        ListaEncadeadaNo<Integer> lista = new ListaEncadeadaNo<>();

        lista.inserirInicio(90);
        lista.inserirInicio(45);
        System.out.println("Tamanho da lista: " + lista.getTamanho());
        System.out.println(lista);


    }
}
