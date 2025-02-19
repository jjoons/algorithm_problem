import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int PROBLEM_COUNT = 10;
        final int DEVIDE_NUMBER = 42;
        final int[] remainderArr = new int[DEVIDE_NUMBER];
        int differentCount = 0;

        for (int i = 0; i < PROBLEM_COUNT; i++) {
            final int num = sc.nextInt();
            sc.nextLine();

            remainderArr[num % DEVIDE_NUMBER]++;
        }

        for (int i = 0; i < remainderArr.length; i++) {
            final int value = remainderArr[i];

            if (value >= 1) {
                differentCount++;
            }
        }

        System.out.println(differentCount);
    }
}
