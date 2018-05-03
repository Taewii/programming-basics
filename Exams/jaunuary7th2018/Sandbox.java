package jaunuary7th2018;

import java.util.Scanner;

public class Sandbox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width = Double.parseDouble(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());
        double priceSand = Double.parseDouble(scanner.nextLine());
        double pricePlank = Double.parseDouble(scanner.nextLine());

        double area = width * length;
        double areaSand = (width - (0.2 + 0.2)) * (length - (0.2 + 0.2));
        double border = area - areaSand;
        double sandNeeded = Math.ceil(areaSand * 20);
        double plankNeeded = Math.ceil(border / (2.2 * 0.2));
        double sandPrice = sandNeeded * priceSand;
        double plankPrice = plankNeeded * pricePlank;

        System.out.printf("%.2f", sandPrice + plankPrice);
    }
}

