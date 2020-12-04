package problems.regular_expression_match;

public class Solution {

    /**
     * Given an input string (s) and a pattern (p), implement regular expression matching with support for '.' and '*' where:
     * '.' Matches any single character.
     * '*' Matches zero or more of the preceding element.
     * Constraints:
     * 0 <= s.length <= 20
     * 0 <= p.length <= 30
     * s contains only lowercase English letters.
     * p contains only lowercase English letters, '.', and '*'.
     * It is guaranteed for each appearance of the character '*', there will be a previous valid character to match.
     */
    public static boolean isMatch(String s, String p) {
        int n1 = s.length();
        int n2 = p.length();
        if (n1 == 0 && n2 == 0) {
            return true;
        } else if (n2 == 0) {
            return false;
        } else {
            char c2 = p.charAt(n2 - 1);
            if (c2 == '*') {
                char toMatch = p.charAt(n2 - 2);
                boolean res = false;
                int i = n1 - 1;
                while (i >= 0 && (s.charAt(i) == toMatch || toMatch == '.')){
                    res = res || isMatch(s.substring(0, i), p.substring(0, n2 - 2));
                    i--;
                }
                res = res || isMatch(s, p.substring(0, n2 - 2));
                return res;
            } else if (n1 > 0 && (c2 == '.' || c2 == s.charAt(n1 - 1))) {
                return isMatch(s.substring(0, n1 - 1), p.substring(0, n2 - 1));
            } else {
                // s is empty or there is no match
                return false;
            }
        }
    }

}
