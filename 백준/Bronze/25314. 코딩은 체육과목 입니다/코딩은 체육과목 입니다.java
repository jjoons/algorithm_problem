import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final StringBuilder sb = new StringBuilder();
        final int bit = sc.nextInt();
        final int repeatCount = bit / 4;

        for (int i = 0; i < repeatCount; i++) {
            sb.append("long ");
        }

        sb.append("int");

        System.out.println(sb);
    }
}
