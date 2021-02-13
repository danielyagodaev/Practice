package problems.data_structers.arrays_and_strings.shortest_palindrome;

public class Solution {

    public static String shortestPalindrome(String s) {
        int n = s.length();
        if (n == 0 || n == 1){
            return s;
        }
        int end = n-1;
        while (end > 0){
            if (isPalindrome(s.substring(0, end+1))){
                break;
            }
            end--;
        }
        StringBuilder sb = new StringBuilder();
        int temp = n-1;
        while (temp > end){
            sb.append(s.charAt(temp));
            temp--;
        }
        sb.append(s);
        return sb.toString();
    }

    private static boolean isPalindrome(String s){
        int n = s.length();
        if (n == 0 || n == 1){
            return true;
        }
        int left = 0, right = n-1;
        while (right > left){
            if (s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
