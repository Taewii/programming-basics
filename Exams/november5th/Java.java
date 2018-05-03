package november5th;

import java.util.Scanner;

public class Java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String top = repeatStr(" ", n)
                    + "~ ~ ~";
            System.out.println(top);
        }

        System.out.println(repeatStr("=", n * 3 + 5));

        for (int i = 0; i < n - 2; i++) {
            if (i == n / 2 - 1){
                String body = "|"
                        + repeatStr("~", n)
                        + "JAVA"
                        + repeatStr("~", n)
                        + "|"
                        + repeatStr(" ", n - 1)
                        + "|";
                System.out.println(body);
            } else {
                String body2 = "|"
                        + repeatStr("~", 2 * n + 4)
                        + "|"
                        + repeatStr(" ", n - 1)
                        + "|";
                System.out.println(body2);
            }
        }

        System.out.println(repeatStr("=", n * 3 + 5));

        for (int i = 0; i < n; i++) {
            String bottom = repeatStr(" ", i)
                    + "\\"
                    + repeatStr("@", (2 * n + 4) - i * 2)
                    + "/";
            System.out.println(bottom);
        }

        System.out.println(repeatStr("=", n * 2 + 6));

    }
    static String repeatStr(String str, int count){
        String text = "";
        for (int i = 0; i < count; i++) {
            text += str;
        }
        return text;
    }
}
