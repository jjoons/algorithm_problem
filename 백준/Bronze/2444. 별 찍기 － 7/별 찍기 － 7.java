import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int input = sc.nextInt();
        final String[] arr = new String[input];

        for (int i = 0, j = input - 1; i < input; i++, j--) {
            final StringBuilder sb = new StringBuilder();

            for (int k = 0; k < j; k++) {
                sb.append(" ");
            }

            for (int k = 0 - i; k <= i; k++) {
                sb.append("*");
            }

            arr[i] = sb.toString();
            System.out.println(sb);
        }

        for (int i = arr.length - 2; i >= 0; i--) {
            final String text = arr[i];
            System.out.println(text);
        }
    }
}
