import java.io.*;

class Main {
    public static void main(String[] args) {
        solution1();
    }

    private static void solution1() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try (br; bw) {
            String inputStr = br.readLine();
            int num = Integer.parseInt(inputStr);
            int result = fibonacci(num);

            bw.write(String.valueOf(result));
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static int fibonacci(int num) {
        if (num < 0) {
            throw new RuntimeException("");
        } else if (num >= 0 && num <= 1) {
            return num;
        }

        int a = 0;
        int b = 1;

        for (int i = 2; i <= num; i++) {
            int temp = b;
            b = a + b;
            a = temp;
        }

        return b;
    }
}
