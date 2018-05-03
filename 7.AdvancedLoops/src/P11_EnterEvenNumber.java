import java.util.Scanner;

public class P11_EnterEvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = Integer.parseInt(scanner.nextLine());

        while (number % 2 != 0){
            System.out.println("Invalid number!");
            System.out.println("The number is not even.");
            number = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Even number entered: " + number);

    }
}
