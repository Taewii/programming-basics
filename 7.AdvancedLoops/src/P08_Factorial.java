import java.util.Scanner;

public class P08_Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int fact = 1;

//        while (number > 0){
//            fact = fact * number;     easier way
//            number--;
//        }

        do {
            fact = fact * number;
            number--;
        } while (number > 0);
        System.out.println(fact);
    }
}
