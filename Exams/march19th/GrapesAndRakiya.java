package march19th;

import java.util.Scanner;

public class GrapesAndRakiya {    // gives 75/100 for some reason
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double area = Double.parseDouble(scanner.nextLine());
        double kilograms = Double.parseDouble(scanner.nextLine());
        double garbage = Double.parseDouble(scanner.nextLine());

        double weightGrapes = 7.5;
        double priceGrapes = 9.8;
        double priceRakiya = 1.5;

        double grapes = (area * kilograms) - garbage;
        double rakiya = 0.45 * grapes;
        double income = (rakiya / weightGrapes) * priceGrapes;

        System.out.printf("%.2f%n%.2f", income, 0.55 * grapes * priceRakiya);
    }
}
