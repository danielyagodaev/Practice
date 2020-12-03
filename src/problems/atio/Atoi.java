package problems.atio;

public class Atoi {

    public static int myAtoi(String str) {
        int i=0, end;
        while (i < str.length()){
            char c = str.charAt(i);
            if (c >= '0' && c <= '9'){
                end = findLastDigit(str, i+1);
                return atoiHelper(str, i, end, true);
            }
            else if (c == '+' || c == '-'){
                boolean sign = (c == '+');
                end = findLastDigit(str, i+1);
                return atoiHelper(str, i+1, end, sign);
            }
            else if (c != ' '){
                return 0;
            }
            i++;
        }
        return 0;
    }

    private static int findLastDigit(String s, int start){
        int i = start;
        while (i < s.length()){
            if (s.charAt(i) < '0' || s.charAt(i) > '9'){
                break;
            }
            i++;
        }
        return i-1;
    }

    private static int atoiHelper(String s, int start, int end, boolean sign){
        long res = 0;
        int power = 0;
        while (start <= end && s.charAt(start) == '0'){
            start++;
        }
        for (int i=end; i>=start; i--){
            char c = s.charAt(i);
            if (c < '0' || c > '9'){
                break;
            }
            long base = (long) Math.pow(10, power++);
            int digit = c - '0';
            res += base * digit;
            if (res > Integer.MAX_VALUE || base > Integer.MAX_VALUE || ((!sign) && ((res * (-1)) <= (Integer.MIN_VALUE)))){
                return (sign) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
        }
        res = (!sign) ? res * (-1) : res;
        return (int) res;
    }

}
