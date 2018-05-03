package march19thMorning;

import java.util.Scanner;

public class Cups {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double cups = Double.parseDouble(scanner.nextLine());
        double workers = Double.parseDouble(scanner.nextLine());
        double days = Double.parseDouble(scanner.nextLine());

        double hours = workers * days * 8;
        double cupsMade = Math.floor(hours / 5);

        if (cups > cupsMade){
            System.out.printf("Losses: %.2f", (cups - cupsMade) * 4.2);
        } else {
            System.out.printf("%.2f extra money", (cupsMade - cups) * 4.2);
        }
    }
}
