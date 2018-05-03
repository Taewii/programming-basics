package jaunuary7th2018;

import java.util.Scanner;

public class JuiceDiet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int raspberries = Integer.parseInt(scanner.nextLine());
        int strawberries = Integer.parseInt(scanner.nextLine());
        int cherries = Integer.parseInt(scanner.nextLine());
        int maxJuice = Integer.parseInt(scanner.nextLine());

        double juice = 0;
        int rsp = 0;
        int stb = 0;
        int chr = 0;
                                                 // it dont work
        for (int i = 0; i <= raspberries; i++) {
            for (int j = 0; j <= strawberries ; j++) {
                for (int k = 0; k <= cherries; k++) {
                    double juiceMade = i * 15 + j * 7.5 + k * 4.5;

                    if (maxJuice >= juiceMade && juiceMade > juice){
                        juice = juiceMade;
                        rsp = i;
                        stb = j;
                        chr = k;
                    }
                }
            }
        }
        System.out.printf("%d Raspberries, %d Strawberries, %d Cherries.\n Juice: %.0f ml.", rsp, stb, chr, juice);
    }
}
