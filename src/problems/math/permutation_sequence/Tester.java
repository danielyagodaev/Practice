package problems.math.permutation_sequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tester {

    @Test
    public void test1(){
        int n = 3;
        int k = 3;
        assertEquals("213", Solution.getPermutation(n,k));
    }

    @Test
    public void test2(){
        int n = 4;
        int k = 9;
        assertEquals("2314", Solution.getPermutation(n,k));
    }

    @Test
    public void test3(){
        int n = 3;
        int k = 1;
        assertEquals("123", Solution.getPermutation(n,k));
    }
}
