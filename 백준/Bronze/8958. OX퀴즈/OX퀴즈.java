import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int count = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < count; i++) {
            final String input = sc.nextLine();
            final String[] arr = input.split("");
            int oCount = 0;
            int score = 0;

            for (int j = 0; j < arr.length; j++) {
                final String text = arr[j];

                if (text.equals("O")) {
                    oCount++;
                    score += oCount;
                } else {
                    oCount = 0;
                }
            }

            System.out.println(score);
        }
    }
}
