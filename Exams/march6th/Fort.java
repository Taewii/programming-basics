package march6th;

import java.util.Scanner;

public class Fort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        System.out.println("/"
                + repeatStr("^", n / 2)
                + "\\"
                + repeatStr("_", 2 * n - 2 * (n / 2) - 4)
                + ("/"
                + repeatStr("^", n / 2)
                + "\\"));

        for (int i = 0; i < n - 2; i++) {
            String middle = "|";

            if (i == n - 3) {
                middle += repeatStr(" ", (n / 2) + 1)
                        + repeatStr("_", 2 * n - 2 * (n / 2) - 4)
                        + repeatStr(" ", (n / 2) + 1) + "|";
            } else {
                middle += repeatStr(" ", (n * 2) - 2) + "|";
            }
            System.out.println(middle);
        }

        System.out.println("\\"
                + repeatStr("_", n / 2)
                + "/"
                + repeatStr(" ", 2 * n - 2 * (n / 2) - 4)
                + "\\"
                + repeatStr("_", n / 2)
                + "/");
    }

    static String repeatStr(String str, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text += str;
        }
        return text;
    }
}
