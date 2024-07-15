import java.util.*;

public class Main {
    private static <T> void println(T msg) {
        System.out.println(msg);
    }

    public static void main(String... args) {
        var sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        println((a + b) % c);
        println(((a % c) + (b % c)) % c);
        println((a * b) % c);
        println(((a % c) * b % c) % c);
    }
}
