package march6th;

import java.util.Scanner;

public class DumbPasswords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {
                for (char k = 'a'; k < 'a' + b; k++) {
                    for (char l = 'a'; l < 'a' + b; l++) {
                        for (int m = 1; m <= a; m++) {

                            if (m > i && m > j){
                                System.out.printf("%d%d%c%c%d ", i, j, k, l, m);
                            }
                        }
                    }
                }
            }
        }
    }
}
