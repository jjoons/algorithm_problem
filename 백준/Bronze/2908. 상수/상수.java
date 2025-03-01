import java.io.*;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        solution1();
    }

    private static void solution1() {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try (sc; br; bw) {
            int biggestNum = 0;

            for (int i = 0; i < 2; i++) {
                String str = sc.next();
                StringBuilder sb = new StringBuilder(str);
                str = sb.reverse().toString();

                int num = Integer.parseInt(str);

                if (num > biggestNum) {
                    biggestNum = num;
                }
            }

            bw.write(String.valueOf(biggestNum));
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
