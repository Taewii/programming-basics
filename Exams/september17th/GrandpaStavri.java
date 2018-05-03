package september17th;

import java.util.Scanner;

public class GrandpaStavri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double days = Double.parseDouble(scanner.nextLine());

        double litres = 0;
        double percents = 0;

        for (int i = 0; i < days; i++) {
            double n = Double.parseDouble(scanner.nextLine());
            double proof = Double.parseDouble(scanner.nextLine());

            litres += n;
            percents += n * proof;
        }

        double finalPercent = percents / litres;

        System.out.printf("Liter: %.2f%n", litres);
        System.out.printf("Degrees: %.2f%n", finalPercent);

        if (finalPercent < 38){
            System.out.println("Not good, you should baking!");
        } else if (finalPercent <= 42){
            System.out.println("Super!");
        } else {
            System.out.println("Dilution with distilled water!");
        }
    }
}
