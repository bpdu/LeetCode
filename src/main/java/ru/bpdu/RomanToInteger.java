package ru.bpdu;

/**
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 *
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 *
 * For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is
 * simply X + II. The number 27 is written as XXVII, which is XX + V + II.
 *
 * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four
 * is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it
 * making four. The same principle applies to the number nine, which is written as IX. There are six instances
 * where subtraction is used:
 *
 *     I can be placed before V (5) and X (10) to make 4 and 9.
 *     X can be placed before L (50) and C (100) to make 40 and 90.
 *     C can be placed before D (500) and M (1000) to make 400 and 900.
 *
 * Given a roman numeral, convert it to an integer.
 */

public class RomanToInteger {

    public static void main(String[] args) {

    }

    public static int romanToInt(String s) {
        char[] strs = s.toCharArray();
        int sl = strs.length;
        int number = 0;
        int i = 0;
        while (i < sl) {
                switch (strs[i]) {
                    case 'I':
                        if (i == sl - 1) {
                            number++;
                            i++;
                            break;
                        } else if (strs[i + 1] == 'V') {
                            number += 4;
                            i += 2;
                            break;
                        } else if (strs[i + 1] == 'X') {
                            number += 9;
                            i += 2;
                            break;
                        } else {
                            number++;
                            i++;
                            break;
                        }
                    case 'V':
                        number += 5;
                        i++;
                        break;
                    case 'X':
                        if (i == sl - 1) {
                            number += 10;
                            i++;
                            break;
                        } else if (strs[i + 1] == 'L') {
                            number += 40;
                            i += 2;
                            break;
                        } else if (strs[i + 1] == 'C') {
                            number += 90;
                            i += 2;
                            break;
                        } else {
                            number += 10;
                            i++;
                            break;
                        }
                    case 'L':
                        number += 50;
                        i++;
                        break;
                    case 'C':
                        if (i == sl - 1) {
                            number += 100;
                            i++;
                            break;
                        } else if (strs[i + 1] == 'D') {
                            number += 400;
                            i += 2;
                            break;
                        } else if (strs[i + 1] == 'M') {
                            number += 900;
                            i += 2;
                            break;
                        } else {
                            number += 100;
                            i++;
                            break;
                        }
                    case 'D':
                        number += 500;
                        i++;
                        break;
                    case 'M':
                        number += 1000;
                        i++;
                        break;
                }

        }
        return number;
    }
}
