import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final String str = sc.nextLine();
        int vowelCount = 0;

        for (int i = 0; i < str.length(); i++) {
            final char letter = str.charAt(i);

            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                vowelCount++;
            }
        }

        System.out.println(vowelCount);
    }
}
