package jaunuary7th2018;

import java.util.Scanner;

public class Rate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = Double.parseDouble(scanner.nextLine());
        double months = Double.parseDouble(scanner.nextLine());

        double rate = sum;

        for (int i = 0; i < months; i++) {
            rate = 1.027 * rate;
        }
        System.out.printf("Simple interest rate: %.2f lv.", (1.00 + months * 0.03) * sum);
        System.out.printf("%nComplex interest rate: %.2f lv.", rate);

        if ((1.00 + months * 0.03) * sum > rate) {
            System.out.printf("%nChoose a simple interest rate. You will win %.2f lv.", ((1.00 + months * 0.03) * sum) - rate);
        } else {
            System.out.printf("%nChoose a complex interest rate. You will win %.2f lv.", rate - ((1.00 + months * 0.03) * sum));
        }
    }
}
