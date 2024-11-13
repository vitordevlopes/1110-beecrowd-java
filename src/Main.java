import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int  qtdeCartas = scanner.nextInt();

        ArrayList<Integer> listaCartas = new ArrayList<>();

            for (int i = qtdeCartas; i > 0; i--) {

                listaCartas.add(i);

            }

            String removed = "";

            while (listaCartas.size() >= 2) {

                int ultimaPosicao = listaCartas.size() - 1;



               removed += String.valueOf(listaCartas.remove(ultimaPosicao)) + ", ";


               int ultimoElemento = listaCartas.get(listaCartas.size() - 1);
               listaCartas.remove(listaCartas.size() - 1);
               listaCartas.add(0, ultimoElemento);

            }

        System.out.println("Discarded cards: " + removed.substring(0, removed.length() - 2));
        System.out.println("Remaining card: " + listaCartas.get(0));

    }

}
