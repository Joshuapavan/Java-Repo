package DSA.factorial;

import java.util.Scanner;

public class RecursiveFactorial {
    public static void main(String[] args) {

        int number = new Scanner(System.in).nextInt();
        int factorial = findFactorialUsingRecursion(number);

        System.out.println("The factorial of "+number+" is "+factorial);
    }

    private static int findFactorialUsingRecursion(int number) {
        // 0! = 1
        if (number == 0){
            return 1;
        }else {
            // 5 * 4 = 20 , 20 * 3 = 60, 60 * 2 = 120
            return number * findFactorialUsingRecursion(number - 1);
        }
    }
}
