import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        while (true) {
            final long a, b;

            try {
                a = sc.nextLong();
                b = sc.nextLong();
            } catch (RuntimeException e) {
                break;
            }

            System.out.println(a + b);
        }
    }
}
