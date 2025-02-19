import java.util.Scanner;

class Main {
    private static String repeatString(String str, int count) {
        if (count <= 1) {
            return str;
        }

        return str + repeatString(str, count - 1);
    }

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int testCount = sc.nextInt();

        for (int i = 0; i < testCount; i++) {
            final int letterRepeatCount = sc.nextInt();
            final String text = sc.nextLine().trim();
            final String[] textArr = text.split("");
            final StringBuilder outputText = new StringBuilder();

            for (int j = 0; j < textArr.length; j++) {
                final String letter = textArr[j];
                outputText.append(repeatString(letter, letterRepeatCount));
            }

            System.out.println(outputText);
        }
    }
}
