package problems.data_structers.arrays_and_strings.permutation_sequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tester {

    @Test
    public void test1(){
        int n = 3;
        int k = 3;
        assertEquals(Solution.getPermutation(n,k), "213");
    }

    @Test
    public void test2(){
        int n = 4;
        int k = 9;
        assertEquals(Solution.getPermutation(n,k), "2314");
    }

    @Test
    public void test3(){
        int n = 3;
        int k = 1;
        assertEquals(Solution.getPermutation(n,k), "123");
    }
}
