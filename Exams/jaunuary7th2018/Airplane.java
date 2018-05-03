package jaunuary7th2018;

import java.util.Scanner;

public class Airplane {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        int result = hour * 60 + min + length;

        int currentHour = result / 60;
        int currentMin = result - currentHour * 60;

        if (currentHour >= 24) {
            currentHour = currentHour - 24;
        }
        System.out.printf("%dh %dm", currentHour, currentMin);
    }
}


