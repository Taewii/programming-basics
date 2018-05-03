import java.util.Scanner;

public class P06_2DRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x1 = Double.valueOf(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());

        System.out.println(Math.abs(x1 - x2) * Math.abs(y1 - y2));
        System.out.println(2 * (Math.abs(x1 - x2) + Math.abs(y1 - y2)));
    }
}
