package december17th;

import java.util.Scanner;

public class MultiplyTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int first = number / 100;
        int second = number / 10 % 10;
        int third = number % 10;
                                                     //i didn't write this tbh
        for (int i = 1; i <= third ; i++) {
            for (int j = 1; j <= second; j++) {
                for (int k = 1; k <= first; k++) {
                    System.out.printf("%d * %d * %d = %d;%n", i, j, k, i * j * k);
                }   
            }
        }
    }
}
