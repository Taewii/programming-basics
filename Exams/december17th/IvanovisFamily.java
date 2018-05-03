package december17th;

import java.util.Scanner;

public class IvanovisFamily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double present1 = Double.parseDouble(scanner.nextLine());
        double present2 = Double.parseDouble(scanner.nextLine());
        double presemt3 = Double.parseDouble(scanner.nextLine());

        double sum = 0;

        sum = present1 + present2 + presemt3;
        double charity = (budget - sum) * 0.90;

        System.out.printf("%.2f", charity);
    }
}
