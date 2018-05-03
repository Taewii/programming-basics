import java.util.Scanner;

public class P09_SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int sum = 0;

//        while (number > 0){
//            sum += number % 10;
//            number = number / 10;         easier
//        }
//        System.out.println(sum);

        do {
            sum += number % 10;
            number = number / 10;
        } while (number > 0);
            System.out.println(sum);

    }
}
