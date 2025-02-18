import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int[] diceCountArr = new int[6];
        int prizes = -1;
        int biggestDiceIndex = 0;

        final String[] inputArr = sc.nextLine().split(" ");

        for (int i = 0; i < inputArr.length; i++) {
            final short num = Short.parseShort(inputArr[i]);
            final int index = num - 1;
            diceCountArr[index]++;
        }

        for (int i = 0; i < diceCountArr.length; i++) {
            final int count = diceCountArr[i];
            final int dice = i + 1;

            if (i > biggestDiceIndex && count >= diceCountArr[biggestDiceIndex]) {
                biggestDiceIndex = i;
            }

            if (count >= 3) {
                prizes = 10000 + dice * 1000;
                break;
            } else if (count == 2) {
                prizes = 1000 + dice * 100;
                break;
            }
        }

        if (prizes < 0) {
            prizes = (biggestDiceIndex + 1) * 100;
        }

        System.out.println(prizes);
    }
}
