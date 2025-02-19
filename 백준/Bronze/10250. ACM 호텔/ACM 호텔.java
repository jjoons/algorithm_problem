import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int testDataCount = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < testDataCount; i++) {
            final int height = sc.nextInt();
            final int width = sc.nextInt();
            final int no = sc.nextInt();
            sc.nextLine();

            int roomFloor = no % height;
            if (roomFloor == 0) {
                roomFloor = height;
            }

            final int roomNo = no / height + (no % height == 0 ? 0 : 1);
            final String roomNoStr = (roomNo < 10 ? "0" : "") + roomNo;

            final String result = String.format("%d%s", roomFloor, roomNoStr);
            System.out.println(result);
        }
    }
}
