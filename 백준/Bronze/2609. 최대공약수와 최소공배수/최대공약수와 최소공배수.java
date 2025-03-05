import java.io.*;

class Main {
    public static void main(String[] args) {
        solution1();
    }

    private static void solution1() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try (br; bw) {
            String[] strArr = br.readLine().split(" ");
            int a = Integer.parseInt(strArr[0]);
            int b = Integer.parseInt(strArr[1]);

            int greatCommonDivisor = euclideanGCD(a, b);
            int leastCommonMultiple = a * b / greatCommonDivisor;

            bw.write(String.valueOf(greatCommonDivisor));
            bw.newLine();
            bw.write(String.valueOf(leastCommonMultiple));
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static int euclideanGCD(int a, int b) {
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}
