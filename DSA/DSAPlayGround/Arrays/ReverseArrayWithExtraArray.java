package DSA.DSAPlayGround.Arrays;

import java.util.Arrays;

public class ReverseArrayWithExtraArray {
    public static void main(String[] args) {
        int[] array = {4, 5, 1, 2};

        System.out.printf("Array before reversing, %s%n", Arrays.toString(array));

        int[] reversedArray = new int[array.length];

        int j = 0;
        for(int i = array.length - 1; i >= 0; i--){
            reversedArray[j] = array[i];
            j++;
        }
        System.out.printf("Array that is having reversed values, %s%n", Arrays.toString(reversedArray));
    }
}
