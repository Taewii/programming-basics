package march19th;

import java.util.Scanner;

public class Styrofoam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double area = Double.parseDouble(scanner.nextLine());
        double windows = Double.parseDouble(scanner.nextLine());
        double areaInPacket = Double.parseDouble(scanner.nextLine());
        double pricePerPacket = Double.parseDouble(scanner.nextLine());

        double areaWithoutWindows = 1.10 * (area - (windows * 2.4));
        double packetsNeeded = Math.ceil(areaWithoutWindows / areaInPacket) * pricePerPacket;

        if (packetsNeeded < budget){
            System.out.printf("Spent: %.2f%n", packetsNeeded);
            System.out.printf("Left: %.2f", budget - packetsNeeded);
        } else {
            System.out.printf("Need more: %.2f", packetsNeeded - budget);
        }
    }
}
