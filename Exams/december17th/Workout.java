package december17th;

import com.sun.org.apache.bcel.internal.classfile.SourceFile;

import java.util.Scanner;

public class Workout {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double days = Double.parseDouble(scanner.nextLine());
        double km = Double.parseDouble(scanner.nextLine());

        double sum = km;
        double sumTotal = km;

        for (int i = 0; i < days; i++) {
            double percent = Double.parseDouble(scanner.nextLine());
            sum += sum * (percent / 100);
            sumTotal += sum;
        }
        if (sumTotal < 1000) {
            System.out.printf("Sorry Mrs. Ivanova, you need to run %.0f more kilometers", Math.ceil(1000 - sumTotal));
        } else {
            System.out.printf("You've done a great job running %.0f more kilometers!", Math.ceil(sumTotal - 1000));
        }
    }
}
