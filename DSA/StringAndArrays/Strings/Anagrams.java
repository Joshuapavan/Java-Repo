package DSA.StringAndArrays.Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        System.out.println("Enter a string : ");
        String string1 = new Scanner(System.in).next();
        System.out.println("Enter another string : ");
        String string2 = new Scanner(System.in).next();

        if(isAnagram(string1, string2)){
            System.out.println("Anagrams");
        }
        else{
            System.out.println("Not anagrams");
        }
    }

    public static boolean isAnagram(String string1, String string2){
        if(string1.length() != string2.length()){
            return false;
        }

        HashMap<Character, Integer> stringHash1 = new HashMap<>();
        HashMap<Character, Integer> stringHash2 = new HashMap<>();

        for(int i = 0 ; i < string1.length() ; i++){
            char ch = string1.charAt(i);
            stringHash1.put(ch , stringHash1.getOrDefault(ch,0)+1);
        }

        for(int i = 0 ; i < string2.length() ; i++){
            char ch = string2.charAt(i);
            stringHash2.put(ch , stringHash2.getOrDefault(ch, 0)+1);
        }

        for(Map.Entry<Character, Integer> entry : stringHash1.entrySet()){
            char key = entry.getKey();
            int count = entry.getValue();

            if(!stringHash2.containsKey(key) || stringHash2.get(key) != count){
                return false;
            }
        }
        return true;
    }
}
