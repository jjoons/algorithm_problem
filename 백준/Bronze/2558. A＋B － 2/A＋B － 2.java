import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        int result = 0;

        for (int i = 0; i < 2; i++) {
            result += sc.nextInt();
        }

        System.out.println(result);
    }
}
