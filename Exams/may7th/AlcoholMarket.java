package may7th;

import java.util.Scanner;

public class AlcoholMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double whiskeyPrice = Double.parseDouble(scanner.nextLine());
        double beer = Double.parseDouble(scanner.nextLine());
        double wine = Double.parseDouble(scanner.nextLine());
        double RAKIQEEEEEEEEEEEEEEEEEY = Double.parseDouble(scanner.nextLine());
        double whiskey = Double.parseDouble(scanner.nextLine());

        double rakiqPrice = whiskeyPrice / 2;
        double winePrice = rakiqPrice - (0.4 * rakiqPrice);
        double beerPrice = rakiqPrice - (0.8 * rakiqPrice);

        double rakiqSum = RAKIQEEEEEEEEEEEEEEEEEY * rakiqPrice;
        double wineSum = wine * winePrice;
        double beerSum = beer * beerPrice;
        double whiskeySum = whiskey * whiskeyPrice;

        System.out.printf("%.2f", rakiqSum + whiskeySum + beerSum + wineSum);
    }
}
