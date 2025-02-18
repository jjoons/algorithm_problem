import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final int[] originalCounts = new int[]{1, 1, 2, 2, 2, 8};
        final Scanner sc = new Scanner(System.in);
        final StringBuilder sb = new StringBuilder();

        for (int i = 0; i < originalCounts.length; i++) {
            final int originalCount = originalCounts[i];
            final int count = sc.nextInt();
            sb.append((originalCount - count) + " ");
        }

        System.out.println(sb.toString().trim());
    }
}
