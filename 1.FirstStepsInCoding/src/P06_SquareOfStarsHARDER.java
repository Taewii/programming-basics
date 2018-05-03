import java.util.Scanner;

public class P06_SquareOfStarsHARDER {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String firstAndLastRow = "";

        firstAndLastRow = repeatText("*", n);
        System.out.println(firstAndLastRow);

        for (int i = 0; i < n - 2 ; i++) {

            System.out.println("*" + repeatText(" ", n - 2) + "*");
        }

        System.out.println(firstAndLastRow);
    }
    static String repeatText(String textToRepeat, int count){
        String text = "";
        for (int i = 0; i < count; i++) {
            text = text + textToRepeat;
        }
        return text;
    }
}

