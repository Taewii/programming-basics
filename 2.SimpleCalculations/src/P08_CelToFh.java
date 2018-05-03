import java.util.Scanner;

public class P08_CelToFh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double cel = Double.parseDouble(scanner.nextLine());
        double fh = cel * 1.8 + 32;

        System.out.printf("%.2f", fh);
    }
}
