package april10and11th;

import java.util.Scanner;

public class PIN {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        System.out.println("/`"
                + repeatStr("P", n * 2)
                + repeatStr(" ", n)
                + "/`I"
                + repeatStr(" ", n)
                + "/`N"
                + repeatStr(" ", n * 2 + 1)
                + "N");

        for (int i = 0; i <= n - 1; i++) {
            String part1 = "";
            if (i < n - 1) {
                part1 = "| P"
                        + repeatStr(" ", 2 * n - 2)
                        + "P"
                        + repeatStr(" ", n)
                        + "| I"
                        + repeatStr(" ", n)
                        + "| "
                        + "N"
                        + repeatStr(" ", i)
                        + "N"
                        + repeatStr(" ", 2 * n - i)
                        + "N";
            } else {
                part1 = "| P"
                        + repeatStr("P", 2 * n - 2)
                        + "P"
                        + repeatStr(" ", n)
                        + "| I"
                        + repeatStr(" ", n)
                        + "| N"
                        + repeatStr(" ", i)
                        + "N"
                        + repeatStr(" ", 2 * n - i)
                        + "N";
            }
            System.out.println(part1);
        }

        for (int i = 0; i <= n; i++) {
            String part2 = "";
            if (i < n) {
                part2 = "| "
                        + repeatStr("P", n / 2)
                        + repeatStr(" ", 2 * n + n - n / 2)
                        + "| I"
                        + repeatStr(" ", n)
                        + "| N"
                        + repeatStr(" ", n + i)
                        + "N"
                        + repeatStr(" ", n - i)
                        + "N";
            } else {
                part2 = "\\_"
                        + repeatStr("P", n / 2)
                        + repeatStr(" ", 2 * n + n - n / 2)
                        + "\\_I"
                        + repeatStr(" ", n)
                        + "\\_N"
                        + repeatStr(" ", n + i)
                        + "N"
                        + repeatStr(" ", n - i)
                        + "N";
            }
            System.out.println(part2);
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