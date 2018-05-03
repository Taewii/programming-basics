package march19th;

import java.util.Scanner;

public class TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        double km = Double.parseDouble(scanner.nextLine());

        double value = 0;

        switch (season) {
            case "Spring":
            case "Autumn":
                if (km <= 5000) {
                    value = 0.75;
                } else if (km <= 10000) {
                    value = 0.95;
                } else {
                    value = 1.45;
                }
                break;
            case "Summer":
                if (km <= 5000) {
                    value = 0.9;
                } else if (km <= 10000) {
                    value = 1.1;
                } else {
                    value = 1.45;
                }
                break;
            case "Winter":
                if (km <= 5000) {
                    value = 1.05;
                } else if (km <= 10000) {
                    value = 1.25;
                } else {
                    value = 1.45;
                }
                break;
        }
        System.out.printf("%.2f", 0.9 * ((value * km) * 4));
    }
}
