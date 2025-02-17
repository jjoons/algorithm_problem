import java.util.Scanner;

public class Main {
    private static long solution1(long n) {
        if (n <= 1) {
            return 1;
        }

        long result = n;

        for (long i = n - 1L; i > 0L; i--) {
            result *= i;
        }

        return result;
    }

    private static long solution2(long n) {
        if (n <= 1) {
            return 1;
        }

        return n * solution2(n - 1);
    }

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final long n = sc.nextLong();

        final long resultA = solution1(n);

        System.out.println(resultA);
    }
}
