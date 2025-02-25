import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            String result = "";
            int front = 0;
            int back = 0;

            for (int j = 0; j < 4; j++) {
                final int value = sc.nextInt();

                if (value == 0) {
                    front++;
                } else if (value == 1) {
                    back++;
                }
            }

            if (i < 2) {
                sc.nextLine();
            }

            if (front == 1) {
                result = "A";
            } else if (front == 2) {
                result = "B";
            } else if (front == 3) {
                result = "C";
            } else if (front == 4) {
                result = "D";
            } else if (back == 4) {
                result = "E";
            }

            System.out.println(result);
        }
    }
}
