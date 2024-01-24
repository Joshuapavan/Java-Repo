package DSA.DSAPlayGround.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class TwoSumUsingHash {
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
        HashMap<Integer, Integer> twoSumHash = new HashMap<>();

        for(int i : array){
            int complement = target - i;

            if(twoSumHash.containsKey(complement)){
                return new int[]{twoSumHash.get(complement), i };
            }

            twoSumHash.put(i,i);
        }
        return new int[]{-1, -1};
    }
}
