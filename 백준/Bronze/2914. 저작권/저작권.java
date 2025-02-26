import java.io.*;

class Main {
    public static void main(final String[] args) {
        try {
            solution1();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void solution1() throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        final String[] inputArr = br.readLine().split(" ");
        final int a = Integer.parseInt(inputArr[0]);
        final int iAverage = Integer.parseInt(inputArr[1]);

        final int result = (a * (iAverage - 1)) + 1;
        bw.write(String.valueOf(result));
        bw.newLine();
        bw.flush();

        br.close();
        bw.close();
    }
}
