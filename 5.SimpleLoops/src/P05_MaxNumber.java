import java.util.Scanner;

public class P05_MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numCount = Double.parseDouble(scanner.nextLine());
        double maxNumber = Integer.MIN_VALUE;

        for (int i = 1; i <= numCount; i++) {
            double currentNumber = Double.parseDouble(scanner.nextLine());

            if (currentNumber > maxNumber) {
                maxNumber = currentNumber;
            }
        }
        System.out.println(maxNumber);
    }
}
