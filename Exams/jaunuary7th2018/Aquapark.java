package jaunuary7th2018;

import java.util.Scanner;

public class Aquapark {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine().toLowerCase();
        double hours = Double.parseDouble(scanner.nextLine());
        double people = Double.parseDouble(scanner.nextLine());
        String timeOfDay = scanner.nextLine().toLowerCase();

        double value = 0;

        if ((month.equals("january")
                || month.equals("february")
                || month.equals("march")
                || month.equals("april")
                || month.equals("may"))
                && timeOfDay.equals("day")) {

            value = 10.50;
        } else if ((month.equals("january")
                || month.equals("february")
                || month.equals("march")
                || month.equals("april")
                || month.equals("may"))
                && timeOfDay.equals("night")) {

            value = 8.40;
        } else if ((month.equals("june")
                || month.equals("july")
                || month.equals("august")
                || month.equals("september")
                || month.equals("october")
                || month.equals("november")
                || month.equals("december"))
                && (timeOfDay.equals("day"))) {

            value = 12.60;
        } else {
            value = 10.20;
        }
        if (people >= 4) {
            value = value * 0.90;
        }
        if (hours >= 5) {
            value = value * 0.5;
        }
        System.out.printf("Price per person for one hour: %.2f", value);
        System.out.printf("%nTotal cost of the visit: %.2f", (value * people * hours));
    }
}