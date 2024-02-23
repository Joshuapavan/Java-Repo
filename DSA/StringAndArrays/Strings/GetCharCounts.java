package DSA.StringAndArrays.Strings;

import java.util.HashMap;
import java.util.Scanner;

public class GetCharCounts {
    public static void main(String[] args) {
        System.out.println("Enter a string : ");
        String string = new Scanner(System.in).next().toLowerCase();
        HashMap<Character, Integer> countHash = new HashMap<>();

        char[] charArray = string.toCharArray();

        for(char ch : charArray){
            if (countHash.containsKey(ch)){
                countHash.put(ch, countHash.get(ch) + 1);
            }
            else{
                countHash.put(ch, 1);
            }
        }

        System.out.println("The count of each alphabets in the string is : "+countHash);

    }
}
