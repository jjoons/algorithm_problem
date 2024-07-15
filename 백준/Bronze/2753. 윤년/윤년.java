import java.util.*;

public class Main {
    private static <T> void println(T msg) {
        System.out.println(msg);
    }
    
    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

    public static void main(String... args) {
        var sc = new Scanner(System.in);
        int y = sc.nextInt();
        
        println(isLeapYear(y) ? 1 : 0);
    }
}
