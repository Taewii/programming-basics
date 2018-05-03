package march19thMorning;

import java.util.Scanner;

public class TwoNumberSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int control = Integer.parseInt(scanner.nextLine());

        int counter = 0;

        for (int a = start; a >= end; a--) {
            for (int b = start; b >= end; b--) {

                counter++;

                if (a + b == control) {
                    System.out.print("Combination N:" + counter);
                    System.out.print(" (" + a + " + " + b + " = " + control + ") ");
                    return;
                } else if (a <= end && b <= end) {
                    System.out.println(counter + " combinations - neither equals " + control);
                }
            }
        }
    }
}
