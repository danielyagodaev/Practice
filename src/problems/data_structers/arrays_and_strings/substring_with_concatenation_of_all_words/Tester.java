package problems.data_structers.arrays_and_strings.substring_with_concatenation_of_all_words;

import org.junit.jupiter.api.Test;
import problems.utils.Functions;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tester {

    private void runTest(String s, String[] words, int[] expected){
        List<Integer> expectedAsList = Functions.createListFromArray(expected);
        assertEquals(expectedAsList, Solution.findSubstring(s, words));
    }

    @Test
    public void test1(){
        String s = "barfoothefoobarman";
        String[] words = {"foo","bar"};
        int[] expected = {0,9};
        runTest(s, words, expected);
    }

    @Test
    public void test2(){
        String s = "wordgoodgoodgoodbestword";
        String[] words = {"word","good","best","word"};
        int[] expected = {};
        runTest(s, words, expected);
    }

    @Test
    public void test3(){
        String s = "barfoofoobarthefoobarman";
        String[] words = {"bar","foo","the"};
        int[] expected = {6,9,12};
        runTest(s, words, expected);
    }
}
