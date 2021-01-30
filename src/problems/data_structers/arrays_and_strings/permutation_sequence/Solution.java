package problems.data_structers.arrays_and_strings.permutation_sequence;

import java.util.ArrayList;

public class Solution {

    public static String getPermutation(int n, int k) {
        ArrayList<Integer> digits = new ArrayList<>();
        for (int i=1; i<=n; i++){
            digits.add(i);
        }
        StringBuilder sb = new StringBuilder();
        k--;
        while (digits.size() > 0){
            int index = 0;
            if (k>0){
                n--;
                int temp = factorial(n);
                index = k/temp;
                k -= (temp*index);
            }
            sb.append(digits.remove(index));
        }
        return sb.toString();
    }

    private static int factorial(int n){
        int res = 1;
        for (int i=2; i<=n; i++){
            res *= i;
        }
        return res;
    }
}
