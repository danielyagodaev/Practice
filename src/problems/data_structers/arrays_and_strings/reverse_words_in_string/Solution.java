package problems.data_structers.arrays_and_strings.reverse_words_in_string;

public class Solution {

    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int i=s.length()-1, j;
        while (i >= 0){
            while (i>=0 && s.charAt(i) == ' '){
                i--;
            }
            if (i < 0){
                break;
            }
            j=i;
            while (i>=0 && s.charAt(i) != ' '){
                i--;
            }
            for (int k=i+1; k<=j; k++){
                sb.append(s.charAt(k));
            }
            sb.append(' ');
        }
        int n = sb.length();
        return sb.toString().substring(0, n-1);
    }

}
