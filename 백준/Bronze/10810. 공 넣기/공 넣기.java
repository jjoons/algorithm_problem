import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int nBasket = sc.nextInt();
        final int mInsertBall = sc.nextInt();
        sc.nextLine();

        final int[] basketList = new int[nBasket];

        for (int i = 0; i < mInsertBall; i++) {
            final int iStartBasket = sc.nextInt();
            final int jEndBasket = sc.nextInt();
            final int kBallNo = sc.nextInt();

            for (int j = iStartBasket - 1; j < jEndBasket; j++) {
                basketList[j] = kBallNo;
            }
        }

        for (int i = 0; i < basketList.length; i++) {
            final int ballNo = basketList[i];
            System.out.print(ballNo + " ");
        }
    }
}
