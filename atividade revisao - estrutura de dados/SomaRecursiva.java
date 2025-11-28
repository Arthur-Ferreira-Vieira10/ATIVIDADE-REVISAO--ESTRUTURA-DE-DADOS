import java.util.Scanner;

public class SomaRecursiva {

    public static int somaDigitos(int n) {
        if (n < 10) return n;
        return (n % 10) + somaDigitos(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(somaDigitos(n));
    }
}
