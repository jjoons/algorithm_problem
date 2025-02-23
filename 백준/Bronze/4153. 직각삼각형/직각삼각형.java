import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        while (true) {
            final int a = sc.nextInt();
            final int b = sc.nextInt();
            final int c = sc.nextInt();
            sc.nextLine();

            if (a == 0 && b == 0 && c == 0) {
                break;
            }

            final int[] abc = {a, b, c};
            final int[] xyz = {
                (int) Math.sqrt(a * a + b * b),
                (int) Math.sqrt(a * a + c * c),
                (int) Math.sqrt(b * b + c * c)
            };
            boolean isBreak = false;
            String result = "wrong";

            for (int i = 0; i < abc.length; i++) {
                final int iValue = abc[i];

                for (int j = 0; j < xyz.length; j++) {
                    final int jValue = xyz[j];

                    if (iValue == jValue) {
                        result = "right";
                        isBreak = true;
                        break;
                    }
                }

                if (isBreak) break;
            }

            System.out.println(result);
        }
    }
}
