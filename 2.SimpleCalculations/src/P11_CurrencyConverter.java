import java.util.Scanner;

public class P11_CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double value = Double.parseDouble(scanner.nextLine());
        String first = scanner.nextLine();
        String second = scanner.nextLine();

        double bgn = 1;
        double usd = 1.79549;
        double eur = 1.95583;
        double gbp = 2.53405;

        switch (first) {
            case "BGN":
                break;
            case "USD":
                value = value * usd;
                break;
            case "EUR":
                value = value * eur;
                break;
            case "GBP":
                value = value * gbp;
                break;
            default:
                break;
        }

        switch (second) {
            case "BGN":
                value = value / bgn;
                break;
            case "USD":
                value = value / usd;
                break;
            case "EUR":
                value = value / eur;
                break;
            case "GBP":
                value = value / gbp;
                break;
            default:
                break;
        }
        System.out.printf("%.2f %s", value, second);
    }
}