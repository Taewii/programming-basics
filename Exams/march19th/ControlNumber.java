package march19th;

import java.util.Scanner;

public class ControlNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int control = Integer.parseInt(scanner.nextLine());

        int counter = 0;
        int sum = 0;

        for (int a = 1; a <= n; a++) {
            for (int b = m; b >= 1; b--) {

                sum += a * 2 + b * 3;
                counter++;
                if (sum >= control){
                    break;
                }
            }
            if (sum >= control){
                break;
            }
        }
        System.out.println(counter + " moves");
        if (sum >= control) {
            System.out.println("Score: " + sum + " >= " + control);
        }
    }
}
