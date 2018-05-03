package march10and11th;

import java.util.Scanner;

public class PrimePairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int aCap = Integer.parseInt(scanner.nextLine());
        int bCap = Integer.parseInt(scanner.nextLine());

        for (int i = a; i <= a + aCap; i++) {
            for (int j = b; j <= b + bCap; j++) {
                if (IsPrime(i) && IsPrime(j)){
                    System.out.printf("%d%d%n", i, j);
                }
            }
        }
    }

    static boolean IsPrime(int number)
    {
        if (number == 1) return false;
        if (number == 2) return true;
        if (number % 2 == 0)  return false;

        int boundary = (int)Math.floor(Math.sqrt(number));

        for (int i = 3; i <= boundary; i+=2)
        {
            if (number % i == 0)  return false;
        }

        return true;
    }
}
