import java.io.*;

class Main {
    public static void main(String[] args) {
        solution1();
    }

    private static void solution1() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try (br; bw) {
            String nStr = br.readLine();
            int n = Integer.parseInt(nStr);
            if (n <= 0) {
                return;
            }

            String[] scores = br.readLine().split(" ");
            double totalScore = 0.0;
            int maxScore = 1;

            for (int i = 0; i < scores.length; i++) {
                String scoreStr = scores[i];
                int score = Integer.parseInt(scoreStr);
                totalScore += score;

                if (score > maxScore) {
                    maxScore = score;
                }
            }

            double result = (totalScore / n) / maxScore * 100;

            bw.write(String.valueOf(result));
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
