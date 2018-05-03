package april10and11th;

import java.util.Scanner;

public class Margarita {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        System.out.println("'&$" + repeatStr("'", (8 * n) - 1));

        for (int i = 0; i < n - 1; i++) {
            String part1 = repeatStr("'", 2 + i)
                    + "\\"
                    + repeatStr("'", (8 * n) - 1 - i);
            System.out.println(part1);
        }

        System.out.println(repeatStr("^*", (8 * n + 1) / 2) + "^'");

        for (int i = 0; i < n - 1; i++) {
            String part2 = repeatStr("'", i)
                    + "\\\\"
                    + repeatStr(" ", n)
                    + "\\"
                    + repeatStr(" ", (8 * n + 2) - 6 - n - i * 2)
                    + "//"
                    + repeatStr("'", i + 1);
            System.out.println(part2);
        }

        System.out.println(repeatStr("'", n - 1)
                + "\\"
                + repeatStr("~", (8 * n + 2) - (n + 1 + n))
                + "/"
                + repeatStr("'", n));

        for (int i = 0; i <= n - 1; i++) {
            String part3 = "";
            if (i < n - 2) {
                part3 = repeatStr("'", n + i)
                        + "\\"
                        + repeatStr(" ", (8 * n) - (n * 2) - 1 - i * 2)
                        + "/"
                        + repeatStr("'", n + i + 1);
            } else if (i == n - 2) {
                part3 = repeatStr("'", n + i)
                        + "\\"
                        + repeatStr("_", (8 * n) - (n * 2) - 1 - i * 2)
                        + "/"
                        + repeatStr("'", n + i + 1);
            } else if (i == n - 1) {
                part3 = repeatStr("'", n + i)
                        + "\\"
                        + repeatStr(".", (8 * n) - (n * 2) - 1 - i * 2)
                        + "/"
                        + repeatStr("'", n + i + 1);
            }
            System.out.println(part3);
        }

        for (int i = 0; i < n * 2 - 1; i++) {
            String part4 = "";
            if (i < n * 2 - 2) {
                part4 = repeatStr("'", n * 2 + i)
                        + "\\"
                        + repeatStr(" ", (4 * n - 1) - i * 2)
                        + "/"
                        + repeatStr("'", n * 2 + i + 1);
            } else {
                part4 = repeatStr("'", n * 2 + i)
                        + "\\"
                        + repeatStr("_", (4 * n - 1) - i * 2)
                        + "/"
                        + repeatStr("'", n * 2 + i + 1);
            }
            System.out.println(part4);
        }

        for (int i = 0; i < n * 2 + 1; i++) {
            String part5 = repeatStr("'", (n * 4 - 1)) + "|||" + repeatStr("'", (n * 4));
            System.out.println(part5);
        }

        System.out.println(repeatStr("_", 8 * n + 1) + "'");
        System.out.println("'" + repeatStr("-", 8 * n - 1) + "''");
    }

    static String repeatStr(String text, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(text);
        }
        return sb.toString();
    }
}