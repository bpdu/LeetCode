package ru.bpdu;

//Write an algorithm to determine if a number n is happy.
//A happy number is a number defined by the following process:
//    Starting with any positive integer, replace the number by the sum of the squares of its digits.
//    Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle
//    which does not include 1.
//    Those numbers for which this process ends in 1 are happy.
//Return true if n is a happy number, and false if not.

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class HappyNumber {
    public static void main(String[] args) {
    }

    public static boolean isHappy(int n) {
        Set<Integer> loopNumbers = new TreeSet<>();
        int number = n;
        int sum = 0;
        while (true) {
            if (sum == 1) return true;
            sum = Arrays.stream(String.valueOf(number).split(""))
                    .map(Integer::parseInt)
                    .mapToInt(i -> i * i)
                    .sum();
            if (loopNumbers.contains(sum)) return false;
            number = sum;
            loopNumbers.add(number);
        }
    }
}
