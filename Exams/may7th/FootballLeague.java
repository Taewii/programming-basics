package may7th;

import java.util.Scanner;

public class FootballLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double stadium = Double.parseDouble(scanner.nextLine());
        double allFans = Double.parseDouble(scanner.nextLine());

        double a = 0;
        double b = 0;
        double v = 0;
        double g = 0;

        for (int i = 0; i < allFans; i++) {
            String fan = scanner.nextLine();

            switch (fan) {
                case "A":
                    a++;
                    break;
                case "B":
                    b++;
                    break;
                case "V":
                    v++;
                    break;
                case "G":
                    g++;
                    break;
            }
        }

        double aPercent = a / allFans * 100;
        double bPercent = b / allFans * 100;
        double vPercent = v / allFans * 100;
        double gPercent = g / allFans * 100;
        double stadiumPercent = allFans / stadium * 100;

        System.out.printf("%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%%n",
                aPercent, bPercent, vPercent, gPercent, stadiumPercent);
    }
}
