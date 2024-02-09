package DSA.DSAPlayGround.Arrays.MaxMinProblems;

import java.util.Arrays;

public class MaxAndMin {
    public static void main(String[] args) {
        int[] nums = { 10,9,8,7,6 };

        // Find the max and min

        int max = nums[0];
        int min = nums[0];

        for(int num : nums){
            max = Math.max(max, num);
            min = Math.min(min, num);
        }

        System.out.println("The max value is : "+max+", The min value is "+min);


        // Find the max and min

        Arrays.sort(nums);

        System.out.println("The max value is : "+nums[nums.length - 1]+", The min value is "+nums[0]);
    }
}
