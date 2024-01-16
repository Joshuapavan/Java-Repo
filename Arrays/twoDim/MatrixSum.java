package Arrays.twoDim;

import java.util.*;

public class MatrixSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the dimensions of the matrices (m*n) : ");
        System.out.println("Enter the value for m : ");
        int m = acceptNumber(scanner);

        System.out.println("Enter the value for n : ");
        int n = acceptNumber(scanner);

        System.out.println("Enter the values for the first matrix ");
        int[][] matrix1 = acceptMatrix(scanner, m, n);

        System.out.println("Enter the values for the second matrix ");
        int[][] matrix2 = acceptMatrix(scanner, m , n);

        scanner.close();

        System.out.println("The first matrix is : ");
        printMatrix(matrix1, m , n);
        System.out.println("The second matrix is : ");
        printMatrix(matrix2, m ,n);

        int[][] matrix3 = sumOfMatrices(matrix1, matrix2, m, n);

        System.out.println("The sum of the two matrices is : ");
        printMatrix(matrix3, m , n);

    }

    public static int[][] sumOfMatrices(int[][] matrix1, int[][] matrix2, int m, int n){
        int[][] sumMatrix = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return sumMatrix;
    }

    public static int[][] acceptMatrix(Scanner scanner, int m,int  n){
        int[][] matrix = new int[m][n];
        for(int i = 0; i < m ; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Enter the value for matrix [" + i + "] * [" + j + "]");
                while (true) {
                    if (scanner.hasNextInt()) {
                        matrix[i][j] = scanner.nextInt();
                        break;
                    } else {
                        System.out.println("Please enter a valid value for matrix [" + i + "] * [" + j + "]");
                    }
                }
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix, int m, int n){
        for (int i = 0; i < m ; i++) {
            System.out.print("[");
            for (int j = 0; j < n; j++) {
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.print("]\n");
        }
    }

    public static int acceptNumber(Scanner scanner){
        int num;
        while(true){
            if(scanner.hasNextInt()){
                num = scanner.nextInt();
                break;
            }
            else{
                System.out.println("Please enter a valid numeric value: ");
            }
        }
        return num;
    }
}
