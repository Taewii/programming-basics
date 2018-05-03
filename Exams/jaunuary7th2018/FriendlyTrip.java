package jaunuary7th2018;

import java.util.Scanner;

public class FriendlyTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double distance = Double.parseDouble(scanner.nextLine());
        double mpg = Double.parseDouble(scanner.nextLine());
        double pricePerLitre = Double.parseDouble(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

        double mpgSum = (distance * mpg) / 100;
        double priceForFuel = mpgSum * pricePerLitre;

        if (priceForFuel <= budget) {
            System.out.printf("You can take a trip. %.2f money left.", budget - priceForFuel);
        } else {
            System.out.printf("Sorry, you cannot take a trip. Each will receive %.2f money.", budget / 5);
        }
    }
}
