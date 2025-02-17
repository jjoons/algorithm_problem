import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int totalCount = sc.nextInt();
        sc.nextLine();

        final String arrStr = sc.nextLine();
        final String[] arr = arrStr.split(" ");
        final int search = sc.nextInt();

        List<String> list = Arrays.stream(arr)
            .filter(s -> search == Integer.parseInt(s))
            .collect(Collectors.toList());

        System.out.println(list.size());
    }
}
