package ru.bpdu;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit
 * of the integer. The digits are ordered from most significant to least significant in left-to-right order.
 * The large integer does not contain any leading 0's.
 * Increment the large integer by one and return the resulting array of digits.
 */

public class PlusOne {

    public static void main(String[] args) {
    }

    public static int[] plusOne(int[] digits) {
        String s = Arrays.stream(digits)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining());
        BigInteger bigInteger = new BigInteger(s);
        String s1 = String.valueOf(bigInteger.add(new BigInteger("1")));
        int[] arr = new int[s1.length()];
        for (int i = 0; i < s1.length(); i++) {
            arr[i] = Integer.parseInt(s1.substring(i, i + 1));
        }
        return arr;
    }
}
