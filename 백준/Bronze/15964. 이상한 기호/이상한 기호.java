import java.util.Scanner;

class Main {
    private static long calculate(long a, long b) {
        return (a + b) * (a - b);
    }

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final long a = sc.nextLong();
        final long b = sc.nextLong();

        final long result = calculate(a, b);
        System.out.println(result);
    }
}
