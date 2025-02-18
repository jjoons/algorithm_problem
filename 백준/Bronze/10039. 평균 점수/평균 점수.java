import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int STUDENT_COUNT = 5;
        int totalScore = 0;

        for (int i = 0; i < STUDENT_COUNT; i++) {
            final int score = sc.nextInt();
            sc.nextLine();

            if (score < 40) {
                totalScore += 40;
            } else {
                totalScore += score;
            }
        }

        final int averageScore = totalScore / STUDENT_COUNT;
        System.out.println(averageScore);
    }
}
