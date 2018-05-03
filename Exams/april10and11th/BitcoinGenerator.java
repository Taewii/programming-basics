package april10and11th;

import java.util.Scanner;

public class BitcoinGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int max = Integer.parseInt(scanner.nextLine());
        int counter = 0;

        for (char i = '!'; i <= '/'; i++) {
            for (char j = ':'; j <= '@'; j++) {
                for (int k = 1; k <= a; k++) {
                    for (int l = 1; l <= b; l++) {

                        System.out.printf("%c%c%d%d%c%c|", i, j, k, l, j, i);
                        if (i == '/') {
                            i = '!';
                        } else {
                            i++;
                        }
                        if (j == '@') {
                            j = ':';
                        } else {
                            j++;
                        }

                        counter++;
                        if (k == a && l == b) {
                            return;
                        }
                        if (counter == max) {
                            return;
                        }
                    }
                }
            }
        }
    }
}
