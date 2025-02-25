import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int count = sc.nextInt();

        for (int i = count - 1; i >= 0; i--) {
            final String a = stringRepeat(" ", count - i - 1);
            final String b = stringRepeat("*", i * 2 + 1);

            System.out.printf("%s%s\n", a, b);
        }
    }

    private static String stringRepeat(final String str, final int count) {
        if (str == null || count < 0) {
            throw new RuntimeException();
        }

        if (count == 0) {
            return "";
        } else if (count == 1 || str.isEmpty()) {
            return str;
        }

        final StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(str);
        }

        return sb.toString();
    }
}
