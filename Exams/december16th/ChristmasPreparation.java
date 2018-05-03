package december16th;

import java.util.Scanner;

public class ChristmasPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double paper = Double.parseDouble(scanner.nextLine());
        double cloth = Double.parseDouble(scanner.nextLine());
        double glue  = Double.parseDouble(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double sum = paper * 5.80 + cloth * 7.20 + glue * 1.20;
        double result = (sum * percent) / 100;
        System.out.printf("%.3f", sum - result);
    }
}
