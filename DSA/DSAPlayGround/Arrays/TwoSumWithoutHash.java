package DSA.DSAPlayGround.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSumWithoutHash {
    public static void main(String[] args) {

        int[] array = {10, 11, 12, 13, 14, 15};
        System.out.println("The Array is "+ Arrays.toString(array));

        System.out.print("Enter the target element to be found : ");
        int target = new Scanner(System.in).nextInt();

        int[] result = twoSum(array, target);

        if (result[0] != -1){
            System.out.println("Sum is : "+Arrays.toString(result));
        }else {
            System.out.println("Sorry, couldn't find target");
        }

    }

    private static int[] twoSum(int[] array, int target) {
        for(int i = 0 ; i < array.length; i++){
            for(int j = i + 1; j < array.length - 1; j++ ){
                if(array[i] + array[j] == target){
                    return new int[]{array[i], array[j]};
                }
            }
        }
        return new int[]{ -1, -1};
    }
}
