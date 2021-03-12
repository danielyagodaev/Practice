package problems.data_structers.arrays_and_strings.compare_version_numbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tester {

    @Test
    public void test1(){
        String version1 = "1.01";
        String version2 = "1.001";
        assertEquals(0, Solution.compareVersion(version1, version2));
    }

    @Test
    public void test2(){
        String version1 = "1.0";
        String version2 = "1.0.0";
        assertEquals(0, Solution.compareVersion(version1, version2));
    }

    @Test
    public void test3(){
        String version1 = "0.1";
        String version2 = "1.1";
        assertEquals(-1, Solution.compareVersion(version1, version2));
    }

    @Test
    public void test4(){
        String version1 = "1.0.1";
        String version2 = "1";
        assertEquals(1, Solution.compareVersion(version1, version2));
    }

    @Test
    public void test5(){
        String version1 = "7.5.2.4";
        String version2 = "7.5.3";
        assertEquals(-1, Solution.compareVersion(version1, version2));
    }
}
