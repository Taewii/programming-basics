package november5th;

import java.util.Scanner;

public class WireNet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        double price = Double.parseDouble(scanner.nextLine());
        double weight = Double.parseDouble(scanner.nextLine());

        double fenceLength = (2 * length) + (2 * width);
        double fencePrice = fenceLength * price;
        double fenceArea = fenceLength * height;
        double fenceWeight = fenceArea * weight;

        System.out.printf("%.0f%n%.2f%n%.3f", fenceLength, fencePrice, fenceWeight);
    }
}
