package september3rd;

import java.util.Scanner;

public class Snowflake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n - 1; i++) {
            String top = repeatStr(".", i)
                    + "*"
                    + repeatStr(".", n - i)
                    + "*"
                    + repeatStr(".", n - i)
                    + "*"
                    + repeatStr(".", i);
            System.out.println(top);
        }
        System.out.println(repeatStr(".", n - 1) + "*****" + repeatStr(".", n - 1));
        System.out.println(repeatStr("*", 2 * n + 3));
        System.out.println(repeatStr(".", n - 1) + "*****" + repeatStr(".", n - 1));

        for (int i = n - 1; i > 0; i--) {
            String bot = repeatStr(".", i - 1)
                    + "*"
                    + repeatStr(".", n - i + 1)
                    + "*"
                    + repeatStr(".", n - i + 1)
                    + "*"
                    + repeatStr(".", i - 1);
            System.out.println(bot);
        }
    }

    static String repeatStr(String str, int count){
        String text = "";
        for (int i = 0; i < count; i++) {
            text += str;
        }
        return text;
    }
}
