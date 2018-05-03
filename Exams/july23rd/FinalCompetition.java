package july23rd;

import java.util.Scanner;

public class FinalCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double dancers = Double.parseDouble(scanner.nextLine());
        double points = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String location = scanner.nextLine();

        double sum = 0;

        switch (location){
            case "Bulgaria":
                sum = (points * dancers);
                if (season.equals("summer")) {
                    sum *= 0.95;
                } else {
                    sum *= 0.92;
                }
                break;
            case "Abroad":
                sum = (points * dancers) * 1.50;
                if (season.equals("summer")) {
                    sum *= 0.9;
                } else {
                    sum *= 0.85;
                }
                break;
        }
        double charity = sum - (sum * 0.25);
        double sumLeft = sum - charity;

        System.out.printf("Charity - %.2f%n", charity);
        System.out.printf("Money per dancer - %.2f", sumLeft / dancers);

    }
}
