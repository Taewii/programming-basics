package march10and11th;

import java.util.Scanner;

public class Mask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n - 1; i++) {
            String top = repeatStr(" ", n - 2 - i)
                    + "/"
                    + repeatStr(" ", i)
                    + "|  |"
                    + repeatStr(" ", i)
                    + "\\"
                    + repeatStr(" ", n - 2 - i);
            System.out.println(top);
        }


        System.out.println(repeatStr("-", (2 * n) + 2));
        System.out.println("|"
                + repeatStr(" ", (n - 2) / 2)
                + "_"
                + repeatStr(" ", n + 1)
                + "_"
                + repeatStr(" ", (n - 2) / 2)
                + "|");
        System.out.println("|"
                + repeatStr(" ", (n - 2) / 2)
                + "@"
                + repeatStr(" ", n + 1)
                + "@"
                + repeatStr(" ", (n - 2) / 2)
                + "|");

        for (int i = 0; i < n / 2; i++) {
            System.out.println("|" + repeatStr(" ", (2*n)) + "|");
        }

        System.out.println("|" + repeatStr(" ", n - 1) + "OO" + repeatStr(" ", n - 1) + "|");
        System.out.println("|" + repeatStr(" ", n - 2) + "/  \\" + repeatStr(" ", n - 2) + "|");
        System.out.println("|" + repeatStr(" ", n - 2) + "||||" + repeatStr(" ", n - 2) + "|");

        for (int i = 0; i < n + 1; i++) {
            String bot = repeatStr("\\", i + 1) + repeatStr("`", n * 2 - i * 2) + repeatStr("/", i + 1);
            System.out.println(bot);
        }
    }

    static String repeatStr(String text, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(text);
        }
        return sb.toString();
    }
}
