
import java.util.Map;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int[] arr = new int[3];
        final String[] resultArr = {"Error", "Scalene", "Isosceles", "Equilateral"};
        int total = 0;
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            final int value = sc.nextInt();
            arr[i] = value;
            total += value;
        }

        if (total != 180) {
            System.out.println(resultArr[result]);
            return;
        }

        result = 1;
        boolean isBreak = false;

        for (int i = 0; i < arr.length; i++) {
            final int iValue = arr[i];

            for (int j = i + 1; j < arr.length; j++) {
                final int jValue = arr[j];

                if (iValue == jValue) {
                    if (jValue == 60 && result == 2) {
                        result = 3;
                    }

                    if (result >= 3) {
                        isBreak = true;
                        break;
                    }

                    result = 2;
                }
            }

            if (isBreak) break;
        }

        System.out.println(resultArr[result]);
    }
}
