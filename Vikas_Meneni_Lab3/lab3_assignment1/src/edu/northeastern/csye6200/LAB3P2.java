package edu.northeastern.csye6200;

import java.util.Arrays;

public class LAB3P2 {

    public static void main(String[] args) {
        int[] givenarr = {1, 21, 13, 14, 9};
     
        System.out.print("Input array: ");
        for (int num : givenarr) {
            System.out.print(num + " ");
        }
        System.out.println();

    
        reverseArray(givenarr);
        System.out.print("Reversed Array: ");
        for (int num : givenarr) {
            System.out.print(num + " ");
        }
        System.out.println();


        rotateArray(givenarr, 2);
        System.out.print("Rotated Array: ");
        for (int num : givenarr) {
            System.out.print(num + " ");
        }
        System.out.println();


        sortArray(givenarr);
        System.out.print("Sorted Array: ");
        for (int num : givenarr) {
            System.out.print(num + " ");
        }
        System.out.println();


        largestElement(givenarr);
    }

    public static void reverseArray(int[] inputArray) {
        for (int start = 0, end = inputArray.length - 1; start < end; start++, end--) {
            int placeholder = inputArray[start];
            inputArray[start] = inputArray[end];
            inputArray[end] = placeholder;
        }
    }


    public static void rotateArray(int[] inputArray, int rotationCount) {
        int arrayLength = inputArray.length;
        rotationCount = rotationCount % arrayLength;

        if (rotationCount == 0) return;

        int[] temp = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            temp[(i + rotationCount) % arrayLength] = inputArray[i];
        }

        System.arraycopy(temp, 0, inputArray, 0, arrayLength);
    }


    public static void sortArray(int[] inputArray) {
        Arrays.sort(inputArray);
    }


    public static void largestElement(int[] inputArray) {
        int maxValue = inputArray[0];
        for (int num : inputArray) {
            if (num > maxValue) {
                maxValue = num;
            }
        }
        System.out.println("The largest element: " + maxValue);
    }
}
