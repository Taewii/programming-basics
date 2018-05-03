package november5th;

import java.util.Scanner;

public class Lutenitsa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tomatoes = Double.parseDouble(scanner.nextLine());
        double boxes = Double.parseDouble(scanner.nextLine());
        double jars = Double.parseDouble(scanner.nextLine());

        double lutenitsa = tomatoes / 5;
        double jarsNeeded = lutenitsa / 0.535;
        double boxesNeeded = jarsNeeded / jars;

        double boxesLeft = Math.abs(boxesNeeded - boxes);
        double jarsLeft = Math.abs(jarsNeeded - (jars * boxes));

        if (boxesNeeded >= boxes) {
            System.out.printf("Total lutenica: %.0f kilograms.%n%.0f boxes left.%n%.0f jars left.",
                    Math.floor(lutenitsa), Math.floor(boxesLeft), Math.floor(jarsLeft));
        } else {
            System.out.printf("Total lutenica: %.0f kilograms.%n%.0f more boxes needed.%n%.0f more jars needed.",
                    Math.floor(lutenitsa), Math.floor(boxesLeft), Math.floor(jarsLeft));
        }
    }
}
