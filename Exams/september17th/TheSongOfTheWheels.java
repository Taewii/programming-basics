package september17th;

import java.util.Scanner;

public class TheSongOfTheWheels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int control = Integer.parseInt(scanner.nextLine());

        int counter = 0;
        int password = 0;

        for (int a = 1; a <= 9; a++) {
            for (int b = 1; b <= 9; b++) {
                for (int c = 1; c <= 9; c++) {
                    for (int d = 1; d <= 9; d++) {

                        if (a < b && c > d && a * b + c * d == control) {
                            counter++;
                            System.out.printf("%d%d%d%d ", a, b, c, d);
                        }
                        if (counter == 4 && a < b && c > d && a * b + c * d == control) {
                            password = a * 1000 + b * 100 + c * 10 + d;
                        }
                    }
                }
            }
        }
        if (counter == 0 || counter < 4) {
            System.out.printf("%nNo!");
        } else {
            System.out.printf("%nPassword: " + password);
        }
    }
}
