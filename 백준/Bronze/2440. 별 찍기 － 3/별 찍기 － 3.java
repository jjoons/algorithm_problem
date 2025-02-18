import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int count = sc.nextInt();

        for (int i = count; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
