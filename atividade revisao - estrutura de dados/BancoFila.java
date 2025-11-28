import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BancoFila {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> fila = new LinkedList<>();
        int opcao;

        do {
            System.out.println("\n1 - Adicionar cliente");
            System.out.println("2 - Chamar próximo");
            System.out.println("3 - Mostrar quantidade");
            System.out.println("4 - Ver próximo da fila");
            System.out.println("0 - Sair");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o número da senha: ");
                    fila.add(sc.nextInt());
                    break;

                case 2:
                    if (fila.isEmpty()) System.out.println("Fila vazia.");
                    else System.out.println("Chamando: " + fila.poll());
                    break;

                case 3:
                    System.out.println("Total aguardando: " + fila.size());
                    break;

                case 4:
                    if (fila.isEmpty()) System.out.println("Fila vazia.");
                    else System.out.println("Próximo: " + fila.peek());
                    break;
            }
        } while (opcao != 0);
    }
}
