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
            } else if (n == 1) {
                bw.write("0");
                bw.newLine();
                bw.flush();
                return;
            }

            int minX = 10_001;
            int maxX = -10_001;
            int minY = 10_001;
            int maxY = -10_001;

            for (int i = 0; i < n; i++) {
                String[] xyStrArr = br.readLine().split(" ");
                int x = Integer.parseInt(xyStrArr[0]);
                int y = Integer.parseInt(xyStrArr[1]);

                if (x > maxX) {
                    maxX = x;
                }

                if (x < minX) {
                    minX = x;
                }

                if (y > maxY) {
                    maxY = y;
                }

                if (y < minY) {
                    minY = y;
                }
            }

            int width = Math.abs(maxX - minX);
            int height = Math.abs(maxY - minY);
            int result = width * height;

            bw.write(String.valueOf(result));
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
