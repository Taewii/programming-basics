package jaunuary7th2018;

import java.util.Scanner;

public class Ladybird {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(repeatStr(" ", n - 2) + "@   @");
        System.out.println(repeatStr(" ", n - 1) + "\\_/");
        System.out.println(repeatStr(" ", n - 1) + "/ \\");
        System.out.println(repeatStr(" ", n - 1) + "|_|");
        System.out.println(repeatStr(" ", n - 1) + "/|\\");

        for (int i = 0; i < n - 1; i++) {
            String body = repeatStr(" ", (n - i) - 2) + "/"
                    + repeatStr(" ", i + 1) + "|"
                    + repeatStr(" ", i + 1) + "\\";
            System.out.println(body);
        }

        for (int i = 0; i < n / 2; i++) {
            String middle = "|"
                    + repeatStr(" ", (n / 2) - 1)
                    + "@";
            if (n % 2 == 0) {
                middle += repeatStr(" ", (n / 2) - 1);
            } else {
                middle += repeatStr(" ", n / 2);
            }

            middle += "|";

            if (n % 2 == 0) {
                middle += repeatStr(" ", (n / 2) - 1);
            } else {
                middle += repeatStr(" ", n / 2);
            }

            middle += "@"
                    + repeatStr(" ", (n / 2) - 1)
                    + "|";
            System.out.println(middle);
        }

        for (int i = 0; i < n / 2; i++) {
            String bottom = repeatStr(" ", i)
                    + "\\"
                    + repeatStr(" ", (n - 1) - i)
                    + "|"
                    + repeatStr(" ", (n - 1) - i)
                    + "/";
            System.out.println(bottom);

            if (i == (n / 2) - 1 && n % 2 != 0) {
                System.out.println(repeatStr(" ", i + 2)
                        + repeatStr("^", n / 2)
                        + "|"
                        + repeatStr("^", n / 2));
            } else if ((i == (n / 2) - 1 && n % 2 == 0)) {
                System.out.println(repeatStr(" ", i + 1)
                        + repeatStr("^", n / 2)
                        + "|"
                        + repeatStr("^", n / 2));
            }
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
