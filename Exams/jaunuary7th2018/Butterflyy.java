package jaunuary7th2018;

import java.util.Scanner;

public class Butterflyy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int spaces = (4 * n) - 4;
        for (int i = 0; i <= n - 2; i++) {
            String FirstPart = repeatStr("*\\", i)
                    + repeatStr(" ", spaces - (i * 4))
                    + repeatStr("/*", i);
            System.out.println(FirstPart);
        }

        String middleBorder = repeatStr("\\/", ((4 * n) - 4) / 2);
        System.out.println(middleBorder);

        for (int i = 0; i < n / 2; i++) {
            String middleRow = repeatStr("<", (((4 * n) - 4) / 2) - 3)
                    + "*|**|*"
                    + repeatStr(">", (((4 * n) - 4) / 2) - 3);
            System.out.println(middleRow);
        }

        String middleLowerBorder = repeatStr("/\\", ((4 * n) - 4) / 2);
        System.out.println(middleLowerBorder);

        for (int i = 0; i < n - 2; i++) {
            String LastPart = repeatStr("*/", ((((4 * n) - 4) / 2) / 2) - i - 1)
                    + repeatStr(" ", (i * 4) + 4)
                    + repeatStr("\\*", ((((4 * n) - 4) / 2) / 2) - i - 1);
            System.out.println(LastPart);
        }
    }

    static String repeatStr(String StrToRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text += StrToRepeat;
        }
        return text;
    }
}
