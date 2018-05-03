package may7th;

import java.util.Scanner;

public class Crown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        System.out.println("@" + repeatStr(" ", n - 2) + "@" + repeatStr(" ", n - 2) + "@");
        System.out.println("**" + repeatStr(" ", n - 3) + "*" + repeatStr(" ", n - 3) + "**");

        for (int i = 0; i < n / 2 - 1; i++) {
            String middle = "*"
                    + repeatStr(".", i + 1)
                    + "*"
                    + repeatStr(" ", (n - 5) - i * 2);

            if (i == 0) {
                middle += "*" + "." + "*";
            } else if (i == n / 2 - 2) {
                middle += repeatStr(".", i * 2 + 1);
            } else {
                middle += "*" + repeatStr(".", i * 2 + 1) + "*";
            }

            middle += repeatStr(" ", (n - 5) - i * 2)
                    + "*"
                    + repeatStr(".", i + 1)
                    + "*";
            System.out.println(middle);
        }

        System.out.println("*"
                + repeatStr(".", n / 2)
                + repeatStr("*", n / 2 - 2)
                + "."
                + repeatStr("*", n / 2 - 2)
                + repeatStr(".", n / 2)
                + "*");

        System.out.println(repeatStr("*", (2 * n) - 1));
        System.out.println(repeatStr("*", (2 * n) - 1));
    }

    static String repeatStr(String str, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text += str;
        }
        return text;
    }
}
