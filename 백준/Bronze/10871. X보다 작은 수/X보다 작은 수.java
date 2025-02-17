import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final String input1 = sc.nextLine();
        final String[] input1Arr = input1.split(" ");
        final String arrayCountStr = input1Arr[0];
        final String numStr = input1Arr[1];
        final int arrayCount = Integer.parseInt(arrayCountStr);
        final int x = Integer.parseInt(numStr);

        final String input2 = sc.nextLine();
        final String[] a = input2.split(" ");

        StringBuilder result = new StringBuilder();

        for (String s : a) {
            final int n = Integer.parseInt(s);

            if (x > n) {
                if (result.length() > 0) {
                    result.append(" ");
                }

                result.append(s);
            }
        }

        System.out.println(result);
    }
}
