package problems.data_structers.arrays_and_strings.single_number_ii;

public class Solution {

    public int singleNumber(int[] nums) {
        int[] bitsCount = new int[32];
        for (int num : nums){
            for (int i=31; i>=0; i--){
                if ((num & (1 << (32-i-1))) != 0){
                    bitsCount[i] += 1;
                }
            }
        }
        int res = 0;
        for (int i=31; i>=0; i--){
            if ((bitsCount[i] % 3) != 0){
                res |= (1 << (32-i-1));
            }
        }
        return res;
    }
}
