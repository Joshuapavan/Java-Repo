package Arrays.oneDim;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");

        int[] array = new int[scanner.nextInt()];
        System.out.println("Enter the elements of the array");
        acceptArray(array, scanner);
        System.out.println("The Elements of the array are: ");
        printArray(array);

        System.out.println("Enter the target to be found: ");
        int target = acceptTarget(scanner);
        scanner.close();

        int targetIndex = linearSearch(array, target);

        if (targetIndex >= 0){
            System.out.print("The target index in the array "+ Arrays.toString(array)+ " is "+targetIndex);
        }else {
            System.out.println("Unable to find the element "+target+" in the array"+ Arrays.toString(array));
        }

    }

    private static int linearSearch(int[] array, int target) {
        for (int i = 0 ; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1 ;
    }

    public static void acceptArray(int[] array, Scanner scanner){
        for(int i = 0 ; i < array.length ; i++) {
            if (scanner.hasNextInt()) {
                array[i] = scanner.nextInt();
            }
        }
    }

    public static void printArray(int[] array){
        System.out.println(Arrays.toString(array));
    }

    public static int acceptTarget(Scanner scanner) {
        while (true) {
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next();
            }
        }
    }
}
