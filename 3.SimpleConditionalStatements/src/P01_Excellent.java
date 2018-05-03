import java.util.Scanner;

public class P01_Excellent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num = Double.parseDouble(scanner.nextLine());

        if (num >= 5.50) {
            System.out.println("Excellent!");
        }
    }
}
