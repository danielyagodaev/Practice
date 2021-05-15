package problems.data_structers.arrays_and_strings.similar_strings_groups;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tester {

    private final Solution _s;

    public Tester(){
        this._s = new Solution();
    }

    @Test
    public void test1(){
        String[] strs = {"tars","rats","arts","star"};
        assertEquals(2, this._s.numSimilarGroups(strs));
    }

    @Test
    public void test2(){
        String[] strs = {"omv","ovm"};
        assertEquals(1, this._s.numSimilarGroups(strs));
    }
}
