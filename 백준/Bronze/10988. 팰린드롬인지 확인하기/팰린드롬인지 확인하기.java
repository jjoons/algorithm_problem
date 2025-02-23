import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final String str = sc.nextLine();
        final int strLength = str.length();
        final int repeatCount = strLength / 2;

        boolean isPalindrome = true;

        for (int i = 0; i < repeatCount; i++) {
            final char aLetter = str.charAt(i);
            final char bLetter = str.charAt(strLength - 1 - i);

            if (aLetter != bLetter) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println(isPalindrome ? 1 : 0);
    }
}
