import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int lVacationDays = sc.nextInt();
        final int aKoreanTotalPage = sc.nextInt();
        final int bMathTotalPage = sc.nextInt();
        final int cKoreanMaxPage = sc.nextInt();
        final int dMathMaxPage = sc.nextInt();

        final int koreanStudyDays = aKoreanTotalPage / cKoreanMaxPage + (aKoreanTotalPage % cKoreanMaxPage > 0 ? 1 : 0);
        final int mathStudyDays = bMathTotalPage / dMathMaxPage + (bMathTotalPage % dMathMaxPage > 0 ? 1 : 0);
        final int playDays = lVacationDays - max(koreanStudyDays, mathStudyDays);

        System.out.println(playDays);
    }

    private static int max(int a, int b) {
        return a > b ? a : b; // or Math.max(a, b)
    }
}
