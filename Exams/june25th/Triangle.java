package june25th;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(repeatStr("#", (4 * n) + 1));

        for (int i = 0; i < n; i++) {
            String topHalf = repeatStr(".", i + 1)
                    + repeatStr("#", ((n * 2) - 1) - i * 2);

            if (i == (n / 2)) {
                topHalf += repeatStr(" ", (1 + (i * 2) - 3) / 2)
                        + "(@)"
                        + repeatStr(" ", (1 + (i * 2) - 3) / 2);
            } else {
                topHalf += repeatStr(" ", 1 + (i * 2));
            }

            topHalf += repeatStr("#", ((n * 2) - 1) - i * 2)
                    + repeatStr(".", i + 1);
            System.out.println(topHalf);
        }

        for (int i = 0; i < n; i++) {
            String bottomHalf = repeatStr(".", n + (i + 1))
                    + repeatStr("#", ((n * 2) - 1) - i * 2)
                    + repeatStr(".", n + (i + 1));
            System.out.println(bottomHalf);
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
