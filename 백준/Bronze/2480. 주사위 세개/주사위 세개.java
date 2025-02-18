import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int COUNT = 3;
        final int[] diceCountArr = new int[6];
        int prizes = -1;
        int biggestDiceIndex = 0;

        for (int i = 0; i < COUNT; i++) {
            final short num = sc.nextShort();
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
