package ru.bpdu;

/*
Given an integer x, return true if x is a
palindrome, and false otherwise.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PalindromeNumber {
    public static void main(String[] args) {
    }

    //With int to String conversion
    public static boolean isPalindromeBasic(int number) {
        StringBuilder stringBuilder = new StringBuilder(Integer.toString(number));
        return Integer.toString(number).equalsIgnoreCase(stringBuilder.reverse().toString());
    }

    //Without int to String conversion
    public static List<Integer> intToList(int n) {
        List<Integer> list = new ArrayList<>();
        if (n < 10) {
            list.add(n);
            return list;
        }
        int remainder;
        do {
            remainder = n % 10;
            list.add(remainder);
            n = n / 10;
        } while (n > 9);
        list.add(n);
        return list;
    }
    public static boolean isPalindrome(int number) {
        if (number == 0) {
            return true;
        } else if (number < 0) {
            return false;
        } else {
            List<Integer> nl = intToList(number);
            List<Integer> rl = intToList(number);
            Collections.reverse(rl);
            return nl.equals(rl);
        }
    }
}
