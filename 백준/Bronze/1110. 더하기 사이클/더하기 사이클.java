import java.io.*;
import java.util.Objects;

class Main {
    public static void main(String[] args) {
        solution1();
    }

    private static void solution1() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try (br; bw) {
            String n = br.readLine();
            int ni = Integer.parseInt(n);
            if (ni == 0) {
                System.out.println("1");
                return;
            } else if (ni < 10) {
                n = "0" + n;
            }

            int[] nArr = stringToIntArray(n.split(""));
            int cycleCount = 0;

            do {
                int a = nArr[1];
                int b = nArr[0] + a;

                nArr[0] = getLastDigit(a);
                nArr[1] = getLastDigit(b);

                cycleCount++;
            } while (concatIntArr(nArr) != ni);

            bw.write(String.valueOf(cycleCount));
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static int[] stringToIntArray(String[] strArr) {
        Objects.requireNonNull(strArr);

        int[] arr = new int[strArr.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }

        return arr;
    }

    private static int getLastDigit(int num) {
        if (num < 10 && num > -10) {
            return num;
        }

        String str = String.valueOf(num);
        String[] arr = str.split("");

        return Integer.parseInt(arr[arr.length - 1]);
    }

    private static int concatInt(int... ints) {
        return concatIntArr(ints);
    }

    private static int concatIntArr(int[] intArr) {
        if (intArr.length == 0) {
            return 0;
        } else if (intArr.length == 1) {
            return intArr[0];
        }

        StringBuilder sb = new StringBuilder();

        for (int i : intArr) {
            sb.append(i);
        }

        return Integer.parseInt(sb.toString());
    }
}
