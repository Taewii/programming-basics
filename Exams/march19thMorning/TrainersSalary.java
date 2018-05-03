package march19thMorning;

import java.util.Scanner;

public class TrainersSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lectures = Integer.parseInt(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

        double budgetPerPerson = budget / lectures;

        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;

        for (int i = 0; i < lectures; i++) {
            String name = scanner.nextLine();

            if ("Jelev".equals(name)) {
                n1++;

            } else if ("RoYaL".equals(name)) {
                n2++;

            } else if ("Roli".equals(name)) {
                n3++;

            } else if ("Trofon".equals(name)) {
                n4++;

            } else if ("Sino".equals(name)) {
                n5++;

            } else {
                n6++;
            }
        }

        System.out.printf("Jelev salary: %.2f lv%n", n1 * budgetPerPerson);
        System.out.printf("RoYaL salary: %.2f lv%n", n2 * budgetPerPerson);
        System.out.printf("Roli salary: %.2f lv%n", n3 * budgetPerPerson);
        System.out.printf("Trofon salary: %.2f lv%n", n4 * budgetPerPerson);
        System.out.printf("Sino salary: %.2f lv%n", n5 * budgetPerPerson);
        System.out.printf("Others salary: %.2f lv", n6 * budgetPerPerson);
    }
}
