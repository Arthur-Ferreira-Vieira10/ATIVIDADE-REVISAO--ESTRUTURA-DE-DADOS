import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class JogoCartas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<String> deque = new LinkedList<>();
        int op;

        do {
            System.out.println("\n1 - Inserir início");
            System.out.println("2 - Inserir fim");
            System.out.println("3 - Remover início");
            System.out.println("4 - Remover fim");
            System.out.println("5 - Ver primeira carta");
            System.out.println("6 - Ver última carta");
            System.out.println("7 - Inverter baralho");
            System.out.println("0 - Sair");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    deque.addFirst(sc.nextLine());
                    break;

                case 2:
                    deque.addLast(sc.nextLine());
                    break;

                case 3:
                    if (!deque.isEmpty()) deque.removeFirst();
                    break;

                case 4:
                    if (!deque.isEmpty()) deque.removeLast();
                    break;

                case 5:
                    System.out.println(deque.peekFirst());
                    break;

                case 6:
                    System.out.println(deque.peekLast());
                    break;

                case 7:
                    Deque<String> aux = new LinkedList<>();
                    while (!deque.isEmpty()) aux.addFirst(deque.removeFirst());
                    deque = aux;
                    break;
            }

        } while (op != 0);
    }
}
