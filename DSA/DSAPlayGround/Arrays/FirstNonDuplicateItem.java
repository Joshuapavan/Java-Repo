package DSA.DSAPlayGround.Arrays;

import java.util.*;

public class FirstNonDuplicateItem {
    public static void main(String[] args) {
        int[][] arrayOfArrays = {
                {1, 2, 3},
                {2, 3, 1},
                {4}
        };
        int[] flattenedArray = Arrays.stream(arrayOfArrays).flatMapToInt(Arrays::stream).toArray();

        System.out.println(Arrays.toString(flattenedArray));

        //        count   value
        HashMap<Integer, Integer> countOfValues = new HashMap<>();

        for(int i = 0; i < flattenedArray.length; i++){
            if(countOfValues.containsKey(flattenedArray[i])){
                countOfValues.put(countOfValues.get(flattenedArray[i]) + 1, flattenedArray[i]);
            }
            countOfValues.put(1,flattenedArray[i]);
        }
        System.out.println(countOfValues.get(1));
    }
}

