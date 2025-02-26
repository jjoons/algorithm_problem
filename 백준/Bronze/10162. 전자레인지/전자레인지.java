import java.io.*;

class Main {
    public static void main(final String[] args) {
        solution1();
    }

    private static void solution1() {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try (br; bw) {
            final String inputText = br.readLine();
            final int t = Integer.parseInt(inputText);

            final int[] times = {300, 60, 10};

            if (t % times[times.length - 1] > 0) {
                println(bw, -1);
                return;
            }

            int remaining = t;
            final int[] counts = new int[times.length];

            for (int i = 0; i < times.length; i++) {
                final int time = times[i];

                counts[i] = remaining / time;
                remaining -= time * counts[i];
            }

            for (int i = 0; i < counts.length; i++) {
                bw.write(String.valueOf(counts[i]));

                if (i < counts.length - 1) {
                    bw.write(" ");
                }
            }

            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void println(BufferedWriter writer) {
        try {
            writer.newLine();
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void println(BufferedWriter writer, String value) {
        try {
            writer.write(value);
            println(writer);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void println(BufferedWriter writer, int value) {
        try {
            writer.write(String.valueOf(value));
            println(writer);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
