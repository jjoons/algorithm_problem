import java.util.*;

public class Main {
    private static <T> void println(T msg) {
        System.out.println(msg);
    }

    public static void main(String... args) {
        var sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        // List<Integer> l = new ArrayList<>();
        
        String bStr = String.valueOf(b);
        String[] bArr = bStr.split("");
        
        for (int i = bArr.length - 1; i >= 0; i--) {
            int bIntSingle = Integer.parseInt(bArr[i]);
            println(a * bIntSingle);
        }
        
        println(a * b);
    }
}
