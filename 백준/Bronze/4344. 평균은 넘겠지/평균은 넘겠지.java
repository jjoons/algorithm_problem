import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int testLineCount = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < testLineCount; i++) {
            final int studentCount = sc.nextInt();
            final int[] scores = new int[studentCount];
            int totalScore = 0;

            for (int j = 0; j < studentCount; j++) {
                final int score = sc.nextInt();
                totalScore += score;
                scores[j] = score;
            }

            final double averageScore = (double) totalScore / studentCount;
            int aboveAverageStudentCount = 0;

            for (int j = 0; j < studentCount; j++) {
                final int score = scores[j];

                if (score > averageScore) {
                    aboveAverageStudentCount++;
                }
            }

            final double ratio = (double) aboveAverageStudentCount / studentCount;
            final double aboveAverageStudentRatio = (double) ratio * 100;
            final String result = String.format("%.3f%%", aboveAverageStudentRatio);
            System.out.println(result);

            sc.nextLine();
        }
    }
}
