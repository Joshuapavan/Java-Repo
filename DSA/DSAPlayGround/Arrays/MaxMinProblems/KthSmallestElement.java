package DSA.DSAPlayGround.Arrays.MaxMinProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
    Given an array arr[] and an integer K where K is smaller than size of array,
    the task is to find the Kth smallest element in the given array.
     It is given that all array elements are distinct.
    Note :-  l and r denotes the starting and ending index of the array.

    Example 1 :
        Input:
            N = 6
            arr[] = 7 10 4 3 20 15
            K = 3 L=0 R=5

            Output : 7

            Explanation :
                3rd smallest element in the given
                array is 7

        Input:
            N = 5
            arr[] = 7 10 4 20 15
            K = 4 L=0 R=4

            Output : 15

            Explanation :
                4th smallest element in the given
                array is 15.

 */
public class KthSmallestElement {
    public static void main(String[] args) {
        int[] array = {7,10,4,3,20,15};

        System.out.println("Array : "+Arrays.toString(array));

        System.out.print("k : ");
        int k = new Scanner(System.in).nextInt();
        System.out.print("l : ");
        int l = new Scanner(System.in).nextInt();
        System.out.print("r : ");
        int r = new Scanner(System.in).nextInt();


        int[] subArray = Arrays.copyOfRange(array,l, r);
        Arrays.sort(subArray);
        System.out.println("Output : "+subArray[k - 1]);


    }
}

