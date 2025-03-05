import java.io.*;

class Main {
    public static void main(String[] args) {
        solution1();
    }

    private static void solution1() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try (br; bw) {
            String lStr = br.readLine();
            int l = Integer.parseInt(lStr);
            String str = br.readLine();
            long result = 0;

            for (int i = 0; i < l; i++) {
                char c = str.charAt(i);
                result += (c - 96) * (long) Math.pow(31, i);
            }

            bw.write(String.valueOf(result));
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
