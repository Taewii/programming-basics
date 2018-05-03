import java.util.Scanner;

public class P06_RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int row = 0; row < n; row++) {
            for (int j = 1; j < n - row; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int col = 0; col < row; col++) {
                System.out.print(" *");
            }
            System.out.println();
        }
                                                        // ibasimo ciklite chuek
        for (int row = 0; row < n - 1; row++) {

            for (int i = 0; i < row + 1; i++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int col = 1; col < n - row - 1; col++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
