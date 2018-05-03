package september17th;

import java.util.Scanner;

public class ThreeBrothers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double first = Double.parseDouble(scanner.nextLine());
        double second = Double.parseDouble(scanner.nextLine());
        double third = Double.parseDouble(scanner.nextLine());
        double time = Double.parseDouble(scanner.nextLine());

        double cleaningTime = (1 / ((1 / first) + (1 / second) + (1 / third)));
        double breakk = cleaningTime * 1.15;

        double result = time - breakk;

        System.out.printf("Cleaning time: %.2f", breakk);

        if (result > 0) {
            System.out.printf("%nYes, there is a surprise - time left -> %.0f hours.", Math.floor(result));
        } else {
            System.out.printf("%nNo, there isn't a surprise - shortage of time -> %.0f hours.", Math.ceil(breakk - time));
        }
    }
}
