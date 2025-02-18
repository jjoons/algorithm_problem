import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final String input = sc.nextLine();
        final char[] charArr = input.toCharArray();

        for (int i = 0; i < charArr.length; i++) {
            final char c = charArr[i];

            if (Character.isLowerCase(c)) {
                charArr[i] = Character.toUpperCase(c);
            } else if (Character.isUpperCase(c)) {
                charArr[i] = Character.toLowerCase(c);
            }
        }
        
        final String result = String.valueOf(charArr);
        System.out.println(result);
    }
}
