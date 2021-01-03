package problems.data_structers.arrays_and_strings.max_sub_product;

public class Solution {

    public static int maxSubArrayProduct(int[] nums){
        int maxSubProduct = 1;
        int currMaxPositiveProd = 1, currMinNegativeProd = 1;
        for (int i=0; i<nums.length; i++){
            if (nums[i] == 0){
                currMaxPositiveProd = 1;
                currMinNegativeProd = 1;
            }
            else if (nums[i] > 0){
                currMaxPositiveProd *= nums[i];
                currMinNegativeProd = Math.min(1, currMinNegativeProd * nums[i]);
            }
            else{
                int temp = currMaxPositiveProd;
                currMaxPositiveProd = Math.max(1, currMinNegativeProd * nums[i]);
                currMinNegativeProd = temp * nums[i];
            }
            maxSubProduct = Math.max(maxSubProduct, currMaxPositiveProd);
        }
        return maxSubProduct;
    }

}
