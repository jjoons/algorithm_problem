import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        final int k = sc.nextInt();

        final int[] divisors = getDivisors(n);

        System.out.println(k > divisors.length ? 0 : divisors[k - 1]);
    }

    private static int[] getDivisors(int n) {
        int count = 0;

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                count++;

                if (n / i != i) {
                    count++;
                }
            }
        }

        final int[] result = new int[count];

        for (int i = 1, j = 0; i <= n / 2; i++) {
            if (n % i == 0) {
                result[j++] = i;
            }
        }

        result[result.length - 1] = n;

        return result;
    }
}
