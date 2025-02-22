import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int SECONDS_PER_DAY = 86400;

        int hours = sc.nextInt();
        int minutes = sc.nextInt();
        int seconds = sc.nextInt();
        sc.nextLine();
        int adjustTime = sc.nextInt();

        if (adjustTime % SECONDS_PER_DAY == 0) {
            printTime(hours, minutes, seconds);
            return;
        }

        seconds += adjustTime % 60;
        minutes += adjustTime / 60;

        if (seconds >= 60) {
            minutes += seconds / 60;
            seconds %= 60;
        }

        if (minutes >= 60) {
            hours += minutes / 60;
            minutes %= 60;
        }

        if (hours >= 24) {
            hours = hours % 24;
        }

        printTime(hours, minutes, seconds);
    }

    private static void printTime(int hours, int minutes, int seconds) {
        System.out.println(hours + " " + minutes + " " + seconds);
    }
}
