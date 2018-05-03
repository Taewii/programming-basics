package december17th;

import java.util.Scanner;

public class NewYearsEveParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double guests = Double.parseDouble(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

        double covert = guests * 20;
        double moneyLeft = budget - covert;
        double fireworks = moneyLeft * 0.60;
        double donation = moneyLeft - fireworks;

        if (covert < budget) {
            System.out.printf("Yes! %.0f lv are for fireworks and %.0f lv are for donation.", donation, fireworks);
        } else {
            System.out.printf("They won't have enough money to pay the covert. They will need %.0f lv more.", covert - budget);
        }
    }
}
