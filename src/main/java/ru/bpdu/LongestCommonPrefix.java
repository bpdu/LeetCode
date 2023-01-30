package ru.bpdu;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 */

public class LongestCommonPrefix {
    public static void main(String[] args) {
    }

    public static String longestCommonPrefix(String[] strs) {
        int i = 0;
        String pattern = strs[i];
        while (i < strs.length) {
            if (strs[i].equals("") || pattern.equals("")) {
                return "";
            } else if (strs[i].startsWith(pattern)) {
                i++;
            } else  if (pattern.length() == 1) {
                return "";
            } else {
                pattern = pattern.substring(0, pattern.length() - 1);
            }
        }
        return pattern;
    }
}
