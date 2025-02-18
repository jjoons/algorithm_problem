import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int totalCount = sc.nextInt();
        sc.nextLine();

        final String[] ints = sc.nextLine().split(" ");
        final int searchNum = sc.nextInt();
        int result = 0;

        for (int i = 0; i < ints.length; i++) {
            final int value = Integer.parseInt(ints[i]);

            if (value == searchNum) {
                result++;
            }
        }

        System.out.println(result);
    }
}
