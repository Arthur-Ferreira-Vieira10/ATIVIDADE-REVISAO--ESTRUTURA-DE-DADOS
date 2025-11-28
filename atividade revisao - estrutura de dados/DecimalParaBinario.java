import java.util.Scanner;
import java.util.Stack;

public class DecimalParaBinario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> pilha = new Stack<>();

        while (n > 0) {
            pilha.push(n % 2);
            n = n / 2;
        }

        System.out.print("Binário: ");
        while (!pilha.isEmpty()) {
            System.out.print(pilha.pop());
        }
    }
}
