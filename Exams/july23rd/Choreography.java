package july23rd;

import java.util.Scanner;

public class Choreography {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double steps = Double.parseDouble(scanner.nextLine());
        double dancers = Double.parseDouble(scanner.nextLine());
        double days = Double.parseDouble(scanner.nextLine());

        double stepsADay = Math.ceil(((steps / days) / steps) * 100);
        double everyDancer = stepsADay / dancers;

        if (stepsADay < 13) {
            System.out.printf("Yes, they will succeed in that goal! %.2f%%.", everyDancer);
        } else {
            System.out.printf("No, They will not succeed in that goal! Required %.2f%% steps to be learned per day.", Math.ceil(everyDancer * 100.0) / 100.0);
        }
    }
}
