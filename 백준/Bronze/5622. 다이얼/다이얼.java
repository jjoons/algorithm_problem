import java.io.*;

class Main {
    public static void main(String[] args) {
        solution1();
    }

    private static void solution1() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try (br; bw) {
            String word = br.readLine();
            int time = 0;

            String[] wordArr = word.split("");

            // 0 = OPERATOR?

            for (int i = 0; i < wordArr.length; i++) {
                char ch = wordArr[i].charAt(0);

                if (ch >= 'A' && ch <= 'Z') {
                    time += 1;
                }

                if (ch >= 'W' && ch <= 'Z') {
                    time += 9;
                } else if (ch >= 'T') {
                    time += 8;
                } else if (ch >= 'P') {
                    time += 7;
                } else if (ch >= 'M') {
                    time += 6;
                } else if (ch >= 'J') {
                    time += 5;
                } else if (ch >= 'G') {
                    time += 4;
                } else if (ch >= 'D') {
                    time += 3;
                } else if (ch >= 'A') {
                    time += 2;
                }
            }

            bw.write(String.valueOf(time));
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
