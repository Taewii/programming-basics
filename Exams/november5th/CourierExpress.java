package november5th;

import java.util.Scanner;

public class CourierExpress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double weight = Double.parseDouble(scanner.nextLine());
        String type = scanner.nextLine();
        double km = Double.parseDouble(scanner.nextLine());

        double pricePerKm = 0;

        if (weight <= 1.0) {
            pricePerKm = 0.03;
        } else if (weight <= 10) {
            pricePerKm = 0.05;
        } else if (weight <= 40) {
            pricePerKm = 0.1;
        } else if (weight <= 90) {
            pricePerKm = 0.15;
        } else if (weight <= 150) {
            pricePerKm = 0.2;
        }

        double priceForDelivery = km * pricePerKm;

        double expressPrice = 0.0;

        if (type.equals("express")) {
            if (weight <= 1.0) {
                expressPrice = 0.8 * 0.03;
            } else if (weight <= 10) {
                expressPrice = 0.4 * 0.05;
            } else if (weight <= 40) {
                expressPrice = 0.05 * 0.1;
            } else if (weight <= 90) {
                expressPrice = 0.02 * 0.15;
            } else if (weight <= 150) {
                expressPrice = 0.01 * 0.2;
            }
            priceForDelivery = expressPrice * weight * km + priceForDelivery;
        }
        System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.",
                weight, priceForDelivery);
    }
}
