package ru.bpdu;

/*
Given an integer x, return true if x is a
palindrome, and false otherwise.
 */

public class PalindromeNumber {
    public static void main(String[] args) {
    }

    //Using int to String conversion
    /* public static boolean isPalindrome(int number) {
        StringBuilder stringBuilder = new StringBuilder(Integer.toString(number));
        return Integer.toString(number).equalsIgnoreCase(stringBuilder.reverse().toString());
    }*/

    //Without int to String conversion
    public static boolean isPalindrome(int number) {
        return true;
    }
}
