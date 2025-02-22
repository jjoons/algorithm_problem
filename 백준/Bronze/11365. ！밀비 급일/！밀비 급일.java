import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        solution1();
    }

    private static void solution1() {
        final Scanner sc = new Scanner(System.in);

        while (true) {
            final String text = sc.nextLine();

            if (text.equals("END")) {
                break;
            }

            final StringBuilder sb = new StringBuilder();

            for (int i = text.length() - 1; i >= 0; i--) {
                final char letter = text.charAt(i);
                sb.append(letter);
            }

            System.out.println(sb);
        }
    }

    private static void solution2() {
        final Scanner sc = new Scanner(System.in);

        while (true) {
            final String text = sc.nextLine();

            if (text.equals("END")) {
                break;
            }

            final StringBuilder sb = new StringBuilder();
            final String[] textArr = text.split("");

            for (int i = textArr.length - 1; i >= 0; i--) {
                final String letter = textArr[i];
                sb.append(letter);
            }

            System.out.println(sb);
        }
    }

    private static void solution3() {
        final Scanner sc = new Scanner(System.in);

        while (true) {
            final String text = sc.nextLine();

            if (text.equals("END")) {
                break;
            }

            final StringBuilder sb = new StringBuilder(text);
            sb.reverse();

            System.out.println(sb);
        }
    }
}
