import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int nHeight = sc.nextInt();
        int result = 2;

        for (int i = 1; i < nHeight; i++) {
            result *= 2;
        }

        System.out.println(result);
    }
}
