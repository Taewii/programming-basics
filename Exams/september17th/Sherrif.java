package september17th;

import java.util.Scanner;

public class Sherrif {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(repeatStr(".", (n * 3 - 1) / 2)
                + "x"
                + repeatStr(".", (n * 3 - 1) / 2));
        System.out.println(repeatStr(".", (n * 3 - 2) / 2)
                + "/x\\"
                + repeatStr(".", (n * 3 - 2) / 2));
        System.out.println(repeatStr(".", (n * 3 - 2) / 2)
                + "x|x"
                + repeatStr(".", (n * 3 - 2) / 2));

        for (int i = 0; i < n / 2; i++) {
            String part1top = repeatStr(".", n / 2 - i)
                    + repeatStr("x", n + i)
                    + "|"
                    + repeatStr("x", n + i)
                    + repeatStr(".", n / 2 - i);
            System.out.println(part1top);
        }

        for (int i = 0; i < n / 2 + 1; i++) {
            String part1bot = repeatStr(".", i)
                    + repeatStr("x", ((n * 3 - 1) / 2) - i)
                    + "|"
                    + repeatStr("x", ((n * 3 - 1) / 2) - i)
                    + repeatStr(".", i);
            System.out.println(part1bot);
        }

        System.out.println(repeatStr(".", (n * 3 - 2) / 2)
                + "/x\\"
                + repeatStr(".", (n * 3 - 2) / 2));
        System.out.println(repeatStr(".", (n * 3 - 2) / 2)
                + "\\x/"
                + repeatStr(".", (n * 3 - 2) / 2));

        for (int i = 0; i < n / 2; i++) {
            String part2top = repeatStr(".", n / 2 - i)
                    + repeatStr("x", n + i)
                    + "|"
                    + repeatStr("x", n + i)
                    + repeatStr(".", n / 2 - i);
            System.out.println(part2top);
        }

        for (int i = 0; i < n / 2 + 1; i++) {
            String part2bot = repeatStr(".", i)
                    + repeatStr("x", ((n * 3 - 1) / 2) - i)
                    + "|"
                    + repeatStr("x", ((n * 3 - 1) / 2) - i)
                    + repeatStr(".", i);
            System.out.println(part2bot);
        }

        System.out.println(repeatStr(".", (n * 3 - 2) / 2)
                + "x|x"
                + repeatStr(".", (n * 3 - 2) / 2));
        System.out.println(repeatStr(".", (n * 3 - 2) / 2)
                + "\\x/"
                + repeatStr(".", (n * 3 - 2) / 2));
        System.out.println(repeatStr(".", (n * 3 - 1) / 2)
                + "x"
                + repeatStr(".", (n * 3 - 1) / 2));
    }

    static String repeatStr(String str, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text += str;
        }
        return text;
    }
}
