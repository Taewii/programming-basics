package september17th;

import java.util.Scanner;

public class Birthday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        double p = Double.parseDouble(scanner.nextLine());

        double area = (a * b * h) * 0.001;
        double percent = p * 0.01;

        double result = area * (1 - percent);

        System.out.printf("%.3f", result);
    }
}
