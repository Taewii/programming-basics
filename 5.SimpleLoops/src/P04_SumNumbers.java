import java.util.Scanner;

public class P04_SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numCount = Double.parseDouble(scanner.nextLine());
        double sum = 0;

        for (int i = 1; i <= numCount; i++) {
            double currentNum = Double.parseDouble(scanner.nextLine());

            sum = sum + currentNum;
        }
        System.out.println(sum);

    }
}

