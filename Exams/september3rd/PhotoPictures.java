package september3rd;

import java.util.Scanner;

public class PhotoPictures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n = Double.parseDouble(scanner.nextLine());
        String type = scanner.nextLine();
        String onlineOrNot = scanner.nextLine();

        double value = 0;

        switch (type) {
            case "9X13":
                if (n >= 50) {
                    value = (n * 0.16) * 0.95;
                } else {
                    value = n * 0.16;
                }
                break;
            case "10X15":
                if (n >= 80) {
                    value = (n * 0.16) * 0.97;
                } else {
                    value = n * 0.16;
                }
                break;
            case "13X18":
                if (n >= 50 && n <= 100) {
                    value = (n * 0.38) * 0.97;
                } else if (n > 100) {
                    value = (n * 0.38) * 0.95;
                } else {
                    value = n * 0.38;
                }
                break;
            case "20X30":
                if (n >= 10 && n <= 50) {
                    value = (n * 2.90) * 0.93;
                } else if (n > 50) {
                    value = (n * 2.90) * 0.91;
                } else {
                    value = n * 2.90;
                }
                break;
        }
        if (onlineOrNot.equals("online")) {
            value *= 0.98;
            System.out.printf("%.2fBGN", value);
        } else {
            System.out.printf("%.2fBGN", value);
        }
    }
}
