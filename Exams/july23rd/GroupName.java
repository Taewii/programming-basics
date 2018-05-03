package july23rd;

import java.util.Scanner;

public class GroupName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bigLetter = scanner.nextLine();
        String smallLetter1 = scanner.nextLine();
        String smallLetter2 = scanner.nextLine();
        String smallLetter3 = scanner.nextLine();
        String number = scanner.nextLine();

        int counter = 0;

        String AllinOne = bigLetter + smallLetter1 + smallLetter2 + smallLetter3 + number;
        char bigL = AllinOne.charAt(0);
        char sml1 = AllinOne.charAt(1);
        char sml2 = AllinOne.charAt(2);
        char sml3 = AllinOne.charAt(3);
        char num = AllinOne.charAt(4);

        for (char i = 'A'; i <= bigL; i++) {
            for (char j = 'a'; j <= sml1; j++) {
                for (char k = 'a'; k <= sml2; k++) {
                    for (char l = 'a'; l <= sml3; l++) {
                        for (char m = '0'; m <= num; m++) {
                            if (i == bigL && j == sml1 && k == sml2 && l == sml3 && m == num) {
                                break;
                            }
                            counter++;
                        }
                    }
                }
            }
        }
        System.out.println(counter);
    }
}