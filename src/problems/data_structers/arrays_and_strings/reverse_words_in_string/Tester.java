package problems.data_structers.arrays_and_strings.reverse_words_in_string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tester {

    @Test
    public void test1(){
        String s = "  hello world  ";
        assertEquals("world hello", Solution.reverseWords(s));
    }

    @Test
    public void test2(){
        String s = "a good   example";
        assertEquals("example good a", Solution.reverseWords(s));
    }

    @Test
    public void test3(){
        String s = "the sky is blue";
        assertEquals("blue is sky the", Solution.reverseWords(s));
    }

    @Test
    public void test4(){
        String s = "  Bob    Loves  Alice   ";
        assertEquals("Alice Loves Bob", Solution.reverseWords(s));
    }

    @Test
    public void test5(){
        String s = "Alice does not even like bob";
        assertEquals("bob like even not does Alice", Solution.reverseWords(s));
    }
}
