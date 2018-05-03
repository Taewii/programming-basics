package july23rd;

import java.util.Scanner;

public class EnergyLoss {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double days = Double.parseDouble(scanner.nextLine());
        double dancers = Double.parseDouble(scanner.nextLine());

        double sum = 0;
        double allEnergy = 100 * (dancers * days);

        for (int i = 1; i <= days; i++) {
            double hours = Double.parseDouble(scanner.nextLine());

            if (i % 2 == 0 && hours % 2 == 0) {
                sum += dancers * 68;
            } else if (i % 2 != 0 && hours % 2 == 0) {
                sum += dancers * 49;
            } else if (i % 2 == 0 && hours % 2 != 0) {
                sum += dancers * 65;
            } else {
                sum += dancers * 30;
            }
        }

        double energyLeft = allEnergy - sum;
        double energyLeftPerDancer = (energyLeft / dancers) / days;

        if (energyLeftPerDancer >= 50){
            System.out.printf("They feel good! Energy left: %.2f", energyLeftPerDancer);
        } else {
            System.out.printf("They are wasted! Energy left: %.2f", energyLeftPerDancer);
        }
    }
}
