import java.util.Scanner;

public class P07_GCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        while (b != 0){
            if (a > b){
            a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.println(a);
    }
}
