package problems.restore_ip_addresses;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static List<String> restoreIpAddresses(String s) {
        ArrayList<String> res = new ArrayList<String>();
        int n = s.length();
        if (n < 4 || n > 12){
            return res;
        }
        restoreIpAddressesRec(s, 0, "", 0, res);
        return res;
    }

    private static void restoreIpAddressesRec(String s, int i, String acc, int count, List<String> res){
        if (i >= s.length()){
            if (count == 4){
                res.add(acc);
            }
        }
        else if (count < 4){
            for (int k=1; k<=3 && (i+k)<=s.length(); k++){
                String temp = s.substring(i, i+k);
                if (isValidInteger(temp)){
                    StringBuilder sb = new StringBuilder(acc);
                    if (count > 0){
                        sb.append(".");
                    }
                    sb.append(temp);
                    restoreIpAddressesRec(s, i+k, sb.toString(), count+1, res);
                }
            }
        }
    }

    private static boolean isValidInteger(String num){
        int n = num.length();
        if (n < 1 || n > 3 || (n > 1 && num.charAt(0) == '0')){
            return false;
        }
        int val = Integer.parseInt(num);
        return (val >= 0 && val <= 255);
    }
}
