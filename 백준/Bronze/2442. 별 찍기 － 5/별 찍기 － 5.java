import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int count = sc.nextInt();

        for (int i = 0; i < count; i++) {
            final StringBuilder sb = new StringBuilder();

            for (int j = count - i - 1; j > 0; j--) {
                sb.append(" ");
            }

            for (int j = 0 - i; j <= i; j++) {
                sb.append("*");
            }

            System.out.println(sb);
        }
    }
}
