import java.io.*;

class Main {
    public static void main(String[] args) {
        solution1();
    }

    private static void solution1() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try (br; bw) {
            String[] nmStrArr = br.readLine().split(" ");
            int n = Integer.parseInt(nmStrArr[0]);
            int m = Integer.parseInt(nmStrArr[1]);
            String[] cardStrArr = br.readLine().split(" ");
            int[] cards = new int[n];

            for (int i = 0; i < n; i++) {
                cards[i] = Integer.parseInt(cardStrArr[i]);
            }

            int result = blackjack(cards, m);

            bw.write(String.valueOf(result));
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static int blackjack(int[] arr, int m) {
        int maxNum = 0;

        for (int i = 0; i < arr.length; i++) {
            int iCard = arr[i];

            for (int j = i + 1; j < arr.length; j++) {
                if (i == j) {
                    continue;
                }

                int jCard = arr[j];

                for (int k = j + 1; k < arr.length; k++) {
                    if (j == k) {
                        continue;
                    }

                    int kCard = arr[k];
                    int total = iCard + jCard + kCard;

                    if (m >= total && total > maxNum) {
                        maxNum = total;
                    }
                }
            }
        }

        return maxNum;
    }
}
