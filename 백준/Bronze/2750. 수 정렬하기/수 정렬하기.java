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
            int[] arr = new int[n];

            for (int i = 0; i < arr.length; i++) {
                String numStr = br.readLine();
                arr[i] = Integer.parseInt(numStr);
            }

            insertionSort(arr);

            for (int i : arr) {
                bw.write(String.valueOf(i));
                bw.newLine();
            }

            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }
}
