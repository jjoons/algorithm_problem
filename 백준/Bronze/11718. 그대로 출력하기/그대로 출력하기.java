import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 100; i++) {
            if (sc.hasNextLine()) {
                final String input = sc.nextLine();

                if (input.length() > 100 || input.isEmpty() || input.startsWith(" ") || input.endsWith(" ")) {
                    break;
                }

                System.out.println(input);
            }
        }
    }
}
