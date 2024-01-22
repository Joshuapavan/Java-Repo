package DSA.StringAndArrays;

import java.util.Scanner;

public class AlphaNumberSpecialCount {
    public static void main(String[] args) {
        System.out.println("Please enter a string");

        String string = new Scanner(System.in).next();
        findAlphaNumberSpecialCount(string);
    }

    public static void findAlphaNumberSpecialCount(String string){
        string = string.toLowerCase();
        int alphabetCount= 0,numericCount = 0,specialCharCount = 0;

        for(int i = 0 ; i < string.length(); i++){
            if(string.charAt(i) >= 'a' && string.charAt(i) <= 'z'){
                alphabetCount++;
            }else if (string.charAt(i) >= '0' && string.charAt(i) <= '9'){
                numericCount++;
            }else{
                specialCharCount++;
            }
        }

        System.out.println("Character Count: "+alphabetCount+", Numeric Count: "+numericCount+", Special Character Count: "+specialCharCount);

    }
}
