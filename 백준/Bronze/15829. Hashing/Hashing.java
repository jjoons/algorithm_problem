import java.io.*;
import java.math.BigInteger;

class Main {
    public static void main(String[] args) {
        solution3();
    }

    private static void solution3() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try (br; bw) {
            String lStr = br.readLine();
            int l = Integer.parseInt(lStr);
            String str = br.readLine();
            String[] strArr = str.split("");
            BigInteger result = BigInteger.ZERO;

            final long M = 1_234_567_891;
            final BigInteger mBigInt = BigInteger.valueOf(M);

            for (int i = 0; i < strArr.length; i++) {
                char c = str.charAt(i);
                BigInteger abcNum = BigInteger.valueOf((long) (c - 96));
                BigInteger exp = BigInteger.valueOf(31L).pow(i);
                BigInteger thisResult = abcNum.multiply(exp);
                result = result.add(thisResult);
            }

            result = result.mod(mBigInt);

            bw.write(result.toString());
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}