package december17th;

import java.util.Scanner;

public class ChristmasSock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        System.out.println("|" + repeatStr("-", n * 2) + "|");
        System.out.println("|" + repeatStr("*", n * 2) + "|");
        System.out.println("|" + repeatStr("-", n * 2) + "|");

        for (int i = 1; i <= n - 1; i++) {
            String middleTop = "|"
                    + repeatStr("-", n - i)
                    + repeatStr("~", (i * 2))
                    + repeatStr("-", n - i)
                    + "|";
            System.out.println(middleTop);
        }

        for (int i = n - 2; i >= 1; i--) {
            String middleTop = "|"
                    + repeatStr("-", n - i)
                    + repeatStr("~", (i * 2))
                    + repeatStr("-", n - i)
                    + "|";
            System.out.println(middleTop);
        }

        for (int i = 0; i < n + 3; i++) {
            String bottom = repeatStr("-", i)
                    + "\\"
                    + repeatStr(".", (n * 2) + 1)
                    + "\\";

            if (i == n / 2){
                bottom = repeatStr("-", i)
                        + "\\"
                        + repeatStr(".", n - 2)
                        + "MERRY"
                        + repeatStr(".", n - 2)
                        + "\\";
            }

            if (i == (n / 2) + 2){
                bottom = repeatStr("-", i)
                        + "\\"
                        + repeatStr(".", n - 2)
                        + "X-MAS"
                        + repeatStr(".", n - 2)
                        + "\\";
            }

            if (i == n + 2){
                bottom = repeatStr("-", i)
                        + "\\"
                        + repeatStr("_", (n * 2) + 1)
                        + ")";
            }
            System.out.println(bottom);
        }
    }
    static String repeatStr(String strToRepeat, int count){
        String text = "";
        for (int i = 0; i < count; i++) {
            text += strToRepeat;
        }
        return text;
    }
}
