package DSA.DSAPlayGround.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");

        int size = scanner.nextInt();
        int[] array = new int[size];

        for(int i = 0; i < array.length; i++){
            System.out.print("Enter the "+i+" th element of the array : ");
            array[i] = scanner.nextInt();
        }

        System.out.println("The array before sorting : "+ Arrays.toString(array));

        for(int i = 0 ; i < array.length ; i++){
            for(int j = 0; j < array.length - i - 1; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }

        System.out.println("The array after sorting is : "+Arrays.toString(array));
    }
}
