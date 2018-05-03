package june25th;

import java.util.Scanner;

public class CharityCampaign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double days = Double.parseDouble(scanner.nextLine());
        double bakers = Double.parseDouble(scanner.nextLine());
        double cakes = Double.parseDouble(scanner.nextLine());
        double waffles = Double.parseDouble(scanner.nextLine());
        double pankcakes = Double.parseDouble(scanner.nextLine());

        double cakePrices = cakes * 45;
        double wafflePrices = waffles * 5.80;
        double pancakePrices = pankcakes * 3.20;

        double stuffmade = ((cakePrices + wafflePrices + pancakePrices) * bakers) * days;
        double afterExpenses = stuffmade * 0.875; // DOESN'T CALCULATE 1/8TH LIKE IT FUCKING SHOULD

        System.out.printf("%.2f", afterExpenses);
    }
}
