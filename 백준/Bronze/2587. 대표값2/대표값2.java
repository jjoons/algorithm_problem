import java.io.*;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        solution1();
    }

    private static void solution1() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try (br; bw) {
            // String inputStr = br.readLine();
            final int COUNT = 5;
            int[] arr = new int[COUNT];
            int average = 0;

            for (int i = 0; i < COUNT; i++) {
                String currentStr = br.readLine();
                int currentValue = Integer.parseInt(currentStr);
                arr[i] = currentValue;
                average += currentValue;
            }

            Arrays.sort(arr);

            average /= COUNT;
            bw.write(String.valueOf(average));
            bw.newLine();

            int midIndex = COUNT / 2;
            bw.write(String.valueOf(arr[midIndex]));

            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
