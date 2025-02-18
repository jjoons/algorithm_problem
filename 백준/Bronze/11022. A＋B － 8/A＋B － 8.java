import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int testCount = sc.nextInt();

        for (int i = 1; i <= testCount; i++) {
            final int a = sc.nextInt();
            final int b = sc.nextInt();

            System.out.printf("Case #%d: %d + %d = %d", i, a, b, a + b);
            System.out.println();
        }
    }
}
