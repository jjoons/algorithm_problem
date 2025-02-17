import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int TOTAL_COUNT = 30;
        final int SUBMITTED_COUNT = 28;
        final boolean[] handedArr = new boolean[TOTAL_COUNT];

        for (int i = 0; i < SUBMITTED_COUNT; i++) {
            final int x = sc.nextInt();
            handedArr[x - 1] = true;
        }

        for (int i = 0; i < handedArr.length; i++) {
            final boolean isHanded = handedArr[i];
            final int num = i + 1;

            if (!isHanded) {
                System.out.println(num);
            }
        }
    }
}
