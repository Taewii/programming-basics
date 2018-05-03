import java.util.Scanner;

public class P10_CheckPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        boolean isPrime = true;

        if (number < 2){
            isPrime = false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

            if (isPrime){
                System.out.println("Prime");
            } else {
                System.out.println("Not Prime");
            }
    }
}
