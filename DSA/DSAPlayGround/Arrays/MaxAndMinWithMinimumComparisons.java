package DSA.DSAPlayGround.Arrays;

import java.util.Arrays;

/*
          Input:  arr[] = {3, 5, 4, 1, 9}
          Output: Minimum element is: 1
                  Maximum element is: 9

          Input:  arr[] = {22, 14, 8, 17, 35, 3}
          Output: Minimum element is: 3
                  Maximum element is: 35
 */
public class MaxAndMinWithMinimumComparisons {
    public static void main(String[] args) {
        int[] array = {3, 5, 4, 1, 9};

        Arrays.sort(array);
        System.out.println("Minimum element is : "+array[0]);
        System.out.println("Maximum element is : "+array[array.length - 1]);
    }
}
