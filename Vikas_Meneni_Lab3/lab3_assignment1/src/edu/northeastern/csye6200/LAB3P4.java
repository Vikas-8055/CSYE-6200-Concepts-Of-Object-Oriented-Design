package edu.northeastern.csye6200;

import java.util.Scanner;

public class LAB3P4 {

    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);

        System.out.print("Enter a series of strings (separated by commas): ");
        String inputString = consoleInput.nextLine();
        
        String[] items = inputString.split(",\\s*");

    
        String longestItem = findLongestString(items);

        System.out.print("The longest string(s) are: ");
        boolean first = true;
        for (String item : items) {
            if (item.length() == longestItem.length()) {
                if (!first) {
                    System.out.print(", ");
                }
                
                
                System.out.print(item);
                first = false;
            }
        }

        System.out.println("\nThe longest string was: " + longestItem);
        consoleInput.close();
    }

    public static String findLongestString(String[] a) {
        String longestItem = "";

        for (String currentItem : a) {
            if (currentItem.length() > longestItem.length()) {
                longestItem = currentItem; 
            }
        }
        
        return longestItem;
    }
}
