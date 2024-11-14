import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> entradas = new ArrayList<>();

        while (true) {
            int entrada = scanner.nextInt();

            if (entrada == 0) {
                break;
            }
            entradas.add(entrada);
        }
        scanner.close();

        //o array listaCartas vai guardar a quantidade de cartas digitada pelo usuario
        ArrayList<Integer> listaCartas = new ArrayList<>();
        String cartasRemovidas = "";

        // percorre cada posicao do array entradas para ser colocado no proximo for e descobrir o valor
        for (Integer quantidadeCartas : entradas) {

            for (int qtdeCartas = quantidadeCartas; qtdeCartas > 0; qtdeCartas--) {
                listaCartas.add(qtdeCartas);
            }

            while (listaCartas.size() > 1) {

                // descobre a a posicao da ultima carta
                int ultimaPosicao = listaCartas.size() - 1;


                // remove a carta na ultima posicao e adiciona ela dentro de uma variavel string
                cartasRemovidas += String.valueOf(listaCartas.remove(ultimaPosicao)) + ", ";

                // descobre a nova carta que ocupa a ultima posicao
                int ultimoElemento = listaCartas.get(listaCartas.size() - 1);
                listaCartas.add(0, ultimoElemento);
                listaCartas.remove(listaCartas.size() - 1);

            }

            System.out.println("Discarded cards: " + cartasRemovidas.substring(0, cartasRemovidas.length() - 2));
            System.out.println("Remaining card: " + listaCartas.get(0));
            cartasRemovidas = "";
            listaCartas.clear();

        }

    }

}
