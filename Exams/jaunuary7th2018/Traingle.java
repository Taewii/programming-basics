package jaunuary7th2018;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Traingle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double c = Double.parseDouble(scanner.nextLine());
        DecimalFormat format = new DecimalFormat("0.#");

        if (a < b + c && b < a + c && c < a + b){                // GIVE 90/100 NO CLUE WHATS WRONG
            if (a == b && b == c){
                System.out.printf("Triangle with sides %s, %s and %s is equilateral.", format.format(a), format.format(b), format.format(c));
            }
            if ((a == b && b != c) || (b == c && c != a)){
                System.out.printf("Triangle with sides %s, %s and %s is isosceles.", format.format(a), format.format(b), format.format(c));
            }
            if (a != b && b != c){
                System.out.printf("Triangle with sides %s, %s and %s is scalene.", format.format(a), format.format(b), format.format(c));
            }
        } else {
            System.out.printf("There is no triangle with sides %s, %s and %s.", format.format(a), format.format(b), format.format(c));
        }
    }
}
