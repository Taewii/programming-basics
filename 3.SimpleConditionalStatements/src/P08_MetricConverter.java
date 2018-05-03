import java.util.Scanner;

public class P08_MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double value = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        String output = scanner.nextLine();

        if (input.equals("mm")) {
            value = value / 1000;
        } else if (input.equals("cm")) {
            value = value / 100;
        } else if (input.equals("mi")) {
            value = value / 0.000621371192;
        } else if (input.equals("in")) {
            value = value / 39.3700787;
        } else if (input.equals("km")) {
            value = value / 0.001;
        } else if (input.equals("ft")) {
            value = value / 3.2808399;
        } else if (input.equals("yd")) {
            value = value / 1.0936133;
        }

        if (output.equals("mm")) {
            value = value * 1000;
        } else if (output.equals("cm")) {
            value = value * 100;
        } else if (output.equals("mi")) {
            value = value * 0.000621371192;
        } else if (output.equals("in")) {
            value = value * 39.3700787;
        } else if (output.equals("km")) {
            value = value * 0.001;
        } else if (output.equals("ft")) {
            value = value * 3.2808399;
        } else if (output.equals("yd")) {
            value = value * 1.0936133;
        }

        System.out.printf("%.8f %s", value, output);
    }
}
