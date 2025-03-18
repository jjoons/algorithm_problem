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
            String n = inputStrArr[0];
            int b = Integer.parseInt(inputStrArr[1]);

            int[] nCodes = new int[n.length()];
            int result = 0;

            for (int i = 0; i < nCodes.length; i++) {
                char ch = n.charAt(i);

                if (ch >= '0' && ch <= '9') {
                    nCodes[i] = ch - '0';
                } else if (ch >= 'A' && ch <= 'Z') {
                    nCodes[i] = ch - 'A' + 10;
                }
            }

            for (int i = 0, iReverse = nCodes.length - 1; i < nCodes.length; i++, iReverse--) {
                int code = nCodes[i];

                result += (int) Math.pow(b, iReverse) * code;
            }

            bw.write(String.valueOf(result));
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
