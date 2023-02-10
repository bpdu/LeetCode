package ru.bpdu;

import java.math.BigInteger;

/**
 * Given two binary strings a and b, return their sum as a binary string.
 */
public class AddBinary {

    public static void main(String[] args) {
    }

    public static String addBinary(String a, String b) {
        BigInteger bigA = new BigInteger(a, 2);
        BigInteger bigB = new BigInteger(b, 2);
        BigInteger bigC = bigA.add(bigB);
        return bigC.toString(2);
    }
}
