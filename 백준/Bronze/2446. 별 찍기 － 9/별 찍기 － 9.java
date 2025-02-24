import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int count = sc.nextInt();
        final String[] starArr = new String[count];

        for (int i = count - 1; i >= 0; i--) {
            final StringBuilder sb = new StringBuilder();

            for (int j = i + 1; j < count; j++) {
                sb.append(" ");
            }

            for (int j = -i; j <= i; j++) {
                sb.append("*");
            }

            starArr[i] = sb.toString();
            System.out.println(starArr[i]);
        }

        for (int i = 1; i < count; i++) {
            final String text = starArr[i];
            System.out.println(text);
        }
    }
}
