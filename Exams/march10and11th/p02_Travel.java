package march10and11th;

import java.util.Scanner;

public class p02_Travel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = Double.parseDouble(scanner.nextLine());
        double v = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());

        double carSpeed = y * 3.6;
        double total = v + carSpeed;

        double truckTime = Math.ceil(x / v);
        double carTime = Math.ceil(x / total);

        System.out.printf("The truck arrived after %.0f hours%n", truckTime);
        System.out.printf("The car arrived after %.0f hours", carTime);
    }
}
