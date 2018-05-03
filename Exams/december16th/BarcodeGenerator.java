package december16th;

import java.util.Scanner;

public class BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());

        int first1 = first / 1000;
        int first2 = first / 100 % 10;
        int first3 = first / 10 % 10;
        int first4 = first % 10;
                                            // yey first time 6th on my own
        int second1 = second / 1000;
        int second2 = second / 100 % 10;
        int second3 = second / 10 % 10;
        int second4 = second % 10;

        for (int i = first1; i <= second1; i++) {
            for (int j = first2; j <= second2; j++) {
                for (int k = first3; k <= second3; k++) {
                    for (int l = first4; l <= second4; l++) {
                        if (i % 2 != 0 && j % 2 != 0 && k % 2 != 0 && l % 2 != 0)
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                    }
                }
            }
        }
    }
}
