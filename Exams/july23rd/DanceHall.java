package july23rd;

import java.util.Scanner;

public class DanceHall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double lockerSide = Double.parseDouble(scanner.nextLine());

        double area = (length * 100) * (width * 100);
        double lockerArea = (lockerSide * 100) * (lockerSide * 100);
        double bench = area / 10;

        double areaLeft = area - lockerArea - bench;

        double dancers = areaLeft / (40 + 7000);

        System.out.printf("%.0f", Math.floor(dancers));
    }
}
