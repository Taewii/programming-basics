import java.util.Scanner;

public class P07_LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberCount = Integer.parseInt(scanner.nextLine());
        int leftSide = 0;
        int rightSide = 0;

//        for (int i = 1; i <= 2 * numberCount ; i++) {
//            int currentNumber = Integer.parseInt(scanner.nextLine());
//
//            if (i > numberCount){                                               MORE ADVANCED WAY NIGGA
//                rightSide += currentNumber;
//            } else {
//                leftSide += currentNumber;
//            }
//        }
        for (int i = 0; i < numberCount; i++) {
            int leftSideNumbers = Integer.parseInt(scanner.nextLine());
            leftSide += leftSideNumbers;
        }

        for (int i = 0; i < numberCount; i++) {
            int rightSideNumbers = Integer.parseInt(scanner.nextLine());
            rightSide += rightSideNumbers;
        }

        if (leftSide == rightSide) {
            System.out.printf("Yes, sum = %d", leftSide);
        } else {
            System.out.printf("No, diff = %d", Math.abs(leftSide - rightSide));
        }
    }
}
