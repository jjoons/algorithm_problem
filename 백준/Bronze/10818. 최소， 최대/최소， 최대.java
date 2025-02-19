import java.io.*;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        final String repeatCountStr = br.readLine();
        final int repeatCount = Integer.parseInt(repeatCountStr);
        final String numberStr = br.readLine();
        final String[] numberStrArray = numberStr.split(" ");

        int minNumber = 1_000_001;
        int maxNumber = -1_000_001;

        for (int i = 0; i < repeatCount; i++) {
            final String numStr = numberStrArray[i];
            final int num = Integer.parseInt(numStr);

            if (num < minNumber) {
                minNumber = num;
            }

            if (num > maxNumber) {
                maxNumber = num;
            }
        }

        bw.write(String.valueOf(minNumber));
        bw.write(" ");
        bw.write(String.valueOf(maxNumber));
        bw.flush();
    }
}
