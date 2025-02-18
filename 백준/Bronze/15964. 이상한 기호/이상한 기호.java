import java.util.Scanner;

class Main {
    private static long calculate(int a, int b) {
        return (a + b) * (a - b);
    }

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int a = sc.nextInt();
        final int b = sc.nextInt();

        final long result = calculate(a, b);
        System.out.println(result);
    }
}
