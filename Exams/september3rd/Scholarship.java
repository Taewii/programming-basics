package september3rd;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salary = Double.parseDouble(scanner.nextLine());
        double grade = Double.parseDouble(scanner.nextLine());
        double minSalary = Double.parseDouble(scanner.nextLine());

        double sum = 0;
        double sum2 = 0;

        if (minSalary > salary && grade > 4.50) {
            sum += minSalary / 2.85714;
        }
        if (minSalary > salary && grade >= 5.50) {
            sum2 += grade * 25;
        }
        if (sum > sum2) {
            System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(sum));
        }
        if (sum < sum2) {
            System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(sum2));
        }
        if (minSalary <= salary && grade >= 5.50) {
            sum2 += grade * 25;
            System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(sum2));
        }
        if (grade < 4.50 || salary == 0 || (salary > minSalary && grade < 4.50 || salary > minSalary && grade < 5.50)) {
            System.out.println("You cannot get a scholarship!");
        }
    }
}
