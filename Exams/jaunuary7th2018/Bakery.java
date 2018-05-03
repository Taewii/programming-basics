package jaunuary7th2018;

import java.util.Scanner;

public class Bakery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double startDough = Double.parseDouble(scanner.nextLine());
        double PretzelWeight = Double.parseDouble(scanner.nextLine());
        double PretzelPrice = Double.parseDouble(scanner.nextLine());
        double PretzelsSold = Double.parseDouble(scanner.nextLine());
        double CookiesSold = Double.parseDouble(scanner.nextLine());

        double pretzelRevenue = PretzelsSold * PretzelPrice;
        double doughForPretzels = PretzelsSold * PretzelWeight;
        double doughLeftForCookies = startDough - doughForPretzels;
        double doughMadeForCookies = startDough - doughLeftForCookies;
        double cookiePrice = PretzelPrice * 1.25;
        double cookieWeight = PretzelWeight * 0.80;
        double cookiesRevenue = CookiesSold * cookiePrice;
        double doughForCookies = CookiesSold * cookieWeight;

        double doughUsed = doughForPretzels + doughForCookies;
        double doughUsedPrice = (startDough / 1000 + doughMadeForCookies / 1000) * 4;
        double revenueForTheNight = (pretzelRevenue + cookiesRevenue) - doughUsedPrice;

        System.out.printf("Pure income: %.2f lv.", revenueForTheNight);
        System.out.printf("%nDough used: %.0f g.", doughUsed);
    }
}
