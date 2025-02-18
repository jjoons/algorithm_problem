import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final String input = sc.nextLine();
        final int digits = sc.nextInt();

        final char letter = input.charAt(digits - 1);
        System.out.println(letter);
    }
}
