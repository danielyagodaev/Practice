package problems.data_structers.arrays_and_strings.minimum_window_substring;

import java.util.HashMap;

public class Solution {

    public static String minWindow(String s, String t) {
        int n1=s.length(), n2=t.length();
        if (n1 == 0 || n2 == 0){
            return "";
        }
        HashMap<Character, Integer> countsT = new HashMap<>();
        for (int i=0; i<n2; i++){
            char c = t.charAt(i);
            int count = countsT.getOrDefault(c, 0) + 1;
            countsT.put(c, count);
        }
        HashMap<Character, Integer> dynamicCountsS = new HashMap<>();
        int start=0, end=0, completedChars=0;
        int bestStart=-1, bestEnd=n1-1;
        while (end<n1 && (n1-start)>=n2){
            if (completedChars < countsT.size()){
                // Increasing end since window is not covering @t yet
                char c = s.charAt(end);
                int countsAtS = dynamicCountsS.getOrDefault(c, 0) + 1;
                dynamicCountsS.put(c, countsAtS);
                int countsAtT = countsT.getOrDefault(c, 0);
                if (countsAtS == countsAtT){
                    completedChars++;
                    if (completedChars == countsT.size()){
                        if ((bestEnd-bestStart)>(end-start)){
                            bestStart = start;
                            bestEnd = end;
                        }
                        continue;
                    }
                }
                end++;
            }
            else{
                // Increasing start - try to reduce the window
                char c = s.charAt(start++);
                int countsAtS = dynamicCountsS.getOrDefault(c, 0) - 1;
                dynamicCountsS.put(c, countsAtS);
                int countsAtT = countsT.getOrDefault(c, 0);
                if (countsAtS >= countsAtT){
                    if ((bestEnd-bestStart)>(end-start)){
                        bestStart = start;
                        bestEnd = end;
                    }
                }
                else{
                    // Can't reduce the window anymore - go back to increasing it
                    completedChars--;
                    end++;
                }
            }
        }
        if (bestStart == -1){
            return "";
        }
        else{
            return s.substring(bestStart, bestEnd+1);
        }
    }
}
