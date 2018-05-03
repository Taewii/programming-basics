package december16th;

import java.util.Scanner;

public class DwarfPresents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double helpers = Double.parseDouble(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

        double sum = 0;

        for (int i = 0; i < helpers; i++) {
            String present = scanner.nextLine();
            switch (present){
                case "sand clock":
                    sum += 2.2;
                    break;
                case "magnet":
                    sum += 1.5;
                    break;
                case "cup":
                    sum += 5;
                    break;
                case "t-shirt":
                    sum += 10;
            }
        }
        if (sum <= budget){
            System.out.printf("Santa Claus has %.2f more leva left!", budget - sum);
        } else {
            System.out.printf("Santa Claus will need %.2f more leva.", sum - budget);
        }
    }
}
