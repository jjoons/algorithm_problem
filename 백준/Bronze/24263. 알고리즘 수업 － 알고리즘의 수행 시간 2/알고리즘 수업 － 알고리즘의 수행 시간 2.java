import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();

        System.out.println(n);
        System.out.println(1);
    }

    private static int menOfPassion(int[] arr, int n) {
        int sum = 0;

        for (int i = 0; i < n; i++)
            sum += arr[i];

        return sum;
    }
}
