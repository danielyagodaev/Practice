package problems.math.pow;

import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tester {

    private static double getFixedResult(double x, int n){
        DecimalFormat df = new DecimalFormat("#.#####");
        double res = Solution.myPow(x, n);
        return Double.parseDouble(df.format(res));
    }

    @Test
    public void test1(){
        double res = getFixedResult(2.00000, 10);
        assertEquals(1024.00000, res);
    }

    @Test
    public void test2(){
        double res = getFixedResult(2.10000, 3);
        assertEquals(9.26100, res);
    }

    @Test
    public void test3(){
        double res = getFixedResult(2.00000, -2);
        assertEquals(0.25000, res);
    }
}
