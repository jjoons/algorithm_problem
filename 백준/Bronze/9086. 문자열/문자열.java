import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int testCount = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < testCount; i++) {
            final String input = sc.nextLine();

            if (!input.matches("^[A-Z]{1,999}$")) {
                continue;
            }

            final char firstLetter = input.charAt(0);
            final char lastLetter = input.charAt(input.length() - 1);

            System.out.println(String.valueOf(firstLetter) + lastLetter);
        }
    }
}
