package ru.bpdu;

/*
Given an integer x, return true if x is a
palindrome, and false otherwise.
 */

public class PalindromeNumber {
    public static void main(String[] args) {
    }

    public static boolean isPalindromeNumber(int number) {
        StringBuilder stringBuilder = new StringBuilder(Integer.toString(number));
        return Integer.toString(number).equalsIgnoreCase(stringBuilder.reverse().toString());
    }
}
