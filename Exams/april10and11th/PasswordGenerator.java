package april10and11th;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        String bb = scanner.nextLine().toUpperCase();
        char b = bb.charAt(0);
        String cc = scanner.nextLine().toLowerCase();
        char c = cc.charAt(0);
        int d = Integer.parseInt(scanner.nextLine());
        int e = Integer.parseInt(scanner.nextLine());
        int f = Integer.parseInt(scanner.nextLine());
        int N = Integer.parseInt(scanner.nextLine());

        int counter = 0;

        for (int i = 1; i <= a; i++) {
            for (char j = 'A'; j <= b; j++) {
                for (int k = 'a'; k <= c; k++) {
                    for (int l = 1; l <= d; l++) {
                        for (int m = 1; m <= e; m++) {
                            for (int n = 1; n <= f; n++) {

                                counter++;
                                if (counter == N){
                                    System.out.printf("%d%c%c%d%d%d", i, j, k, l, m, n);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("No password on this position");
    }
}
