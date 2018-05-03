package december16th;

import java.util.Scanner;

public class SantasHoliday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double days = Double.parseDouble(scanner.nextLine());
        String placeToStay = scanner.nextLine();
        String grade = scanner.nextLine();

        double sum = 0;

        switch (placeToStay) {
            case "room for one person":
                sum = (days - 1) * 18;
                break;
            case "apartment":
                sum = (days - 1) * 25;
                if (days < 10) {
                    sum *= 0.7;
                } else if (days < 15) {
                    sum *= 0.65;
                } else {
                    sum /= 2;
                }
                break;
            case "president apartment":
                sum = (days - 1) * 35;
                if (days < 10) {
                    sum *= 0.9;
                } else if (days < 15) {
                    sum *= 0.85;
                } else {
                    sum *= 0.8;
                }
                break;
        }

        if (grade.equals("positive")) {
            sum *= 1.25;
        } else {
            sum *= 0.90;
        }
        System.out.printf("%.2f", sum);
    }
}
