package problems.recursion_and_dynamic_programming.number_of_ways_to_paint;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static final int modulo = ((int) Math.pow(10, 9)) + 7;

    public int numOfWays(int n) {
        List<String> firstRowOptions = new ArrayList<>();
        fillFirstRowOptions("", 0, firstRowOptions);
        int k = firstRowOptions.size();
        int[][] ways = new int[n][k];
        for (int j=0; j<k; j++){
            ways[0][j] = 1;
        }
        for (int i=1; i<n; i++){
            for (int j=0; j<k; j++){
                String curr = firstRowOptions.get(j);
                for (int p=0; p<k; p++){
                    if (p != j){
                        String toCompare = firstRowOptions.get(p);
                        if (isValid(curr, toCompare)){
                            ways[i][j] = (ways[i][j] + ways[i-1][p]) % modulo;
                        }
                    }
                }
            }
        }
        int res = 0;
        for (int j=0; j<k; j++){
            res = (res + ways[n-1][j]) % modulo;
        }
        return res;
    }

    private void fillFirstRowOptions(String s, int i, List<String> options){
        if (s.length() == 3){
            options.add(s);
        }
        else{
            for (char j='1'; j<='3'; j++){
                if (i == 0 || s.charAt(i-1) != j){
                    fillFirstRowOptions(s + j, i+1, options);
                }
            }
        }
    }

    private boolean isValid(String s1, String s2){
        if (s1.length() != s2.length()){
            return false;
        }
        for (int i=0; i<s1.length(); i++){
            if (s1.charAt(i) == s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
