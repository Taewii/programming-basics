import java.util.Scanner;

public class P13_AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String element = scanner.nextLine();
        double value1 = Double.parseDouble(scanner.nextLine());
        double result = 0;

        if (element.equals("square")) {
            result = value1 * value1;
        } else if (element.equals("rectangle")) {
            double value2 = Double.parseDouble(scanner.nextLine());
            result = value1 * value2;
        } else if (element.equals("circle")) {
            result = Math.PI * value1 * value1;
        } else if (element.equals("triangle")) {
            double value2 = Double.parseDouble(scanner.nextLine());
            result = (value2 * value1) / 2;
        }
        System.out.printf("%.3f", result);
    }
}