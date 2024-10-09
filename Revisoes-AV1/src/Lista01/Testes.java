package Lista01;

public class Testes {
    public static void main(String[] args) {
        ListaNumerica01<Integer> listaNumerica01 = new ListaNumerica01<>();

        listaNumerica01.inserirInicio(5);
        listaNumerica01.inserirFinal(3);
        listaNumerica01.inserirPosicao(1, 4);
        listaNumerica01.inserirFinal(1);
        listaNumerica01.inserirPosicao(3, 2);

        System.out.println(listaNumerica01.toString());

        listaNumerica01.removerInicio();

        System.out.println(listaNumerica01.toString());

        listaNumerica01.removerFinal();

        System.out.println(listaNumerica01.toString());

        listaNumerica01.removerPosicao(2);

        System.out.println(listaNumerica01.toString());

        listaNumerica01.removerElemento(2);

        System.out.println(listaNumerica01.toString());
    }
}
