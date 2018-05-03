package june25th;

import java.util.Scanner;

public class SumOrMultiply {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int counter = 0;

        for (int a = 1; a <= 30; a++) {
            for (int b = 1; b < 30; b++) {
                for (int c = 1; c <= 30; c++) {         // second 6th ive done on my own
                    if (a < b && b < c && (a + b + c == n)) {
                        counter++;
                        System.out.printf("%d + %d + %d = %d%n", a, b, c, a + b + c);
                    }
                    if ((a > b && b > c) && (a * b * c == n)) {
                        counter++;
                        System.out.printf("%d * %d * %d = %d%n", a, b, c, a * b * c);
                    }
                }
            }
        }
        if (counter == 0) {
            System.out.println("No!");
        }
    }
}
