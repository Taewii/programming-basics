package march19th;

import java.util.Scanner;

public class Parallelepiped {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        System.out.println("+"
                + repeatStr("~", n - 2)
                + "+"
                + repeatStr(".", 2 * n + 1));

        for (int i = 0; i < 2 * n + 1; i++) {
            String top = "|"
                    + repeatStr(".", i)
                    + "\\"
                    + repeatStr("~", n - 2)
                    + "\\"
                    + repeatStr(".", n * 2 - i);
            System.out.println(top);
        }

        for (int i = 0; i < 2 * n + 1; i++) {
            String bot = repeatStr(".", i)
                    + "\\"
                    + repeatStr(".", 2 * n - i)
                    + "|"
                    + repeatStr("~", n - 2)
                    + "|";
            System.out.println(bot);
        }

        System.out.println(repeatStr(".", 2 * n + 1)
                + "+"
                + repeatStr("~", n - 2)
                + "+");
    }

    static String repeatStr(String str, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text += str;
        }
        return text;
    }
}
