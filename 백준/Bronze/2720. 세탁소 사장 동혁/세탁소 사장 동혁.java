import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int testCount = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < testCount; i++) {
            int cents = sc.nextInt();
            final int quarters = cents / 25;
            cents -= 25 * quarters;
            final int dimes = cents / 10;
            cents -= 10 * dimes;
            final int nickels = cents / 5;
            cents -= 5 * nickels;
            final int pennies = cents;

            System.out.printf("%d %d %d %d", quarters, dimes, nickels, pennies);
            System.out.println();
        }
    }
}
