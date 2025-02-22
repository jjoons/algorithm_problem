
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final String input = sc.nextLine();
        final String[] inputArr = input.split(" ");
        final int[] arr = new int[inputArr.length];

        for (int i = 0; i < arr.length; i++) {
            final int value = Integer.parseInt(inputArr[i]);
            arr[i] = value;
        }

        sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    swap(arr, j - 1, j);
                }
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        final int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
