import java.util.Scanner;

public class P06_PointOnRectangleBorder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());

        boolean isOnLeftSide = (x == x1) && (y >= y1 && y <= y2);
        boolean isOnRightSide = (x == x2) && (y >= y1 && y <= y2);
        boolean isOnUpperSide = (y == y1) && (x >= x1 && x <= x2);
        boolean isOnDownSide = (y == y2) && (x >= x1 && x <= x2);

        if (isOnDownSide || isOnUpperSide || isOnLeftSide || isOnRightSide) {
            System.out.println("Border");
        } else {
            System.out.println("Inside / Outside");
        }
    }
}
