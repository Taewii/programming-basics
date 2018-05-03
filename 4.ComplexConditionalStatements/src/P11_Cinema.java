import java.util.Scanner;

public class P11_Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String projection = scanner.nextLine();
        double rows = Double.parseDouble(scanner.nextLine());
        double columns = Double.parseDouble(scanner.nextLine());

        double seats = rows * columns;
        double result = 0;

        switch (projection) {
            case "Premiere":
                result = seats * 12.00;
                break;
            case "Normal":
                result = seats * 7.50;
                break;
            case "Discount":
                result = seats * 5.00;
                break;
        }
        System.out.printf("%.2f %s", result, "leva");
    }
}
