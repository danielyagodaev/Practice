package problems.general.reverse_words_in_string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tester {

    @Test
    public void test1(){
        String s = "  hello world  ";
        assertEquals(Solution.reverseWords(s), "world hello");
    }

    @Test
    public void test2(){
        String s = "a good   example";
        assertEquals(Solution.reverseWords(s), "example good a");
    }

    @Test
    public void test3(){
        String s = "the sky is blue";
        assertEquals(Solution.reverseWords(s), "blue is sky the");
    }

    @Test
    public void test4(){
        String s = "  Bob    Loves  Alice   ";
        assertEquals(Solution.reverseWords(s), "Alice Loves Bob");
    }

    @Test
    public void test5(){
        String s = "Alice does not even like bob";
        assertEquals(Solution.reverseWords(s), "bob like even not does Alice");
    }
}
