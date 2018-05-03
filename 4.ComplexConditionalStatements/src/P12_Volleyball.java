import java.util.Scanner;

public class P12_Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String year = scanner.nextLine();
        double holidays = Double.parseDouble(scanner.nextLine());
        double weekends = Double.parseDouble(scanner.nextLine());

        double weekendsInSofia = 48 - weekends;
        double gamesInSofia = weekendsInSofia * 3.0 / 4;
        double gamesOnHolidays = holidays * 2.0 / 3;

        double result = gamesInSofia + weekends + gamesOnHolidays;
        double result2 = result * 0.15;

        if (year.equals("leap")){
            System.out.println(Math.floor(result + result2));
        } else if (year.equals("normal")){
            System.out.println(Math.floor(result));
        }
    }
}
