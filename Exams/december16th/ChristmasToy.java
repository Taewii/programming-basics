package december16th;

import java.util.Scanner;

public class ChristmasToy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String FirstAndLastRow = repeatStr("-", n * 2)
                + repeatStr("*", n)
                + repeatStr("-", n * 2);
        System.out.println(FirstAndLastRow);

        for (int i = 1; i <= n / 2; i++) {
            String middleTop = repeatStr("-", (n * 2) - i * 2)
                    + repeatStr("*", i)
                    + repeatStr("&", n + i * 2)
                    + repeatStr("*", i)
                    + repeatStr("-", (n * 2) - i * 2);
            System.out.println(middleTop);
        }

        for (int i = 1; i <= n / 2; i++) {
            String middleBot = repeatStr("-", n - i)
                    + "**"
                    + repeatStr("~", (3 * n - 4) + i * 2)
                    + "**"
                    + repeatStr("-", n - i);
            System.out.println(middleBot);
        }

        System.out.println(repeatStr("-", n / 2)
                + "*"
                + repeatStr("|", n * 4 - 2)
                + "*"
                + repeatStr("-", n / 2));

        for (int i = n / 2; i >= 1; i--) {
            String middleBot = repeatStr("-", n - i)
                    + "**"
                    + repeatStr("~", (3 * n - 4) + i * 2)
                    + "**"
                    + repeatStr("-", n - i);
            System.out.println(middleBot);
        }

        for (int i = n / 2; i >= 1; i--) {
            String middleTop = repeatStr("-", (n * 2) - i * 2)
                    + repeatStr("*", i)
                    + repeatStr("&", n + i * 2)
                    + repeatStr("*", i)
                    + repeatStr("-", (n * 2) - i * 2);
            System.out.println(middleTop);
        }
        System.out.println(FirstAndLastRow);
    }

    static String repeatStr(String strToRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text += strToRepeat;
        }
        return text;
    }
}
