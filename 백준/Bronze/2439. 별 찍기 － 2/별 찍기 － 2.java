import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int count = sc.nextInt();

        for (int i = 1; i <= count; i++) {
            final int space = count - i;
            final int star = count - space;
            StringBuilder line = new StringBuilder();

            for (int j = 0; j < space; j++) {
                line.append(" ");
            }

            for (int j = 0; j < star; j++) {
                line.append("*");
            }

            System.out.println(line);
        }
    }
}
