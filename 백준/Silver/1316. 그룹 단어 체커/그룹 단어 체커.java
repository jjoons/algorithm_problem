import java.io.*;

class Main {
    public static void main(String[] args) {
        solution1();
    }

    private static void solution1() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try (br; bw) {
            String nCountStr = br.readLine();
            int n = Integer.parseInt(nCountStr);
            int groupCount = 0;

            for (int i = 0; i < n; i++) {
                String word = br.readLine();
                int length = word.length();

                if (length <= 2) {
                    groupCount++;
                    continue;
                }

                int[] indexArr = new int[26];
                indexArr[word.charAt(0) - 97]++;

                for (int j = 1; j < length; j++) {
                    char bc = word.charAt(j - 1);
                    char c = word.charAt(j);
                    int ci = indexArr[c - 97];

                    // 그룹 단어 확인
                    //   그 전 문자와 현재 문자가 다르고 현재 문자가 이미 카운트된 상태면 실행
                    if (bc != c && ci >= 1) {
                        indexArr[c - 97] = -1;
                        break;
                    }

                    indexArr[c - 97]++;

                    if (j >= length - 1) {
                        groupCount++;
                    }
                }
            }

            bw.write(String.valueOf(groupCount));
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
