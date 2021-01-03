package problems.math.pow;

public class Solution {

    private static final int BITS_COUNT = 32;

    public static double myPow(double x, int n) {
        if (n == 0){
            return 1;
        }
        else if (x == 0){
            return 0;
        }
        double[] memory = new double[BITS_COUNT];
        for (int i=0; i<BITS_COUNT; i++){
            memory[i] = 0;
        }
        double res = 1;
        long fixedPower = (long) Math.abs(n);
        for (int i=0; i<BITS_COUNT; i++){
            long temp = 1;
            temp <<= i;
            if ((temp & fixedPower) > 0){
                res *= myPowRec(x, i, memory);
            }
        }
        if (n < 0){
            res = 1 / res;
        }
        return res;
    }

    private static double myPowRec(double x, int i, double[] memory){
        if (memory[i] != 0){
            return memory[i];
        }
        else{
            if (i == 0){
                memory[i] = x;
            }
            else{
                double temp = myPowRec(x, i-1, memory);
                memory[i] = temp * temp;
            }
            return memory[i];
        }
    }
}
