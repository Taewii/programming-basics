package jaunuary7th2018;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salary = Double.parseDouble(scanner.nextLine());
        double years = Double.parseDouble(scanner.nextLine());
        String retarded = scanner.nextLine();

        double total = salary;

        for (int i = 1; i < 1000; i++) {
            total = total * 1.06;
            if (i % 5 == 0) {
                total += 100;
            }
            if (i % 10 == 0) {
                total += 100;
            }
            if (retarded.equals("Yes") && (i % 5 != 0 || i % 10 != 0)) {
                total *= 0.99;
            }
            if (i == years && total < 5000) {
                System.out.printf("Current salary: %.2f", total);
            } else if (total >= 5000 && years >= i) {
                System.out.printf("Current salary: 5000.00 %n0 more years to max salary.");
                break;
            }
            if (total >= 5000) {
                System.out.printf("%n%.0f more years to max salary.", i - 1 - years);
                break;
            }
        }
    }
}
