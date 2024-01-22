package DSA.factorial;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int factorial = 1;
        scanner.close();

        for(int i = 1; i <= number; i++){
            factorial*=i;
        }

        System.out.println("Factorial: "+factorial);
    }
}
