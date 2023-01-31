package ru.bpdu;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string
 * is valid.
 *
 * An input string is valid if:
 *     - Open brackets must be closed by the same type of brackets.
 *     - Open brackets must be closed in the correct order.
 *     - Every close bracket has a corresponding open bracket of the same type.
 */

public class ValidParentheses {
    public static Map<String, String> bracketTypes = new HashMap<>() {{
        put("(", ")");
        put("{" , "}");
        put("[" , "]");
    }};

    public static void main(String[] args) {
    }

    public static boolean isOuterParenthesesValid(String ss) {
        String s0 = String.valueOf(ss.charAt(0));
        return (bracketTypes.containsKey(s0) &&
                String.valueOf(ss.charAt(ss.length() - 1)).equals(bracketTypes.get(s0)));
    }

    public static boolean isFirstNeighborParenthesesValid(String ss) {
        String s0 = String.valueOf(ss.charAt(0));
        String s1 = String.valueOf(ss.charAt(1));
        return (bracketTypes.containsKey(s0) && s1.equals(bracketTypes.get(s0)));
    }

    public static boolean isLastNeighborParenthesesValid(String ss) {
        String s0 = String.valueOf(ss.charAt(ss.length() - 2));
        String s1 = String.valueOf(ss.charAt(ss.length() - 1));
        return (bracketTypes.containsKey(s0) && s1.equals(bracketTypes.get(s0)));
    }

    public static boolean isLastTwoParenthesesValid(String ss) {
        if (ss.length() == 2 && (ss.equals("()") || ss.equals("{}") || ss.equals("[]"))) return true;
        return false;
    }

    public static boolean isRegularParenthesesValid(String ss) {
        StringBuilder sb = new StringBuilder(ss);
        if (isLastTwoParenthesesValid(sb.toString())) return true;
        if (isFirstNeighborParenthesesValid(sb.toString()) && isParenthesesValid(sb.delete(0, 2).toString())) return true;
        if (isLastNeighborParenthesesValid(sb.toString()) &&
                isParenthesesValid(sb.delete(sb.length() - 2, sb.length()).toString())) return true;
        if (isOuterParenthesesValid(sb.toString()) &&
                isParenthesesValid(sb.deleteCharAt(0).deleteCharAt(sb.length() - 1).toString())) return true;
        return false;
    }

    public static boolean isParenthesesValid(String ss) {
        if (isRegularParenthesesValid(ss)) return true;
        for (int i = 2; i < ss.length(); i+=2) {
            if (isRegularParenthesesValid(ss.substring(0, i)) && isRegularParenthesesValid(ss.substring(i, ss.length())))
                return true;
        }
        return false;
    }

    public static boolean isValid(String s) {
        if (s.equals("") || s.length() % 2 != 0) return false;
        if (s.length() == 2) return isLastTwoParenthesesValid(s);
        if (isParenthesesValid(s)) return true;
        for (int i = 2; i < s.length(); i+=2) {
            if (isParenthesesValid(s.substring(0, i)) && isParenthesesValid(s.substring(i, s.length()))) return true;
        }
        return false;
    }
}