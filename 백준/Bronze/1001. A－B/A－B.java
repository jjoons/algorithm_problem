import java.util.*;

public class Main {
    private static <T> void println(T msg) {
        System.out.println(msg);
    }

    public static void main(String... args) {
        var sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        println(a - b);
    }
}
