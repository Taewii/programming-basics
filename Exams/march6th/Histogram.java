package march6th;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        double p5 = 0;


        for (int i = 0; i < n; i++) {
            double number = Double.parseDouble(scanner.nextLine());

            if (number < 200){
                p1++;
            } else if (number <= 399){
                p2++;
            } else if (number <= 599){
                p3++;
            } else if (number <= 799){
                p4++;
            } else {
                p5++;
            }

        }
        double p1Percentage = p1 * 100 / n;
        double p2Percentage = p2 * 100 / n;
        double p3Percentage = p3 * 100 / n;
        double p4Percentage = p4 * 100 / n;
        double p5Percentage = p5 * 100 / n;

        System.out.printf("%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%",
                p1Percentage, p2Percentage, p3Percentage, p4Percentage, p5Percentage);
    }
}
