package june25th;

import java.util.Scanner;

public class PrizeMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double PrizePerPoint = Double.parseDouble(scanner.nextLine());

        double sum = 0;

        for (int i = 1; i <= n; i++) {
            double points = Double.parseDouble(scanner.nextLine());
            if (i % 2 == 0){
                sum += points * 2;
            } else {
                sum += points;
            }
        }
        System.out.printf("The project prize was %.2f lv.", sum * PrizePerPoint);
    }
}
