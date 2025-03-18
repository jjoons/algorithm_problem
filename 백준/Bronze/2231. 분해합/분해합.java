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
            String nStr = br.readLine();
            int n = Integer.parseInt(nStr);

            if (n <= 18 && n % 2 == 0) {
                bw.write(String.valueOf(n / 2));
                bw.newLine();
                bw.flush();
                return;
            } else if (n == 1) {
                bw.write("0");
                bw.newLine();
                bw.flush();
                return;
            }

            int result = 0;

            for (int i = 1; i <= n; i++) {
                int[] arr = intStringToIntArray(String.valueOf(i));
                int iValue = intArrayPlus(arr);

                if (n == i + iValue) {
                    result = i;
                    break;
                }
            }

            bw.write(String.valueOf(result));
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static int[] intStringToIntArray(String str) {
        if (str == null || str.isEmpty()) {
            return new int[0];
        }

        int[] result = new int[str.length()];

        for (int i = 0; i < result.length; i++) {
            char ch = str.charAt(i);
            String s = Character.toString(ch);
            result[i] = Integer.parseInt(s);
        }

        return result;
    }

    private static int intArrayPlus(int[] arr) {
        return Arrays.stream(arr)
            .reduce(0, Integer::sum);
    }
}
