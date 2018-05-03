package september17th;

import java.util.Scanner;

public class MobileOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String lengthOfContract = scanner.nextLine();
        String typeOfContract = scanner.nextLine();
        String internet = scanner.nextLine();
        double months = Double.parseDouble(scanner.nextLine());

        double result = 0;
        double discount;
        double discount2;

        if (lengthOfContract.equals("one")) {
            switch (typeOfContract) {
                case "Small":
                    if (internet.equals("yes")) {
                        result = 9.98 + 5.50;
                    } else {
                        result = 9.98;
                    }
                    break;
                case "Middle":
                    if (internet.equals("yes")) {
                        result = 18.99 + 4.35;
                    } else {
                        result = 18.99;
                    }
                    break;
                case "Large":
                    if (internet.equals("yes")) {
                        result = 25.98 + 4.35;
                    } else {
                        result = 25.98;
                    }
                    break;
                case "ExtraLarge":
                    if (internet.equals("yes")) {
                        result = 35.99 + 3.85;
                    } else {
                        result = 35.99;
                    }
                    break;
            }

        } else if (lengthOfContract.equals("two")) {
            switch (typeOfContract) {
                case "Small":
                    if (internet.equals("yes")) {
                        result = 8.58 + 5.50;
                    } else {
                        result = 8.58;
                    }
                    break;
                case "Middle":
                    if (internet.equals("yes")) {
                        result = 17.09 + 4.35;
                    } else {
                        result = 17.09;
                    }
                    break;
                case "Large":
                    if (internet.equals("yes")) {
                        result = 23.59 + 4.35;
                    } else {
                        result = 23.59;
                    }
                    break;
                case "ExtraLarge":
                    if (internet.equals("yes")) {
                        result = 31.79 + 3.85;
                    } else {
                        result = 31.79;
                    }
                    break;
            }
        }

        if (lengthOfContract.equals("two")) {
            discount = result * (3.75 / 100);
            discount2 = result - discount;
            System.out.printf("%.2f lv.", months * discount2);
        } else {
            System.out.printf("%.2f lv.", result * months);
        }
    }
}
