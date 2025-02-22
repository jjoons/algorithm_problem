import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int count = sc.nextInt();

        for (int i = 1; i <= count; i++) {
            System.out.printf("Hello World, Judge %d!\n", i);
        }
    }
}
