import java.util.Scanner;

public class P06_MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberCount = Integer.parseInt(scanner.nextLine());

        int minNumber = Integer.MAX_VALUE;

        for (int i = 0; i < numberCount; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());

            if (currentNumber < minNumber) {
                minNumber = currentNumber;
            }

        }
        System.out.println(minNumber);
    }
}
