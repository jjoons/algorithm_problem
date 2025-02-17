import java.io.*;

public class Main {
    public static void main(String[] args) {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            final String countStr = br.readLine();
            final long count = Long.parseLong(countStr);

            for (int i = 0; i < count; i++) {
                final String str = br.readLine();
                final String[] strArr = str.split(" ");

                final long a = Long.parseLong(strArr[0]);
                final long b = Long.parseLong(strArr[1]);

                bw.write((a + b) + "\n");
            }

            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
