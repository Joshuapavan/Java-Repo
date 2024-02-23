package DSA.DSAPlayGround.Arrays.UnionsAndIntersections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindUnionOfMultipleArrays {

    /*
        nums1 =  6 2
        nums2 = 85 25 1 32 54 6
        nums3 = 85 2

        Output:
        7
        Explanation:
        85, 25, 1, 32, 54, 6, and
        2 are the elements which comes in the
        union set of both arrays. So count is
     */

    public static void main(String[] args) {
        int[] nums1 = { 6, 2 };
        int[] nums2 = { 85,25,1,32,54,6 };
        int[] nums3 = { 85,2 };

        int count = countUnionOfArrays(nums1, nums2, nums3);

        System.out.println("Union "+count);
    }

    public static int countUnionOfArrays(int[]... arrays){
        Set<Integer> unionSet = new HashSet<>();

        for(int[] array : arrays){
            for(int value : array){
                unionSet.add(value);
            }
        }

        return unionSet.size();
    }


}

