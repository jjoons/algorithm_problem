import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        int sMinkookTotalScore = 0;
        int tManseTotalScore = 0;

        for (int j = 0; j < 4; j++) {
            final int score = sc.nextInt();
            sMinkookTotalScore += score;
        }

        sc.nextLine();

        for (int j = 0; j < 4; j++) {
            final int score = sc.nextInt();
            tManseTotalScore += score;
        }

        if (sMinkookTotalScore > tManseTotalScore) {
            System.out.println(sMinkookTotalScore);
        } else if (tManseTotalScore > sMinkookTotalScore) {
            System.out.println(tManseTotalScore);
        } else {
            System.out.println(sMinkookTotalScore);
        }
    }
}
