import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();

        int result = (int) Math.pow(2, n) + 1;
        result *= result;
        System.out.println(result);
    }
}
