package march10and11th;

import java.util.Scanner;

public class Sword {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int width = 2 * n + 1;

        //top
        System.out.printf("%s/^\\%s%n", repeatStr("#", n - 1), repeatStr("#", n - 1));
        for (int row = 0; row < n / 2; row++) {
            System.out.printf("%s.%s.%s%n", repeatStr("#", n - 2 - row),
                    repeatStr(" ", 3 + 2 * row),
                    repeatStr("#", n - 2 - row));
        }

        //blade
        for (int row = 0; row < n+3; row++) {
            System.out.printf("%s|%s", repeatStr("#", (n - 1) / 2),
                    repeatStr(" ", n / 2));
            if (row == 0){
                System.out.print("S");
            }else if (row == 1){
                System.out.print("O");
            }else if (row == 2){
                System.out.print("F");
            }else if (row == 3){
                System.out.print("T");
            }else if (row == n){
                System.out.print("U");
            }else if (row == n+1){
                System.out.print("N");
            }else if (row == n+2){
                System.out.print("I");
            }else {
                System.out.print(" ");
            }
            System.out.printf("%s|%s%n", repeatStr(" ", n / 2),
                    repeatStr("#", (n - 1) / 2));
        }

        //handle
        System.out.printf("@%s@%n", repeatStr("=", width-2));
        for (int row = 0; row < n / 2; row++) {
            System.out.printf("%s|%s|%s%n", repeatStr("#", (n+3)/2),
                    repeatStr(" ", width-2*((n+3)/2)-2),
                    repeatStr("#", (n+3)/2));
        }
        System.out.printf("%s\\%s/%s", repeatStr("#", (n+3)/2),
                repeatStr(".", width-2*((n+3)/2)-2) ,
                repeatStr("#", (n+3)/2 ));
    }

    static String repeatStr(String text, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(text);
        }
        return sb.toString();
    }

}