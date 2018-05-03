package may7th;

import java.util.Scanner;

public class NumberGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int special = Integer.parseInt(scanner.nextLine());
        int last = Integer.parseInt(scanner.nextLine());

        int specialValue = special;

        for (int i = a; i >= 1; i--) {
            for (int j = b; j >= 1; j--) {
                for (int k = c; k >= 1; k--) {
                    int number = i * 100 + j * 10 + k;

                    if (number % 3 == 0) {
                        specialValue += 5;
                    } else if (number % 10 == 5) {
                        specialValue -= 2;
                    } else if (number % 2 == 0) {
                        specialValue *= 2;
                    }

                    if (specialValue >= last) {
                        System.out.printf("Yes! Control number was reached! Current special number is %d.", specialValue);
                        return;
                    }
                }
            }
        }

        if (specialValue < last) {
            System.out.printf("No! %d is the last reached special number.", specialValue);
        }
    }
}

