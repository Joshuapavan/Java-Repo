package DSA.DSAPlayGround.Arrays.Sorting;


import java.lang.management.OperatingSystemMXBean;
import java.util.Arrays;

/*
    Sort 0's and 1's in an array
 */
public class SortingOfBinaryValues {
    public static void main(String[] args) {

        int[] unSortedBinaryArray = { 1, 0 , 0 , 1, 1 , 1 };
        int[] zerosArray = new int[unSortedBinaryArray.length];
        int[] onesArray = new int[unSortedBinaryArray.length];

        int zeroIndex = 0;
        int oneIndex = 0;

        for(int num : unSortedBinaryArray){
            if (num == 0){
                zerosArray[zeroIndex++] = num;
            }else{
                onesArray[oneIndex++] = num;
            }
        }

        //               source arr, index of source from where we need to copy, destination Array, dest array start index, dest array end index
        System.arraycopy(onesArray, 0, zerosArray, zeroIndex, unSortedBinaryArray.length - zeroIndex);



        System.out.println("Ones Array "+ Arrays.toString(zerosArray));

    }
}