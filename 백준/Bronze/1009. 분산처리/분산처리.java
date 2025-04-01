import java.io.*;
import java.math.BigInteger;

class Main {
    public static void main(String[] args) {
        solution1();
    }

    private static int[][] DIGITS = {
        {0, 0, 0, 0},
        {1, 1, 1, 1},
        {2, 4, 8, 6},
        {3, 9, 7, 1},
        {4, 6, 4, 6}, // 2
        {5, 5, 5, 5}, // 1
        {6, 6, 6, 6}, // 1
        {7, 9, 3, 1},
        {8, 4, 2, 6},
        {9, 1, 9, 1}  // 2
    };

    private static void solution1() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try (br; bw) {
            String tStr = br.readLine();
            int t = Integer.parseInt(tStr);

            for (int i = 0; i < t; i++) {
                String[] ab = br.readLine().split(" ");

                int a = Integer.parseInt(ab[0]);
                int b = Integer.parseInt(ab[1]);

                int result;
                if (a % 10 == 0) {
                    result = 10;
                } else {
                    result = DIGITS[a % 10][(b - 1) % 4];
                }

                bw.write(String.valueOf(result));
                bw.newLine();
            }

            // bw.write(String.valueOf(result));
            // bw.newLine();
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
