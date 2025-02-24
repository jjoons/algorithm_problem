import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 100; i++) {
            if (sc.hasNextLine()) {
                final String text = sc.nextLine();
                System.out.println(text);
            }
        }
    }
}
