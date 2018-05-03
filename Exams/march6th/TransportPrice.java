package march6th;

import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double km = Double.parseDouble(scanner.nextLine());
        String timeOfDay = scanner.nextLine();

        double value = 0;

        if (km < 20) {
            if (timeOfDay.equals("day")) {
                value = 0.70 + (0.79 * km);
            } else {
                value = 0.70 + (0.90 * km);
            }
        } else if (km < 100) {
            value = 0.09 * km;
        } else {
            value = 0.06 * km;
        }
        System.out.println(value);
    }
}
