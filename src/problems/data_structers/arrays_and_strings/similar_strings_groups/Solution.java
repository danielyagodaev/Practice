package problems.data_structers.arrays_and_strings.similar_strings_groups;

import java.util.*;

public class Solution {

    public int numSimilarGroups(String[] strs) {
        int n = strs.length;
        HashMap<String, Integer> map = new HashMap<>();
        for (String str : strs) {
            map.put(str, null);
        }
        for (int i=0; i<n; i++){
            List<String> similarWords = new ArrayList<>();
            similarWords.add(strs[i]);
            while (!similarWords.isEmpty()){
                String curr = similarWords.remove(0);
                if (map.get(curr) == null){
                    Integer group = i;
                    for (int j=0; j<n; j++){
                        String temp = strs[j];
                        if (j != i && wordsAreSimilar(curr, temp)){
                            if (map.get(temp) == null){
                                similarWords.add(temp);
                            }
                        }
                    }
                    map.put(curr, group);
                }
            }
        }
        HashSet<Integer> allGroups = new HashSet<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()){
            allGroups.add(entry.getValue());
        }
        return allGroups.size();
    }

    private boolean wordsAreSimilar(String s1, String s2){
        if (s1.compareTo(s2) == 0){
            return true;
        }
        int firstIndex = -1, secondIndex = -1;
        for (int i=0; i<s1.length(); i++){
            if (s1.charAt(i) != s2.charAt(i)){
                if (firstIndex == -1){
                    firstIndex = i;
                }
                else if (secondIndex == -1){
                    secondIndex = i;
                }
                else{
                    return false;
                }
            }
        }
        if (firstIndex != -1 && secondIndex != -1){
            return s1.charAt(firstIndex) == s2.charAt(secondIndex) &&
                    s1.charAt(secondIndex) == s2.charAt(firstIndex);
        }
        return false;
    }
}
