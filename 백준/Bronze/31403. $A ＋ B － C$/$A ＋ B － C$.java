import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int[] ints = new int[3];
        final String[] intStrs = new String[ints.length];

        for (int i = 0; i < ints.length; i++) {
            final int value = sc.nextInt();
            ints[i] = value;
            intStrs[i] = String.valueOf(value);
        }

        String ab = "";

        for (int i = 0; i < 2; i++) {
            final String value = intStrs[i];
            ab += Integer.parseInt(value);
        }

        final int numberResult = ints[0] + ints[1] - ints[2];
        final int abInt = Integer.parseInt(ab);
        final int stringResult = abInt - ints[2];

        System.out.println(numberResult);
        System.out.println(stringResult);
    }
}
