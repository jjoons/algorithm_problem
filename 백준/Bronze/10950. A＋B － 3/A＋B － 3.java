import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final long n = sc.nextLong();

        for (int i = 0; i < n; i++) {
            final long a = sc.nextLong();
            final long b = sc.nextLong();

            System.out.println(a + b);
        }
    }
}
