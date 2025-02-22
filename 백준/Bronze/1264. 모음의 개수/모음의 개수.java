import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        while (true) {
            final String text = sc.nextLine();
            if (text.equals("#")) break;

            int vowelCount = 0;

            for (int i = 0; i < text.length(); i++) {
                final char letter = text.charAt(i);
                final char lowerCaseLetter = Character.toLowerCase(letter);

                switch (lowerCaseLetter) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        vowelCount++;
                        break;
                }
            }

            System.out.println(vowelCount);
        }
    }
}
