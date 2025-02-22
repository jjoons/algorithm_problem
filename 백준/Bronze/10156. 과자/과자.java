import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int kSnackPrice = sc.nextInt();
        final int nCount = sc.nextInt();
        final int mBalance = sc.nextInt();

        int receivableAmount = kSnackPrice * nCount - mBalance;

        if (receivableAmount < 0) {
            receivableAmount = 0;
        }

        System.out.println(receivableAmount);
    }
}
