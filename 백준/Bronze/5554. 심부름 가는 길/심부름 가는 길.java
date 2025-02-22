import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        int totalMoveTime = 0;

        for (int i = 0; i < 4; i++) {
            final int moveTime = sc.nextInt();
            totalMoveTime += moveTime;
        }

        final int xMoveMinutes = totalMoveTime / 60;
        final int yMoveSeconds = totalMoveTime % 60;

        System.out.println(xMoveMinutes);
        System.out.println(yMoveSeconds);
    }
}
