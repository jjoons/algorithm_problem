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
            String[] inputStrArr = inputStr.split(" ");
            int[] inputNumbers = new int[inputStrArr.length];

            for (int i = 0; i < inputNumbers.length; i++) {
                inputNumbers[i] = Integer.parseInt(inputStrArr[i]);
            }

            int a = inputNumbers[0];
            int b = inputNumbers[1];
            int c = inputNumbers[2];

            long revenue = (long) c - b;

            if (revenue <= 0) {
                bw.write("-1");
                bw.newLine();
                bw.flush();
                return;
            }

            long result = a / revenue + 1L;

            bw.write(String.valueOf(result));
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}