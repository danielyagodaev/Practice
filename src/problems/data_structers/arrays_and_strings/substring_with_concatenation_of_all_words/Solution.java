package problems.data_structers.arrays_and_strings.substring_with_concatenation_of_all_words;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {

    public static List<Integer> findSubstring(String s, String[] words) {
        ArrayList<Integer> res = new ArrayList<>();
        int wordLength = words[0].length();
        int substringLength = wordLength * words.length;
        for (int i=0; i+substringLength<=s.length(); i++){
            String currentSubstring = s.substring(i, i+substringLength);
            if (isConcatenation(currentSubstring, words, wordLength)){
                res.add(i);
            }
        }
        return res;
    }

    private static boolean isConcatenation(String s, String[] words, int wordLength){
        HashMap<String, Integer> wordsToSearch = new HashMap<>();
        for (String word : words) {
            int count = 0;
            if (wordsToSearch.containsKey(word)) {
                count = wordsToSearch.get(word);
            }
            count++;
            wordsToSearch.put(word, count);
        }
        int p=0, n=s.length();
        while (p+wordLength <= n){
            String currentWord = s.substring(p, p+wordLength);
            if (wordsToSearch.containsKey(currentWord)){
                int count = wordsToSearch.get(currentWord);
                if (count == 1){
                    wordsToSearch.remove(currentWord);
                }
                else{
                    count--;
                    wordsToSearch.put(currentWord, count);
                }
                p += wordLength;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
