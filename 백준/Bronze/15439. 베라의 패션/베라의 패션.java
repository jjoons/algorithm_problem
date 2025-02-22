import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();

        final long result = (long) n * n - n; // or Math.pow(n, 2) - n
        System.out.println(result);
    }
}
