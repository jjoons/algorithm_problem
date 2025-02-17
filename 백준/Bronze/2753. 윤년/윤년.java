import java.util.Scanner;

public class Main {
    private static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int year = sc.nextInt();

        final boolean leapYear = isLeapYear(year);
        System.out.println(leapYear ? 1 : 0);
    }
}
