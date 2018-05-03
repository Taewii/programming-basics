import java.util.Scanner;

public class P12_Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int fib0 = 1;
        int fib1 = 1;

        for (int i = 1; i < n ; i++) {
            int temp = fib0;
            fib0 = fib1;
            fib1 = temp + fib1;
        }
        System.out.println(fib1);
    }
}
