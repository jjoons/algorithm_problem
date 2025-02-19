import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int repeatCount = sc.nextInt();
        sc.nextLine();

        int minNumber = 1_000_001;
        int maxNumber = -1_000_001;

        for (int i = 0; i < repeatCount; i++) {
            final int num = sc.nextInt();

            if (num < minNumber) {
                minNumber = num;
            }

            if (num > maxNumber) {
                maxNumber = num;
            }
        }

        System.out.println(minNumber + " " + maxNumber);
    }
}
