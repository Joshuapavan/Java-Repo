package DSA.DSAPlayGround.Arrays.MaxMinProblems;

import java.util.Arrays;
import java.util.HashMap;

/*
    You are given an array nums consisting of positive integers.

    Return the total frequencies of elements in nums such that those elements all have the maximum frequency.

    The frequency of an element is the number of occurrences of that element in the array.


    Example 1:

    Input: nums = [1,2,2,3,1,4]
    Output: 4
    Explanation: The elements 1 and 2 have a frequency of 2 which is the maximum frequency in the array.
    So the number of elements in the array with maximum frequency is 4.
    Example 2:

    Input: nums = [1,2,3,4,5]
    Output: 5
    Explanation: All elements of the array have a frequency of 1 which is the maximum.
    So the number of elements in the array with maximum frequency is 5.

 */
public class MaxFrequencyElements {

    public static void main(String[] args) {
        int[] array1 = { 1,2,2,3,1,4 };
        int[] array2 = {1,2,3,4,5};

        int result1 = findMaxFrequencyElements(array1);
        int result2 = findMaxFrequencyElements(array2);

        System.out.println("Result for "+ Arrays.toString(array1)+" is "+result1);
        System.out.println("Result for "+ Arrays.toString(array2)+" is "+result2);
    }

    private static int findMaxFrequencyElements(int[] nums) {
        //   array_value, counter
        HashMap<Integer,Integer> frequencyHash = new HashMap<>();

        for(int i : nums){
            frequencyHash.put(nums[i], (frequencyHash.getOrDefault(nums[i], 0) + 1) );
        }

        int maxCount = 0;
        for(int frequency : frequencyHash.values()){
            maxCount = Math.max(frequency, maxCount);
        }

        return maxCount;
    }
}
