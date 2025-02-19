import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        int maxNum = 0;
        int maxIndex = 0;

        for (int i = 0; i < 9; i++) {
            final int num = sc.nextInt();

            if (num > maxNum) {
                maxNum = num;
                maxIndex = i;
            }
        }

        System.out.println(maxNum);
        System.out.println(maxIndex + 1);
    }
}
