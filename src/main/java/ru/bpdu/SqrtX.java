package ru.bpdu;

/**
 * Given a non-negative integer x, return the square root of x rounded down to the nearest integer.
 * The returned integer should be non-negative as well.
 * You must not use any built-in exponent function or operator.
 * For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
 */

public class SqrtX {
    public static void main(String[] args) {
    }

    public static int mySqrt(int x) {
        long l = 0, r = x, mid = 0, ans = 0;

        while(l <= r) {
            mid = l + (r - l) / 2;

            if(mid * mid <= x) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return (int)ans;
    }
}
