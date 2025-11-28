import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Documento {
    String nome;
    int paginas;

    Documento(String n, int p) {
        nome = n;
        paginas = p;
    }
}

public class FilaImpressora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Documento> fila = new LinkedList<>();
        int op;

        do {
            System.out.println("\n1 - Adicionar documento");
            System.out.println("2 - Processar documento");
            System.out.println("3 - Cancelar documento");
            System.out.println("4 - Mostrar fila");
            System.out.println("5 - Total de páginas");
            System.out.println("0 - Sair");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {

                case 1:
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Páginas: ");
                    int pag = sc.nextInt();
                    fila.add(new Documento(nome, pag));
                    break;

                case 2:
                    if (fila.isEmpty()) System.out.println("Fila vazia.");
                    else {
                        Documento d = fila.poll();
                        System.out.println("Imprimindo: " + d.nome);
                    }
                    break;

                case 3:
                    System.out.print("Nome do documento: ");
                    String cancel = sc.nextLine();
                    fila.removeIf(doc -> doc.nome.equals(cancel));
                    break;

                case 4:
                    for (Documento d2 : fila) {
                        System.out.println(d2.nome + " - " + d2.paginas + " páginas");
                    }
                    break;

                case 5:
                    int total = 0;
                    for (Documento d3 : fila) total += d3.paginas;
                    System.out.println("Total páginas: " + total);
                    break;
            }
        } while (op != 0);
    }
}
