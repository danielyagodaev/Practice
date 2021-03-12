package problems.data_structers.arrays_and_strings.maximum_product_subarray;

public class Solution {

    public static int maxProduct(int[] nums){
        int maxSubProduct = 1;
        int currMaxPositiveProd = 1, currMinNegativeProd = 1;
        for (int num : nums) {
            if (num == 0) {
                currMaxPositiveProd = 1;
                currMinNegativeProd = 1;
            } else if (num > 0) {
                currMaxPositiveProd *= num;
                currMinNegativeProd = Math.min(1, currMinNegativeProd * num);
            } else {
                int temp = currMaxPositiveProd;
                currMaxPositiveProd = Math.max(1, currMinNegativeProd * num);
                currMinNegativeProd = temp * num;
            }
            maxSubProduct = Math.max(maxSubProduct, currMaxPositiveProd);
        }
        return maxSubProduct;
    }

}
