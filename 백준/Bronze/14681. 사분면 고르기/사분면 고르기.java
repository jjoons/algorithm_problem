import java.util.*;

public class Main {
    private static <T> void println(T msg) {
        System.out.println(msg);
    }

    public static void main(String... args) {
        var sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        if (x >= 0 && y >= 0) println(1);
        else if (x < 0 && y >= 0) println(2);
        else if (x < 0 && y < 0) println(3);
        else println(4);
    }
}
