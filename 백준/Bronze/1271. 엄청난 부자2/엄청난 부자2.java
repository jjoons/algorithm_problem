import java.math.BigInteger;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final BigInteger totalMoney = sc.nextBigInteger();
        final BigInteger divideCount = sc.nextBigInteger();

        final BigInteger x = totalMoney.divide(divideCount);
        final BigInteger r = totalMoney.remainder(divideCount);

        System.out.println(x);
        System.out.println(r);
    }
}
