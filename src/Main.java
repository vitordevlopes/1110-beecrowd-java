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

        ArrayList<Integer> listaCartas = new ArrayList<>();
        String removed = "";

        // percorre cada posicao do array entradas para ser colocado no proximo for e descobrir o valor
        for (int i = 0; i < entradas.size(); i++) {

            for (int qtdeCartas = entradas.get(i); qtdeCartas > 0; qtdeCartas--) {
                listaCartas.add(qtdeCartas);
            }

            while (listaCartas.size() > 1) {

                // descobre a a posicao da ultima carta
                int ultimaPosicao = listaCartas.size() - 1;


                // remove a carta na ultima posicao e adiciona ela dentro de uma variavel string
                removed += String.valueOf(listaCartas.remove(ultimaPosicao)) + ", ";

                // descobre a nova carta que ocupa a ultima posicao
                int ultimoElemento = listaCartas.get(listaCartas.size() - 1);
                listaCartas.add(0, ultimoElemento);
                listaCartas.remove(listaCartas.size() - 1);

            }

            System.out.println("Discarded cards: " + removed.substring(0, removed.length() - 2));
            System.out.println("Remaining card: " + listaCartas.get(0));
            removed = "";
            listaCartas.clear();

        }

    }

}
