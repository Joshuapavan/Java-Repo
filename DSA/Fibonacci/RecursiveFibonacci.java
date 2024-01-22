package DSA.Fibonacci;

import java.util.Scanner;
public class RecursiveFibonacci {

    // 0 1 1 2 3 5
    public static void main(String[] args) {
        System.out.println("Enter limit : ");
        int limit = new Scanner(System.in).nextInt();

        for(int i= 0; i < limit; i++){
            System.out.print(printFibonacciSequence(i)+", ");
        }

    }

    private static int printFibonacciSequence(int num) {
        // 0, 1, 1
        if(num <= 1){
            return num;
        }
        // (1 + 1) 2,(1 + 2 ) 3, (2 + 3)
        else{
            return printFibonacciSequence(num - 1) + printFibonacciSequence(num - 2);
        }
    }
}
