package march10and11th;

import java.util.Scanner;

public class SpecialCombinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                for (int k = 1; k <= c; k++) {
                    if (i % 2 == 0 && (j == 2 || j == 3||j == 5 || j == 7) && k % 2 == 0){
                        System.out.printf("%d %d %d%n", i, j, k);
                    }
                }
            }
        }
    }
}
