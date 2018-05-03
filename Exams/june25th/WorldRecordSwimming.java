package june25th;

import java.util.Scanner;

public class WorldRecordSwimming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine());
        double meters = Double.parseDouble(scanner.nextLine());
        double seconds = Double.parseDouble(scanner.nextLine());

        double distanceNeeded = meters * seconds;
        double resistance = Math.floor(meters / 15) * 12.5;
        double sum = distanceNeeded + resistance;

        if (sum < record) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", sum);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", sum - record);
        }
    }
}
