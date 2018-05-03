import java.util.Scanner;

public class P07_ChristmasTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int row = 0; row < n + 1; row++) {
            String spaces = repeatStr(" ", n - row);
            String stars = repeatStr("*", row);

            System.out.println(spaces + stars + " | " + stars);
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

