import java.io.*;

class Main {
    public static void main(String[] args) {
        solution1();
    }

    private static final int[][] caches = new int[15][14];

    static {
        for (int i = 0; i < caches[0].length; i++) {
            caches[0][i] = i + 1;
        }
    }

    private static void solution1() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try (br; bw) {
            String tStr = br.readLine();
            int t = Integer.parseInt(tStr);

            for (int i = 0; i < t; i++) {
                String kStr = br.readLine();
                String nStr = br.readLine();
                int k = Integer.parseInt(kStr);
                int n = Integer.parseInt(nStr);

                int result = getPeople(k, n);
                bw.write(String.valueOf(result));
                bw.newLine();
                bw.flush();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static int getPeople(int k, int n) {
        int kk = k - 1;
        int nn = n - 1;

        if (caches[k][nn] == 0) {
            if (k >= 2 && caches[kk][nn] == 0) {
                getPeople(kk, 1);
            }

            caches[k][0] = 1;

            for (int i = 1; i < caches[k].length; i++) {
                int a = caches[k][i - 1]; // 옆집(현재 호수 - 1) 거주자수
                int b = caches[kk][i]; // 아랫집 거주자수
                caches[k][i] = a + b;
            }
        }

        return caches[k][nn];
    }

    private static int getPeopleFailed1(int k, int n) {
        n--;

        if (caches[k][n] == 0) {
            int downstairs = k - 1;
            caches[k][0] = 1;

            for (int i = 1; i < caches[k].length; i++) {
                int a = caches[k][i - 1]; // 옆집(현재 호수 - 1) 거주자수
                int b = caches[downstairs][i]; // 아랫집 거주자수
                caches[k][i] = a + b;
            }
        }

        return caches[k][n];
    }
}
