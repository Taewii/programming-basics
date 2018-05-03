package september3rd;

import java.util.Scanner;

public class    TailoringWorkshop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tables = Double.parseDouble(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());

        double area1 = tables * (length + 2 * 0.30) * (width + 2 * 0.30);
        double area2 = tables * (length / 2) * (length / 2);

        double dollars = (area1 * 7) + (area2 * 9);
        double leva = dollars * 1.85;

        System.out.printf("%.2f%s%n%.2f%s", dollars, " USD", leva, " BGN");
    }
}
