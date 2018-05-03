package june25th;

import java.util.Scanner;

public class FruitCocktail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String size = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double sum = 0;

        switch (fruit) {
            case "Watermelon":
                if (size.equals("big")) {
                    sum = 5 * 28.7;
                } else {
                    sum = 2 * 56;
                }
                break;
            case "Mango":
                if (size.equals("big")) {
                    sum = 5 * 19.6;
                } else {
                    sum = 2 * 36.66;
                }
                break;
            case "Pineapple":
                if (size.equals("big")) {
                    sum = 5 * 24.8;
                } else {
                    sum = 2 * 42.1;
                }
                break;
            case "Raspberry":
                if (size.equals("big")) {
                    sum = 5 * 15.2;
                } else {
                    sum = 2 * 20;
                }
                break;
        }

        double result = quantity * sum;

        if (result > 1000) {
            result *= 0.50;
        } else if (result >= 400 && result <= 1000) {
            result *= 0.85;
        }
        System.out.printf("%.2f lv.", result);
    }
}
