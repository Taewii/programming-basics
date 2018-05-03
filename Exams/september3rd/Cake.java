package september3rd;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        int area = width * length;

        for (int i = area; i >= 0; i = area) {
            String pieces = scanner.nextLine();

            if (pieces.equals("STOP")) {
                System.out.printf("%d pieces are left.", area);
                return;
            }

            int pieces2 = Integer.valueOf(pieces);
            area -= pieces2;
        }
        System.out.printf("No more cake left! You need %d pieces more.", Math.abs(area));
    }
}
