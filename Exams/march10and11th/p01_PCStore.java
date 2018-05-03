package march10and11th;

import java.util.Scanner;

public class p01_PCStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double cpuPrice = Double.parseDouble(scanner.nextLine());
        double gpuPrice = Double.parseDouble(scanner.nextLine());
        double ramPrice = Double.parseDouble(scanner.nextLine());
        int ramCount = Integer.parseInt(scanner.nextLine());
        double discount = Double.parseDouble(scanner.nextLine());

        double cpuInLeva = cpuPrice * 1.57;
        double gpuInLeva = gpuPrice * 1.57;
        double ramInLeva = ramPrice * 1.57;
        double allRam = ramInLeva * ramCount;
        double cpuAfterDiscount = cpuInLeva - (cpuInLeva * discount);
        double gpuAfterDiscount = gpuInLeva - (gpuInLeva * discount);

        double sum = allRam + cpuAfterDiscount + gpuAfterDiscount;

        System.out.printf("Money needed - %.2f leva.", sum);
    }
}
