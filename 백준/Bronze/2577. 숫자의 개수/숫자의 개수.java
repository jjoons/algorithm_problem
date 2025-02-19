import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int[] numberCountArr = new int[10];
        int total = 1;

        for (int i = 0; i < 3; i++) {
            total *= sc.nextInt();
        }

        final String[] a = String.valueOf(total).split("");

        for (int i = 0; i < a.length; i++) {
            final int num = Integer.parseInt(a[i]);
            numberCountArr[num]++;
        }

        for (int i = 0; i < numberCountArr.length; i++) {
            System.out.println(numberCountArr[i]);
        }
    }
}
