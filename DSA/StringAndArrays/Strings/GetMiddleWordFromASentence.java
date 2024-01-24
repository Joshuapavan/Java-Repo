package DSA.StringAndArrays.Strings;

import java.util.Scanner;
public class GetMiddleWordFromASentence {
    public static void main(String[] args) {
        System.out.println("Enter a Sentence");

        String sentence = new Scanner(System.in).nextLine();

        String[] words =  sentence.split(" ");
        System.out.println(words[words.length/2]);
    }
}
