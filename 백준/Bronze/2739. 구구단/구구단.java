import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();

        for (int i = 1; i <= 9; i++) {
            final int result = n * i;
            System.out.format("%d * %d = %d\n", n, i, result);
        }
    }
}
