package march10and11th;

import java.util.Scanner;

public class p01_Hearthstone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int restTime = Integer.parseInt(scanner.nextLine());
        double deckPrice = Double.parseDouble(scanner.nextLine());
        double adventurePrice = Double.parseDouble(scanner.nextLine());
        double coffeePrice = Double.parseDouble(scanner.nextLine());

        int timeLeft = restTime - 15;
        double moneySpent = (3 * deckPrice) + (2 * adventurePrice) + coffeePrice;

        System.out.printf("%.2f%n", moneySpent);
        System.out.println(timeLeft);
    }
}
