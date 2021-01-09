package problems.math.number_of_digit_one;

public class Solution {

    public static int countDigitOne(int n){
        int res = 0;
        for (int i=1; i<=n; i*=10){
            int temp = n / (i*10); // How many windows there are with 1 as their i digit
            res += temp * i; // Each window is of size i
            int rem = n % (i*10);
            res += Math.min(Math.max(rem-i+1, 0), i); // Add the extra window if needed
        }
        return res;
    }
}
