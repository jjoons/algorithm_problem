import java.io.*;

class Main {
    public static void main(final String[] args) {
        solution1();
    }

    private static void solution1() {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try (br; bw) {
            int total = 0;
            int min = 100;

            for (int i = 0; i < 7; i++) {
                final String inputValue = br.readLine();
                final int value = Integer.parseInt(inputValue);

                if (value % 2 == 1) {
                    total += value;

                    if (value < min) {
                        min = value;
                    }
                }
            }

            if (total == 0) {
                System.out.println(-1);
                return;
            }

            System.out.println(total + "\n" + min);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
