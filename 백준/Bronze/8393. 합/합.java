import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int input = sc.nextInt();
        int result = 0;

        for (int i = 1; i <= input; i++) {
            result += i;
        }

        System.out.println(result);
    }
}
