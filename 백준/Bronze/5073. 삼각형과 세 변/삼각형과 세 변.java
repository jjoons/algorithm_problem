import java.io.*;

class Main {
    public static void main(final String[] args) {
        try {
            solution1();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void solution1() throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            final String[] lineArr = br.readLine().split(" ");
            final int[] arr = new int[lineArr.length];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(lineArr[i]);
            }

            if (hasArrayExistOnlyZero(arr)) {
                break;
            }

            final String name = getTriangleName(arr);
            bw.write(name);
            bw.newLine();
            bw.flush();
        }

        br.close();
        bw.close();
    }

    private static String getTriangleName(final int[] arr) {
        if (!isTriangle(arr)) {
            return "Invalid";
        }

        final int a = arr[0];
        final int b = arr[1];
        final int c = arr[2];

        if (a == b && b == c) {
            return "Equilateral";
        } else if (a == b || b == c || a == c) {
            return "Isosceles";
        }

        return "Scalene";
    }

    private static boolean isTriangle(final int[] arr) {
        return isTriangle(arr[0], arr[1], arr[2]);
    }

    private static boolean isTriangle(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return false;
        }

        return a + b > c && a + c > b && b + c > a;
    }

    private static boolean hasArrayExistOnlyZero(final int[] arr) {
        if (arr.length == 0) {
            return false;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                return false;
            }
        }

        return true;
    }
}
