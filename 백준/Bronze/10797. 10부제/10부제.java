import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int dayOne = sc.nextInt();
        int carCount = 0;

        for (int i = 0; i < 5; i++) {
            final int carNumberOne = sc.nextInt();

            if (carNumberOne == dayOne) {
                carCount++;
            }
        }

        System.out.println(carCount);
    }
}
