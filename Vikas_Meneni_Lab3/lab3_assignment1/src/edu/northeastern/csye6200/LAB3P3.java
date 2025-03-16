package edu.northeastern.csye6200;

import java.util.Scanner;

public class LAB3P3 {
    
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter the number of values: ");
        int totalCount = userInput.nextInt();

        int[] numberArray = new int[totalCount];
        System.out.print("Enter the numbers: ");
        for (int index = 0; index < totalCount; index++) {
            numberArray[index] = userInput.nextInt();
        }

        if (isConsecutiveFour(numberArray)) {
            System.out.println("The list has consecutive fours");
        } else {
            System.out.println("The list has no consecutive fours");
        }

        userInput.close();
    }

    public static boolean isConsecutiveFour(int[] values) {
        for (int index = 0; index < values.length - 3; index++) {
            if (values[index] == values[index + 1] && 
                values[index] == values[index + 2] && 
                values[index] == values[index + 3]) {
                return true;
            }
        }
        return false;  
    }
}
