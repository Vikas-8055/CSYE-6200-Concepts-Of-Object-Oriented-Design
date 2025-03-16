package edu.northeastern.csye6200;

import java.util.ArrayList;
import java.util.Scanner;

public class LAB8P1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

     
        int[][] matrix = new int[rows][cols];

       
        System.out.println("The array content is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int) (Math.random() * 10); 
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


        int maxRowSum = Integer.MIN_VALUE;
        ArrayList<Integer> largestRowIndices = new ArrayList<>();
        for (int i = 0; i < rows; i++) {
            int rowSum = sumRow(matrix[i]);
            if (rowSum > maxRowSum) {
                maxRowSum = rowSum;
                largestRowIndices.clear();
                largestRowIndices.add(i);
            } else if (rowSum == maxRowSum) {
                largestRowIndices.add(i);
            }
        }

        
        int maxColSum = Integer.MIN_VALUE;
        ArrayList<Integer> largestColIndices = new ArrayList<>();
        for (int j = 0; j < cols; j++) {
            int colSum = sumColumn(matrix, j);
            if (colSum > maxColSum) {
                maxColSum = colSum;
                largestColIndices.clear();
                largestColIndices.add(j);
            } else if (colSum == maxColSum) {
                largestColIndices.add(j);
            }
        }

        
        System.out.println("The index of the largest row: " + largestRowIndices);
        System.out.println("The index of the largest column: " + largestColIndices);
    }

   
    public static int sumRow(int row[]) {
        int sum = 0;
        for (int i = 0; i < row.length; i++) {
            sum += row[i];
        }
        return sum;
    }

   
    public static int sumColumn(int matrix[][], int column) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][column];
        }
        return sum;
    }
}