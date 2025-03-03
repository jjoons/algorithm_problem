import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

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
            ArrayList<Integer> list = new ArrayList<>(n);

            for (int i = 0; i < n; i++) {
                String numStr = br.readLine();
                int num = Integer.parseInt(numStr);
                list.add(num);
            }

            Collections.sort(list);

            for (int i : list) {
                bw.write(String.valueOf(i));
                bw.newLine();
            }

            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
