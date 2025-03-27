import java.io.*;

class Main {
    public static void main(String[] args) {
        solution1();
    }

    private static void solution1() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try (br; bw) {
            String inputStr = br.readLine();
            String[] inputStrArr = inputStr.split(" ");

            int[] inputNumbers = stringArrayToIntArray(inputStrArr);
            int n = inputNumbers[0];
            int m = inputNumbers[1];
            int[] resultArr = new int[n];

            for (int i = 0; i < n; i++) {
                resultArr[i] = i + 1;
            }

            for (int iter = 0; iter < m; iter++) {
                String[] currInputArr = br.readLine().split(" ");
                int[] currInputNumbers = stringArrayToIntArray(currInputArr);
                int i = currInputNumbers[0] - 1;
                int j = currInputNumbers[1] - 1;

                if (i == j) {
                    continue;
                }

                int temp = resultArr[i];
                resultArr[i] = resultArr[j];
                resultArr[j] = temp;
            }

            for (int i = 0; i < resultArr.length; i++) {
                int value = resultArr[i];

                bw.write(String.valueOf(value));

                if (i < resultArr.length - 1) {
                    bw.write(" ");
                }
            }

            //bw.write(String.valueOf(result));
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static int[] stringArrayToIntArray(String[] strArr) {
        int[] arr = new int[strArr.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }

        return arr;
    }
}
