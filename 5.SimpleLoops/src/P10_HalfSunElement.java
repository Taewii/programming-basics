import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class P10_HalfSunElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int maxNumber = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());

            if (currentNumber > maxNumber) {
                maxNumber = currentNumber;
            }
            sum += currentNumber;
        }
        if (sum - maxNumber == maxNumber) {
            System.out.println("Yes");
            System.out.println("Sum = " + maxNumber);
        } else {
            System.out.println("No");
            System.out.println("Diff = " + Math.abs(sum - maxNumber - maxNumber));
        }
    }
}
