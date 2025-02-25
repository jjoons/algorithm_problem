import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        solution1();
    }

    private static void solution1() {
        final Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        final String[] arr = new String[n];

        for (int i = 0, j = n - 1; i < n; i++, j--) {
            final StringBuilder sb = new StringBuilder();

            for (int k = j; k < n; k++) {
                sb.append("*");
            }

            for (int k = j; k > 0; k--) {
                sb.append(" ");
            }

            final String text = sb.toString();
            arr[i] = text + reverseString(text);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (int i = arr.length - 2; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    private static String reverseString(final String text) {
        // or new StringBuilder(text).reverse().toString()

        if (text == null) {
            throw new RuntimeException();
        }

        final StringBuilder sb = new StringBuilder();
        final String[] arr = text.split("");

        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]);
        }

        return sb.toString();
    }
}
