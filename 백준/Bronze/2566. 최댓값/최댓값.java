import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        int maxNumber = -1;
        int column = 0;
        int row = 0;

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                final int value = sc.nextInt();

                if (value > maxNumber) {
                    maxNumber = value;
                    column = i;
                    row = j;
                }
            }

            sc.nextLine();
        }

        System.out.println(maxNumber);
        System.out.println(column + " " + row);
    }
}
