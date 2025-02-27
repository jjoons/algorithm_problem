import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        solution1();
    }

    private static void solution1() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try (br; bw) {
            String nStr = br.readLine();
            String decimalStr = br.readLine();
            int totalDecimalCount = 0;

            int n = Integer.parseInt(nStr);
            String[] decimalStrArr = decimalStr.split(" ");

            for (String s : decimalStrArr) {
                int ss = Integer.parseInt(s);
                totalDecimalCount += isDecimal(ss) ? 1 : 0;
            }

            bw.write(String.valueOf(totalDecimalCount));
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static boolean isDecimal(int n) {
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        return count == 2;
    }

    private static int[] getFractions(int n) {
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                list.add(i);

                if (n / i != i) {
                    list.add(i);
                }
            }
        }

        return list.stream()
            .mapToInt(Integer::intValue)
            .sorted()
            .toArray();
    }
}
