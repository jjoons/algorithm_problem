
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        int cheapestHamburgerPrice = 2025;
        int cheapestDrinkPrice = 2025;

        for (int i = 0; i < 3; i++) {
            final int price = sc.nextInt();
            sc.nextLine();

            if (price < cheapestHamburgerPrice) {
                cheapestHamburgerPrice = price;
            }
        }

        for (int i = 0; i < 2; i++) {
            final int price = sc.nextInt();
            sc.nextLine();

            if (price < cheapestDrinkPrice) {
                cheapestDrinkPrice = price;
            }
        }

        int result = cheapestHamburgerPrice + cheapestDrinkPrice - 50;
        System.out.println(result);
    }
}
