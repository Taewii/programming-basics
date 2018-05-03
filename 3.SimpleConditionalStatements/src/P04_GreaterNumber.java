import java.util.Scanner;

public class P04_GreaterNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        if (a > b){
            System.out.printf("Greater number %d", a);
        } else {
            System.out.printf("Greater number %d", b);
        }
    }
}
