import java.util.Scanner;

public class P10_Diamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int leftRightSize = (n - 1) / 2;
        int lastNumber = (n + 1) / 2;

        for (int i = 0; i < (n - 1) / 2; i++) {
            System.out.print(repeatStr("-", leftRightSize) + "*");
            int mid = n - 2 * leftRightSize - 2;
            if (mid >= 0) {
                System.out.print(repeatStr("-", mid) + "*");
            }
            System.out.println(repeatStr("-", leftRightSize));
            leftRightSize--;
        }

        leftRightSize = 0;
        for (int i = lastNumber; i > 0; i--) {
            System.out.print(repeatStr("-", leftRightSize) + "*");
            int mid = n - 2 * leftRightSize - 2;
            if (mid >= 0) {
                System.out.print(repeatStr("-", mid) + "*");
            }
            System.out.println(repeatStr("-", leftRightSize));
            leftRightSize++;
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
