import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int aCurrentHours = sc.nextInt();
        final int bCurrentMinutes = sc.nextInt();
        final int cRequireMinutes = sc.nextInt();

        int completeMinutes = bCurrentMinutes + cRequireMinutes;
        int completeHours = aCurrentHours + completeMinutes / 60;
        completeMinutes %= 60;
        completeHours %= 24;

        System.out.printf("%d %d", completeHours, completeMinutes);
    }
}
