package july23rd;

import java.util.Scanner;

public class Cup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n / 2; i++) {
            String part1 = repeatStr(".", n + i)
                    + repeatStr("#", (3 * n) - i * 2)
                    + repeatStr(".", n + i);
            System.out.println(part1);
        }

        for (int i = 0; i < (n / 2) + 2; i++) {
            String part2 = repeatStr(".", n + (n / 2) + i)
                    + "#"
                    + repeatStr(".", (n * 2 - 2) - (i * 2))
                    + "#"
                    + repeatStr(".", n + (n / 2) + i);
            if (i == (n / 2) + 1) {
                part2 = repeatStr(".", n + (n / 2) + i - 1)
                        + "#"
                        + repeatStr("#", (n * 2) - (i * 2))
                        + "#"
                        + repeatStr(".", n + (n / 2) + i - 1);
            }
            System.out.println(part2);
        }

        for (int i = 0; i <= n + 1; i++) {
            String part3 = repeatStr(".", n * 2 - 2)
                    + repeatStr("#", n + 4)
                    + repeatStr(".", n * 2 - 2);
            if (i == (n + 1) / 2) {
                part3 = repeatStr(".", (n * 2 - 2) + i - 3)
                        + "D^A^N^C^E^"
                        + repeatStr(".", (n * 2 - 2) + i - 3);
            }
            System.out.println(part3);
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
