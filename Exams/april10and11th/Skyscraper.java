package april10and11th;

import java.util.Scanner;

public class Skyscraper {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        for (int i = 1; i <= n - 2; i++) {
            if (i < n - 2) {
                System.out.println(repeatStr(" ", n) + "|");
            } else {
                System.out.println(repeatStr(" ", n - 1) + "_|_");
            }
        }

        for (int i = 1; i <= n - 2; i++) {
            if (i < n - 2) {
                System.out.println(repeatStr(" ", n - 1) + "|-|");
            } else {
                System.out.println(repeatStr(" ", n - 2) + "_|-|_");
            }
        }

        for (int i = 1; i <= n - 2; i++) {
            if (i < n - 2) {
                System.out.println(repeatStr(" ", n - 2) + "|***|");
            } else {
                System.out.println(" " + repeatStr("_", n - 3) + "|***|" + repeatStr("_", n - 3));
            }
        }

        for (int i = 0; i < n * 4; i++) {
            String part1 = "";
            if (i < n * 4 - 1) {
                part1 = " " + repeatStr("|", n - 2) + "---" + repeatStr("|", n - 2);
            } else {
                part1 = "_" + repeatStr("|", n - 2) + "---" + repeatStr("|", n - 2) + "_";
            }
            System.out.println(part1);
        }

        for (int i = 0; i < n - 2; i++) {
            System.out.println(repeatStr("|", 2 * n + 1));
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