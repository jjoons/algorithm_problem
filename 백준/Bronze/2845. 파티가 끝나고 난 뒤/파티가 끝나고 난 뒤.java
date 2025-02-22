import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int lParticipantCount = sc.nextInt();
        final int pArea = sc.nextInt();
        sc.nextLine();

        final int totalParticipantCount = lParticipantCount * pArea;

        for (int i = 0; i < 5; i++) {
            final int articleParticipantCount = sc.nextInt();

            System.out.print(articleParticipantCount - totalParticipantCount + " ");
        }
    }
}
