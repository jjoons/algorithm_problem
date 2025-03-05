import java.io.*;

class Main {
    public static void main(String[] args) {
        solution3();
    }

    private static void solution3() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try (br; bw) {
            while (true) {
                String str = br.readLine();
                if (str.equals("0")) break;

                boolean isPalindrome = true;
                String[] arr = str.split("");
                int repeatCount = arr.length / 2;

                for (int i = 0, j = arr.length - 1; i < repeatCount; i++, j--) {
                    String iValue = arr[i];
                    String jValue = arr[j];

                    if (!iValue.equals(jValue)) {
                        isPalindrome = false;
                        break;
                    }
                }

                bw.write(isPalindrome ? "yes" : "no");
                bw.newLine();
                bw.flush();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
