package DSA.Algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length : ");

        int length = scanner.nextInt();
        int[] unSortedArray = new int[length];

        System.out.println("Enter the elements of the array");
        for(int i = 0 ; i < unSortedArray.length; i++){
            unSortedArray[i] = scanner.nextInt();
        }

        System.out.println("Unsorted Array : "+ Arrays.toString(unSortedArray));

        for(int i = 0; i < unSortedArray.length - 1; i++){
            for (int j = 0; j < unSortedArray.length - i - 1; j++){
                if(unSortedArray[j] > unSortedArray[j + 1]){
                    int temp = unSortedArray[j];
                    unSortedArray[j] = unSortedArray[j + 1];
                    unSortedArray[j + 1] = temp;

                }
            }
        }

        System.out.println("Sorted Array : "+ Arrays.toString(unSortedArray));
    }
}
