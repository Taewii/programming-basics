import java.util.Scanner;

public class P06_NumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number in range [1...100]: ");
        int n = Integer.parseInt(scanner.nextLine());

        while (n > 100 || n < 1){
            System.out.println("Invalid number!");
            System.out.print("Enter a number in the range [1...100]: ");

            n = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("The number is: " + n);
    }
}
