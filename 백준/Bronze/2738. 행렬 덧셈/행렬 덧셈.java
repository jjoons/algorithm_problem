import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int COUNT = 2;

        final String[] countArr = sc.nextLine().split(" ");
        final int rowSize = Integer.parseInt(countArr[0]);
        final int columnSize = Integer.parseInt(countArr[1]);
        final int[][][] arr = new int[COUNT][rowSize][columnSize];


        for (int i = 0; i < COUNT; i++) {
            for (int j = 0; j < rowSize; j++) {
                final String[] input = sc.nextLine().split(" ");
                final List<Integer> inputArr = Arrays.stream(input)
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());

                for (int k = 0; k < columnSize; k++) {
                    arr[i][j][k] = inputArr.get(k);
                }
            }
        }

        for (int i = 0; i < rowSize; i++) {
            final StringBuilder sb = new StringBuilder();

            for (int j = 0; j < columnSize; j++) {
                final int a = arr[0][i][j];
                final int b = arr[1][i][j];

                if (j > 0) {
                    sb.append(" ");
                }
                sb.append(a + b);
            }

            System.out.println(sb);
        }
    }
}
