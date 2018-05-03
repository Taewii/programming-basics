package december16th;

import java.util.Scanner;

public class DeerOfSanta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double days = Double.parseDouble(scanner.nextLine());
        double food = Double.parseDouble(scanner.nextLine());
        double deer1 = Double.parseDouble(scanner.nextLine());
        double deer2 = Double.parseDouble(scanner.nextLine());
        double deer3 = Double.parseDouble(scanner.nextLine());

        double sum = days * deer1 + days * deer2 + days * deer3;

        if (sum < food){
            System.out.printf("%.0f kilos of food left.", Math.floor(food - sum));
        } else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(sum - food));
        }
    }
}
