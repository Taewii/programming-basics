import java.util.Scanner;

public class P09_House {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int stars = 0;

        if (n % 2 == 0) {
            stars = 2;
        } else {
            stars = 1;
        }
        for (int i = 0; i < Math.ceil(n / 2.0); i++) {
            String row = repeatStr("-", (n - stars) / 2)
                        + repeatStr("*", stars)
                        + repeatStr("-", (n - stars) / 2);
            stars += 2;
            System.out.println(row);
        }

        for (int i = 0; i < n / 2; i++) {
            String middleRow = "|" + repeatStr("*", n - 2) + "|";
            System.out.println(middleRow);
        }
    }

    static String repeatStr(String strToRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text += strToRepeat;
        }
        return text;
    }
}
