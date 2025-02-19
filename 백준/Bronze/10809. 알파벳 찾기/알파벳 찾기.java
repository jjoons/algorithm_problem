import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int LOWERCASE_ASCII_CODE_START = 97;
        final int[] wordCount = new int[]{
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
            -1, -1, -1, -1, -1, -1,
        };
        final String word = sc.nextLine();
        final char[] wordArray = word.toCharArray();

        for (int i = 0; i < wordArray.length; i++) {
            final char letter = wordArray[i];

            if (wordCount[letter - LOWERCASE_ASCII_CODE_START] == -1) {
                wordCount[letter - LOWERCASE_ASCII_CODE_START] = i;
            }
        }

        final StringBuilder result = new StringBuilder();

        for (int i = 0; i < wordCount.length; i++) {
            int count = wordCount[i];
            result.append(count);

            if (i < wordCount.length - 1) {
                result.append(" ");
            }
        }

        System.out.println(result);
    }
}
