import java.util.Scanner;

public class P05_SquareFrame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String FirstAndLastRow = "+";
        String MiddleRows = "|";

        for (int rows = 0; rows < n - 2; rows++) {
            FirstAndLastRow += " -";
        }
        FirstAndLastRow += " +";
        System.out.println(FirstAndLastRow);

        for (int rows = 0; rows < n - 2; rows++) {
            MiddleRows += " -";
        }
        MiddleRows += " |";

        for (int rows = 0; rows < n - 2; rows++) {
            System.out.println(MiddleRows);
        }
        System.out.println(FirstAndLastRow);
    }
}
