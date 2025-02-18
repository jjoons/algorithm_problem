import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int a = sc.nextInt();
        final int average = sc.nextInt();

        final int b = average * 2 - a;
        System.out.println(b);
    }
}
