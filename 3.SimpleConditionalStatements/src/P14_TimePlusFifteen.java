import java.util.Scanner;

public class P14_TimePlusFifteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());

        int result = hour * 60 + min + 15;

        int currentHour = result / 60;
        int currentMin = result - currentHour * 60;

        if (currentHour >= 24) {
            currentHour = currentHour - 24;
        }
        if (currentMin < 10) {
            System.out.printf("%d:0%d", currentHour, currentMin);
        } else {
            System.out.printf("%d:%d", currentHour, currentMin);
        }
    }
}
