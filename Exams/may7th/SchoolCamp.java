package may7th;

import java.util.Scanner;

public class SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String type = scanner.nextLine();
        double students = Double.parseDouble(scanner.nextLine());
        double nights = Double.parseDouble(scanner.nextLine());

        double value = 0;

        switch (season) {
            case "Winter":
                if (type.equals("girls") || type.equals("boys")) {
                    if (students >= 50) {
                        value = (students * nights * 9.60) * 0.50;
                    } else if (students < 50 && students >= 20) {
                        value = (students * nights * 9.60) * 0.85;
                    } else if (students >= 10 && students < 20) {
                        value = (students * nights * 9.60) * 0.95;
                    } else {
                        value = students * nights * 9.60;
                    }
                }
                if (type.equals("mixed")) {
                    if (students >= 50) {
                        value = (nights * 10) * 0.50;
                    } else if (students < 50 && students >= 20) {
                        value = (students * nights * 10) * 0.85;
                    } else if (students >= 10 && students < 20) {
                        value = (students * nights * 10) * 0.95;
                    } else {
                        value = students * nights * 10;
                    }

                }
                break;
            case "Spring":
                if (type.equals("girls") || type.equals("boys")) {
                    if (students >= 50) {
                        value = (students * nights * 7.20) * 0.50;
                    } else if (students < 50 && students >= 20) {
                        value = (students * nights * 7.20) * 0.85;
                    } else if (students >= 10 && students < 20) {
                        value = (students * nights * 7.20) * 0.95;
                    } else {
                        value = students * nights * 7.20;
                    }
                }
                if (type.equals("mixed")) {
                    if (students >= 50) {
                        value = (students * nights * 9.50) * 0.50;
                    } else if (students < 50 && students >= 20) {
                        value = (students * nights * 9.50) * 0.85;
                    } else if (students >= 10 && students < 20) {
                        value = (students * nights * 9.50) * 0.95;
                    } else {
                        value = students * nights * 9.50;
                    }

                }
                break;
            case "Summer":
                if (type.equals("girls") || type.equals("boys")) {
                    if (students >= 50) {
                        value = (students * nights * 15) * 0.50;
                    } else if (students < 50 && students >= 20) {
                        value = (students * nights * 15) * 0.85;
                    } else if (students >= 10 && students < 20) {
                        value = (students * nights * 15) * 0.95;
                    } else {
                        value = students * nights * 15;
                    }
                }
                if (type.equals("mixed")) {
                    if (students >= 50) {
                        value = (students * nights * 20) * 0.50;
                    } else if (students < 50 && students >= 20) {
                        value = (students * nights * 20) * 0.85;
                    } else if (students >= 10 && students < 20) {
                        value = (students * nights * 20) * 0.95;
                    } else {
                        value = students * nights * 20;
                    }

                }
                break;
        }
        switch (season) {
            case "Winter":
                switch (type) {
                    case "girls":
                        System.out.print("Gymnastics");
                        break;
                    case "boys":
                        System.out.print("Judo");
                        break;
                    case "mixed":
                        System.out.print("Ski");
                        break;
                }
                break;
            case "Spring":
                switch (type) {
                    case "girls":
                        System.out.print("Athletics");
                        break;
                    case "boys":
                        System.out.print("Tennis");
                        break;
                    case "mixed":
                        System.out.print("Cycling");
                        break;
                }
                break;
            case "Summer":
                switch (type) {
                    case "girls":
                        System.out.print("Volleyball");
                        break;
                    case "boys":
                        System.out.print("Football");
                        break;
                    case "mixed":
                        System.out.print("Swimming");
                        break;
                }
        }
        System.out.printf(" %.2f lv.", value);
    }
}
