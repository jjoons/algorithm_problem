import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    private static void solution1() throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final String inputText = br.readLine();

        final String text = inputText.trim();
        final String[] arr = text.split(" ");
        int wordCount = 0;

        for (int i = 0; i < arr.length; i++) {
            final String str = arr[i];

            if (!str.isBlank()) {
                wordCount++;
            }
        }

        System.out.println(wordCount);
    }

    public static void main(String[] args) throws IOException {
        solution1();
    }
}
