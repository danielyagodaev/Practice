package problems.max_sub_product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MaxSubArrayProduct {

    public static int maxSubArrayProductRec(int[] nums){
        List<List<Integer>> withoutZeros = splitZeros(nums);
        int maxProduct = 1;
        if (withoutZeros.size() > 0){
            for (List<Integer> withoutZero : withoutZeros) {
                maxProduct = Math.max(maxProduct, findMaxProductWithoutZeros(withoutZero));
            }
        }
        return maxProduct;
    }

    private static List<List<Integer>> splitZeros(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = null;
        for (int i=0; i<nums.length; i++){
            if (nums[i] == 0 && curr != null){
                res.add(curr);
                curr = null;
            }
            else if (nums[i] != 0){
                if (curr == null){
                    curr = new ArrayList<>();
                }
                curr.add(nums[i]);
            }
        }
        if (curr != null){
            res.add(curr);
        }
        return res;
    }

    private static int findMaxProductWithoutZeros(List<Integer> lst){
        int negativeNumbersCount = countNegativeNumbers(lst);
        if (negativeNumbersCount % 2 == 0){
            return multiplyAll(lst);
        }
        else{
            int maxProduct = 1;
            int negativeNumberLocation = 0;
            for (int i=0; i<lst.size(); i++){
                if (lst.get(i) < 0 && (++negativeNumberLocation == 1 || negativeNumberLocation == negativeNumbersCount)) {
                    List<Integer> leftPartition = lst.subList(0, i);
                    List<Integer> rightPartition = lst.subList(Math.min(i+1, lst.size()-1), lst.size());
                    int leftPartitionProduct = multiplyAll(leftPartition);
                    int rightPartitionProduct = multiplyAll(rightPartition);
                    maxProduct = Math.max(maxProduct, Math.max(leftPartitionProduct, rightPartitionProduct));
                }
            }
            return maxProduct;
        }
    }

    private static int countNegativeNumbers(List<Integer> lst){
        List<Integer> negativeNumbers = lst.stream().filter((a) -> a<0).collect(Collectors.toList());
        return negativeNumbers.size();
    }

    private static int multiplyAll(List<Integer> lst){
        return lst.stream().reduce(1, (a,b) -> a*b);
    }
}
