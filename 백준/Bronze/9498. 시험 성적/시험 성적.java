import java.util.*;

public class Main {
    private static <T> void println(T msg) {
        System.out.println(msg);
    }

    public static void main(String... args) {
        var sc = new Scanner(System.in);
        int score = sc.nextInt();
        
        if (score >= 90) println("A");
        else if (score >= 80) println("B");
        else if (score >= 70) println("C");
        else if (score >= 60) println("D");
        else println("F");
    }
}
