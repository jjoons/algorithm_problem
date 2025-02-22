import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        while (true) {
            final int maleFriendCount = sc.nextInt();
            final int femaleFriendCount = sc.nextInt();
            sc.nextLine();

            if (maleFriendCount == 0 && femaleFriendCount == 0) {
                break;
            }

            System.out.println(maleFriendCount + femaleFriendCount);
        }
    }
}
