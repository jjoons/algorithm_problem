import java.util.Arrays;
import java.util.Scanner;

class Main {
    private static int solution1(int[] serialNumberArr) {
        final int validateNumber = Arrays.stream(serialNumberArr)
            .reduce(0, (a, b) -> a + b);

        return validateNumber % 10;
    }

    private static int solution2(int[] serialNumberArr) {
        int value = 0;

        for (int i : serialNumberArr) {
            value += i;
        }

        return value % 10;
    }

    public static void main(String[] args) {
        final int DIGIT = 5;
        final Scanner sc = new Scanner(System.in);
        final int[] serialNumberArr = new int[DIGIT];

        for (int i = 0; i < DIGIT; i++) {
            final int num = sc.nextShort();
            serialNumberArr[i] = (int) Math.pow(num, 2);
        }

        final int result = solution2(serialNumberArr);
        System.out.println(result);
    }
}
