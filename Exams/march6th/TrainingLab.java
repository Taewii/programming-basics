package march6th;

import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());

        double roomWidth = (width * 100) - 100;
        double desks = Math.floor(roomWidth / 70);
        double roomLength = (length * 100);
        double rows = Math.floor(roomLength / 120);
        double seats = (desks * rows) - 3;

        System.out.printf("%.0f", seats);
    }
}
