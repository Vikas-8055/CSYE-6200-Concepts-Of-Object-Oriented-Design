package edu.northeastern.csye6200;

import java.util.Scanner;

public class LAB3P1 {

    public static void main(String[] args) {
        
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter a credit card number as a long integer: ");
        long cardNumber = inputScanner.nextLong(); 

        if (isValid(cardNumber)) {
            System.out.println("The card number " + cardNumber + " is valid.");
        } else {
            System.out.println("The card number " + cardNumber + " is invalid.");
        }
       
        inputScanner.close();
    }

    public static boolean isValid(long number) {
        int totalSum = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);
        return (totalSum % 10 == 0);  
    }

    public static int sumOfDoubleEvenPlace(long number) {
        int total = 0;
        String numStr = Long.toString(number);

        for (int i = numStr.length() - 2; i >= 0; i -= 2) {
            int digit = Character.getNumericValue(numStr.charAt(i));
            total += getDigit(digit * 2);
        }
        return total;
    }

    public static int getDigit(int number) {
        return (number < 10) ? number : (number / 10) + (number % 10);
    }

    public static int sumOfOddPlace(long number) {
        int total = 0;
        String numStr = Long.toString(number);

        for (int i = numStr.length() - 1; i >= 0; i -= 2) {
            int digit = Character.getNumericValue(numStr.charAt(i));
            total += digit;
        }
        return total;
    }

    public static boolean prefixMatched(long number, int d) {
        return getPrefix(number, getSize(d)) == d;
    }

    public static int getSize(long d) {
        return Long.toString(d).length();
    }

    public static long getPrefix(long number, int k) {
        String numStr = Long.toString(number);
        return (numStr.length() < k) ? number : Long.parseLong(numStr.substring(0, k));
    }
}
