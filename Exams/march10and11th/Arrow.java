package march10and11th;

import java.util.Scanner;

public class Arrow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(repeatStr("_", (n / 2) + 2)
                + "^"
                + repeatStr("_", (n / 2) + 2));

        System.out.println(repeatStr("_", (n / 2) + 1)
                + "/|\\"
                + repeatStr("_", (n / 2) + 1));

        System.out.println(repeatStr("_", (n / 2))
                + "/|||\\"
                + repeatStr("_", (n / 2)));

        for (int i = 0; i < (n + 2) / 3; i++) {
            String mid = repeatStr("_", (n - 2) / 2 - i)
                    + "/"
                    + repeatStr(".", i + 1)
                    + "|||"
                    + repeatStr(".", i + 1)
                    + "\\"
                    + repeatStr("_", (n - 2) / 2 - i);
            System.out.println(mid);
        }

        for (int i = 0; i < n / 3; i++) {
            String midBot = repeatStr("_", n / 4 + i)
                    + "/"
                    + repeatStr(".", n / 3 - i)
                    + "|||"
                    + repeatStr(".", n / 3 - i)
                    + "\\"
                    + repeatStr("_", n / 4 + i);
            System.out.println(midBot);
        }

        for (int i = 0; i < n; i++) {
            System.out.println(repeatStr("_", (n + 2) / 2)
                    + "|||"
                    + repeatStr("_", (n + 2) / 2));
        }

        System.out.println(repeatStr("_", (n + 2) / 2)
                + "~~~"
                + repeatStr("_", (n + 2) / 2));

        for (int i = 0; i < n / 2; i++) {
            String bot = repeatStr("_", ((n + 2) / 2) - 1 - i)
                    + "//"
                    + repeatStr(".", i)
                    + "!"
                    + repeatStr(".", i)
                    + "\\\\"
                    + repeatStr("_", ((n + 2) / 2) - 1 - i);
            System.out.println(bot);
        }
    }

    static String repeatStr(String str, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text += str;
        }
        return text;
    }
}
