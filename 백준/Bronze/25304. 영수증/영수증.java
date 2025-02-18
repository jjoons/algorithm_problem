import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int totalPrice = sc.nextInt();
        sc.nextLine();
        final int contentCount = sc.nextInt();
        sc.nextLine();

        int calculatedTotalPrice = 0;

        for (int i = 0; i < contentCount; i++) {
            final int price = sc.nextInt();
            final int count = sc.nextInt();
            sc.nextLine();

            calculatedTotalPrice += price * count;
        }

        System.out.println(calculatedTotalPrice == totalPrice ? "Yes" : "No");
    }
}
