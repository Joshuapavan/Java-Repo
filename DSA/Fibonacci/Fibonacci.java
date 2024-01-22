package DSA.Fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a limit to which the fibonacci sequence must be generated.");
        int limit = scanner.nextInt();

        int first = 0, second = 1;
        for(int i = 0; i < limit; i++){
            System.out.print(first+" ");
            int next = first+second;
            first = second;
            second = next;
        }

//        OR

        System.out.println();
        int firstNum = 0, secondNum = 1;
        System.out.print(firstNum+" "+secondNum);
        for(int i = 2; i < limit; i++){
            int next = firstNum+secondNum;
            System.out.print(" "+next);
            firstNum = secondNum;
            secondNum = next;
        }
    }

//    0 1 1 2 3 5
}
