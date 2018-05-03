package march19thMorning;

import java.util.Scanner;

public class HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double sideWall = x * y;
        double wallWindow = 1.5 * 1.5;
        double bothSide = 2 * sideWall - 2 * wallWindow;
        double backWall = x * x;
        double frontDoor = 1.2 * 2;
        double bothFrontBack = 2 * backWall - frontDoor;
        double wholeArea = bothSide + bothFrontBack;
        double greenPaint = wholeArea / 3.4;

        double roofRectangles = 2 * (x * y);
        double roofTriangles = 2 * (x * h / 2);
        double roofArea = roofRectangles + roofTriangles;
        double redPaint = roofArea / 4.3;

        System.out.printf("%.2f%n%.2f", greenPaint, redPaint);
    }
}
