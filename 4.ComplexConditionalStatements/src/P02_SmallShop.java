import java.util.Scanner;

public class P02_SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        if (city.equals("Sofia")) {
            if (product.equals("coffee")) {
                System.out.println(0.50 * quantity);
            }
            if (product.equals("water")) {
                System.out.println(0.80 * quantity);
            }
            if (product.equals("beer")) {
                System.out.println(1.20 * quantity);
            }
            if (product.equals("sweets")) {
                System.out.println(1.45 * quantity);
            }
            if (product.equals("peanuts")) {
                System.out.println(1.60 * quantity);
            }
        }

        if (city.equals("Plovdiv")) {
            if (product.equals("coffee")) {
                System.out.println(0.40 * quantity);
            }
            if (product.equals("water")) {
                System.out.println(0.70 * quantity);
            }
            if (product.equals("beer")) {
                System.out.println(1.15 * quantity);
            }
            if (product.equals("sweets")) {
                System.out.println(1.30 * quantity);
            }
            if (product.equals("peanuts")) {
                System.out.println(1.50 * quantity);
            }
        }

        if (city.equals("Varna")) {
            if (product.equals("coffee")) {
                System.out.println(0.45 * quantity);
            }
            if (product.equals("water")) {
                System.out.println(0.70 * quantity);
            }
            if (product.equals("beer")) {
                System.out.println(1.10 * quantity);
            }
            if (product.equals("sweets")) {
                System.out.println(1.35 * quantity);
            }
            if (product.equals("peanuts")) {
                System.out.println(1.55 * quantity);
            }
        }
    }
}
