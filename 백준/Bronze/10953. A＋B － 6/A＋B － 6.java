import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int testCount = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < testCount; i++) {
            final String[] arr = sc.nextLine().split(",");
            final int a = Integer.parseInt(arr[0]);
            final int b = Integer.parseInt(arr[1]);

            System.out.println(a + b);
        }
    }
}
