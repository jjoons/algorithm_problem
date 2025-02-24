import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final String text = sc.nextLine();

        final int length = text.length();
        final int repeatCount = length / 10 + (length % 10 == 0 ? 0 : 1);

        for (int i = 0; i < repeatCount; i++) {
            final int jStart = i * 10;
            final int jEnd = jStart + 10;

            for (int j = jStart; j < jEnd && j < length; j++) {
                System.out.print(text.charAt(j));
            }

            System.out.println();
        }
    }
}
