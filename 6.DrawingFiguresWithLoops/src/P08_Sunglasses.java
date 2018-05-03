import java.util.Scanner;

public class P08_Sunglasses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String FirstAndLastRow =
                repeatStr("*", n * 2)
                + repeatStr(" ", n)
                + repeatStr("*", n * 2);
        System.out.println(FirstAndLastRow);

        for (int i = 0; i < n - 2; i++) {
            String MiddleRow = "*"
                    + repeatStr("/", n * 2 - 2)
                    + "*";

            if (i == (n - 1) / 2 - 1) {
                MiddleRow += repeatStr("|", n);
            } else {
                MiddleRow += repeatStr(" ", n);
            }

            MiddleRow += "*"
                    + repeatStr("/", n * 2 - 2)
                    + "*";
            System.out.println(MiddleRow);
        }
        System.out.println(FirstAndLastRow);
    }

    static String repeatStr(String strToRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text += strToRepeat;
        }
        return text;
    }
}
