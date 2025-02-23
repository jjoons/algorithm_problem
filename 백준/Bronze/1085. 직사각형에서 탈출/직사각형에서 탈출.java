import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int x = sc.nextInt();
        final int y = sc.nextInt();
        final int w = sc.nextInt();
        final int h = sc.nextInt();

        int minimumValue = 1001;
        final int[] arr = {w - x, w - (w - x), h - y, h - (h - y)};

        for (int i = 0; i < arr.length; i++) {
            final int value = arr[i];

            if (minimumValue > value) {
                minimumValue = value;
            }
        }

        System.out.println(minimumValue);
    }
}
