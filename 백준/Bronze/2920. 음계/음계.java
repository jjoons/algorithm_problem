import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final String[] arr = sc.nextLine().split(" ");
        String result = null;

        for (int i = 0; i < arr.length; i++) {
            final int num = Integer.parseInt(arr[i]);

            if (num != i + 1) {
                break;
            }

            if (i >= arr.length - 1) {
                result = "ascending";
            }
        }

        if (result == null) {
            for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
                final int num = Integer.parseInt(arr[i]);

                if (num != j + 1) {
                    break;
                }

                if (j == 0) {
                    result = "descending";
                }
            }
        }

        if (result == null) {
            result = "mixed";
        }

        System.out.println(result);
    }
}
