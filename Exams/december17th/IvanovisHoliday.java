package december17th;

import java.util.Scanner;

public class IvanovisHoliday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nights = Double.parseDouble(scanner.nextLine());
        String destination = scanner.nextLine();
        String transport = scanner.nextLine();

        double sum = 0;
        double transportSum = 0;

        switch (destination){
            case "Miami":
                if (nights <= 10){
                    sum = (nights * ((2 * 24.99) + (3 * 14.99))) * 1.25;
                } else if (nights <= 15) {
                    sum = (nights * ((2 * 22.99) + (3 * 11.99))) * 1.25;
                } else {
                    sum = (nights * ((2 * 20.00) + (3 * 10.00))) * 1.25;
                }
                break;
            case "Canary Islands":
                if (nights <= 10){
                    sum = (nights * ((2 * 32.50) + (3 * 28.50))) * 1.25;
                } else if (nights <= 15) {
                    sum = (nights * ((2 * 30.50) + (3 * 25.60))) * 1.25;
                } else {
                    sum = (nights * ((2 * 28.00) + (3 * 22.00))) * 1.25;
                }
                break;
            case "Philippines":
                if (nights <= 10){
                    sum = (nights * ((2 * 42.99) + (3 * 39.99))) * 1.25;
                } else if (nights <= 15) {
                    sum = (nights * ((2 * 41.00) + (3 * 36.00))) * 1.25;
                } else {
                    sum = (nights * ((2 * 38.50) + (3 * 32.40))) * 1.25;
                }
                break;
        }
        switch (transport){
            case "train":
                transportSum = (2 * 22.30) + (3 * 12.50);
                break;
            case "bus":
                transportSum = (2 * 45.00) + (3 * 37.00);
                break;
            case "airplane":
                transportSum = (2 * 90.00) + (3 * 68.50);
                break;
        }
        System.out.printf("%.3f", sum + transportSum);
    }
}
