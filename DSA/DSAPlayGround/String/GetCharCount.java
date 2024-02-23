package DSA.DSAPlayGround.String;

import java.util.HashMap;
import java.util.Scanner;

public class GetCharCount {
    public static void main(String[] args) {
        System.out.print("Enter a string : ");
        String string = new Scanner(System.in).next();

        char[] charArray = string.toCharArray();

        HashMap<Character, Integer> charIntHash = new HashMap<>();
        for(char ch : charArray){
            if(isLetter(ch)){
                if (charIntHash.containsKey(ch)){
                    charIntHash.put(ch, charIntHash.get(ch) + 1);
                }
                else{
                    charIntHash.put(ch, 1);
                }
            }
        }
        System.out.println("The String "+string+" contains "+charIntHash);
    }

    private static boolean isLetter(char ch) {
        return (ch >= 96 && ch <= 122);
    }
}
