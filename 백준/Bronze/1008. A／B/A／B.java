import java.util.Scanner;

public class Main {
    private static <T> void println(T msg) {
        System.out.println(msg);
    }

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        double a = (double) sc.nextInt();
        double b = (double) sc.nextInt();
        
        println(a / b);
    }
}