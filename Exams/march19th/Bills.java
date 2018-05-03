package march19th;

import java.util.Scanner;

public class Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int months = Integer.parseInt(scanner.nextLine());

        double electricity = 0;
        double water = months * 20;
        double internet = months * 15;
        double other = 0;

        for (int i = 0; i < months; i++) {
            double value = Double.parseDouble(scanner.nextLine());

            electricity += value;
            other += 1.2 * (value + 20 + 15);
        }

        double average = (electricity + water + internet + other) / months;

        System.out.printf("Electricity: %.2f lv%n" +
                "Water: %.2f lv%n" +
                "Internet: %.2f lv%n" +
                "Other: %.2f lv%n" +
                "Average: %.2f lv", electricity, water, internet, other, average);
    }
}
