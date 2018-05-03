package november5th;

import java.util.Scanner;

public class ExternalEvaluation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double n1 = 0;
        double n2 = 0;
        double n3 = 0;
        double n4 = 0;
        double n5 = 0;

        for (int i = 0; i < n; i++) {
            double grade = Double.parseDouble(scanner.nextLine());

            if (grade <= 22.5) {
                n1++;
            } else if (grade <= 40.5) {
                n2++;
            } else if (grade <= 58.5) {
                n3++;
            } else if (grade <= 76.5) {
                n4++;
            } else if (grade <= 100) {
                n5++;
            }
        }

        double n1Percent = n1 * 100 / n;
        double n2Percent = n2 * 100 / n;
        double n3Percent = n3 * 100 / n;
        double n4Percent = n4 * 100 / n;
        double n5Percent = n5 * 100 / n;

        System.out.printf("%.2f%% poor marks%n%.2f%% satisfactory marks" +
                        "%n%.2f%% good marks%n%.2f%% very good marks%n%.2f%% excellent marks",
                n1Percent, n2Percent, n3Percent, n4Percent, n5Percent);
    }
}
