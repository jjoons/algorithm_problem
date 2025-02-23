import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int input = sc.nextInt();

        for (int i = input; i > 0; i--) {
            final StringBuilder sb = new StringBuilder();

            // or "*".repeat(i)
            for (int j = input; j > 0; j--) {
                if (j > i) {
                    sb.append(" ");
                } else {
                    sb.append("*");
                }
            }

            System.out.println(sb);
        }
    }
}
