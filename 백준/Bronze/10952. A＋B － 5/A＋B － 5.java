import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        while (true) {
            final long a = sc.nextLong();
            final long b = sc.nextLong();

            if (a == 0 && b == 0) {
                break;
            }

            System.out.println(a + b);
        }
    }
}
