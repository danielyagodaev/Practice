package problems.data_structers.arrays_and_strings.simple_calculator;

public class Solution {

    public int calculate(String s) {
        int n=s.length(), res=0, i=0;
        boolean prevOpIsPlus = true;
        StringBuilder sb = new StringBuilder();
        while (i<n){
            char c = s.charAt(i);
            if (c == ' '){
                i++;
                continue;
            }
            if (c >= '0' && c <= '9'){
                sb.append(c);
            }
            else{
                if (sb.length() > 0){
                    int val = Integer.parseInt(sb.toString());
                    sb = new StringBuilder();
                    res = prevOpIsPlus ? res + val : res - val;
                }
                if (c == '+'){
                    prevOpIsPlus = true;
                }
                else if (c == '-'){
                    prevOpIsPlus = false;
                }
                else if (c == '('){
                    int start=++i;
                    int count = 1;
                    while (i<n){
                        if (s.charAt(i) == '('){
                            count++;
                        }
                        else if (s.charAt(i) == ')'){
                            count--;
                            if (count == 0){
                                break;
                            }
                        }
                        i++;
                    }
                    if (count == 0){
                        int innerVal = calculate(s.substring(start, i));
                        res = prevOpIsPlus ? res + innerVal : res - innerVal;
                    }
                }
            }
            i++;
        }
        if (sb.length() > 0){
            int val = Integer.parseInt(sb.toString());
            res = prevOpIsPlus ? res + val : res - val;
        }
        return res;
    }
}
