package DSA.DSAPlayGround.Arrays;

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
        //       value    counter
        HashMap<Integer, Integer> countHash = new HashMap<>();
        int maxcount = 0;
        int result = 0;

        for(int i = 0 ; i < nums.length; i++){
            int count = countHash.getOrDefault(nums[i], 0);
            count++;

            if(maxcount < count){
                maxcount = count;
                result = count;
            }
            else if(maxcount == count){
                result += count;
            }

            countHash.put(nums[i], count);
        }
        return result;
    }
}
