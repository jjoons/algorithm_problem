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

        final int TOTAL_LOOP = 4;
        int currentPeople = 0;
        int maxPeople = 0;

        for (int i = 0; i < TOTAL_LOOP; i++) {
            final String[] inputArr = br.readLine().split(" ");
            final int outPeople = Integer.parseInt(inputArr[0]);
            final int inPeople = Integer.parseInt(inputArr[1]);

            currentPeople -= outPeople;

            if (currentPeople < 0) {
                currentPeople = 0;
            }

            currentPeople += inPeople;

            if (currentPeople > maxPeople) {
                maxPeople = currentPeople;
            }
        }

        bw.write(String.valueOf(maxPeople));
        bw.newLine();
        bw.flush();

        br.close();
        bw.close();
    }
}
