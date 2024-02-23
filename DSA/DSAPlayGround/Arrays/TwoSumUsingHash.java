package DSA.DSAPlayGround.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class TwoSumUsingHash {
    public static void main(String[] args) {
        int[] array = {2,7,11,15};
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

    private static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int i = 0 ; i < nums.length; i++){
            int complement = target - nums[i];

            if(hashMap.containsKey(complement)){
                return new int[]{ hashMap.get(complement), i };
            }

            hashMap.put(nums[i], i);
        }
        return new int[]{-1 , -1};
    }

    /*
           //        value   count

    }
     */
}
