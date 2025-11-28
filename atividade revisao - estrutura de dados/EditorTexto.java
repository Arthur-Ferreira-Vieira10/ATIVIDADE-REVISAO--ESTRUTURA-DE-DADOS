import java.util.Scanner;

class No {
    String linha;
    No ant, prox;

    No(String l) {
        linha = l;
    }
}

class Lista {
    No inicio, fim;

    void inserirInicio(String t) {
        No novo = new No(t);
        if (inicio == null) inicio = fim = novo;
        else {
            novo.prox = inicio;
            inicio.ant = novo;
            inicio = novo;
        }
    }

    void inserirFim(String t) {
        No novo = new No(t);
        if (fim == null) inicio = fim = novo;
        else {
            fim.prox = novo;
            novo.ant = fim;
            fim = novo;
        }
    }

    void inserirPosicao(int p, String t) {
        if (p <= 1) {
            inserirInicio(t);
            return;
        }
        No aux = inicio;
        int i = 1;

        while (aux != null && i < p) {
            aux = aux.prox;
            i++;
        }

        if (aux == null) inserirFim(t);
        else {
            No novo = new No(t);
            novo.ant = aux.ant;
            novo.prox = aux;
            aux.ant.prox = novo;
            aux.ant = novo;
        }
    }

    void remover(int p) {
        if (inicio == null) return;

        if (p == 1) {
            inicio = inicio.prox;
            if (inicio != null) inicio.ant = null;
            else fim = null;
            return;
        }

        No aux = inicio;
        int i = 1;

        while (aux != null && i < p) {
            aux = aux.prox;
            i++;
        }

        if (aux == null) return;
        if (aux == fim) fim = aux.ant;
        if (aux.ant != null) aux.ant.prox = aux.prox;
        if (aux.prox != null) aux.prox.ant = aux.ant;
    }

    void exibirFrente() {
        No aux = inicio;
        while (aux != null) {
            System.out.println(aux.linha);
            aux = aux.prox;
        }
    }

    void exibirTras() {
        No aux = fim;
        while (aux != null) {
            System.out.println(aux.linha);
            aux = aux.ant;
        }
    }
}

public class EditorTexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lista lista = new Lista();
        int op;

        do {
            System.out.println("\n1 - Inserir início");
            System.out.println("2 - Inserir fim");
            System.out.println("3 - Inserir posição");
            System.out.println("4 - Remover linha");
            System.out.println("5 - Exibir frente");
            System.out.println("6 - Exibir trás");
            System.out.println("0 - Sair");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    lista.inserirInicio(sc.nextLine());
                    break;
                case 2:
                    lista.inserirFim(sc.nextLine());
                    break;
                case 3:
                    int pos = sc.nextInt();
                    sc.nextLine();
                    lista.inserirPosicao(pos, sc.nextLine());
                    break;
                case 4:
                    lista.remover(sc.nextInt());
                    break;
                case 5:
                    lista.exibirFrente();
                    break;
                case 6:
                    lista.exibirTras();
                    break;
            }
        } while (op != 0);
    }
}
