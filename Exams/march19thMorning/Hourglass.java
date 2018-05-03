package march19thMorning;

import java.util.Scanner;

public class Hourglass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String firstAndLast = repeatStr("*", n * 2 + 1);
        System.out.println(firstAndLast);

        System.out.println(".*" + repeatStr(" ", n * 2 - 3) + "*.");

        for (int i = 1; i <= n - 2; i++) {
            String top = repeatStr(".", i + 1)
                    + "*"
                    + repeatStr("@", (n * 2 - 3) - i * 2)
                    + "*"
                    + repeatStr(".", i + 1);
            System.out.println(top);
        }

        System.out.println(repeatStr(".", n) + "*" + repeatStr(".", n));

        for (int i = 0; i < n - 2; i++) {
            String bot = repeatStr(".", n - 1 - i)
                    + "*"
                    + repeatStr(" ", i)
                    + "@"
                    + repeatStr(" ", i)
                    + "*"
                    + repeatStr(".", n - 1 - i);
            System.out.println(bot);
        }

        System.out.println(".*" + repeatStr("@", n * 2 - 3) + "*.");
        System.out.println(firstAndLast);
    }

    static String repeatStr(String str, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text += str;
        }
        return text;
    }
}
