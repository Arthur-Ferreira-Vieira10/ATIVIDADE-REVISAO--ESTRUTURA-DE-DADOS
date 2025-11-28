import java.util.Scanner;
import java.util.Stack;

public class HistoricoNavegacao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> pilha = new Stack<>();
        int op;

        do {
            System.out.println("\n1 - Visitar URL");
            System.out.println("2 - Voltar");
            System.out.println("3 - Página atual");
            System.out.println("4 - Exibir histórico");
            System.out.println("5 - Limpar histórico");
            System.out.println("0 - Sair");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    pilha.push(sc.nextLine());
                    break;

                case 2:
                    if (!pilha.isEmpty()) pilha.pop();
                    break;

                case 3:
                    if (pilha.isEmpty()) System.out.println("Vazio");
                    else System.out.println("Atual: " + pilha.peek());
                    break;

                case 4:
                    for (String s : pilha) System.out.println(s);
                    break;

                case 5:
                    pilha.clear();
                    break;
            }

        } while (op != 0);
    }
}
