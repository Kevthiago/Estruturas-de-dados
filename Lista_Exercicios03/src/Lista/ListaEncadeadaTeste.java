package Lista;

public class ListaEncadeadaTeste {
    public static void main(String[] args) {
        ListaEncadeadaNo<Integer> lista = new ListaEncadeadaNo<>();

        lista.inserirInicio(4);
        lista.inserirInicio(3);
        lista.inserirFinal(5);

        lista.inserirQualquer(0, 2);
        lista.inserirQualquer(0, 1);


        System.out.println(lista);
        System.out.println("Tamanho da lista: " + lista.getTamanho());

        //lista.removeInicio();
        //lista.removeFinal();
        //lista.removeQualquer(1);]
        //lista.removerElemento(4);
        //lista.removerElemento(10);

        //System.out.println(lista);
        //System.out.println("Tamanho da lista: " + lista.getTamanho());

        lista.verificarExistencia(4);
        lista.verificarExistencia(10);
    }
}
