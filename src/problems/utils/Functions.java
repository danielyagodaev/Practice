package problems.utils;

import java.util.ArrayList;
import java.util.List;

public class Functions {

    public static List<Integer> createListFromArray(int[] nums){
        List<Integer> res = new ArrayList<>();
        for (int num : nums){
           res.add(num);
        }
        return res;
    }

    public static List<List<Integer>> createListFrom2DArray(int[][] nums){
        List<List<Integer>> res = new ArrayList<>();
        for (int[] row : nums){
            List<Integer> rowAsList = createListFromArray(row);
            res.add(rowAsList);
        }
        return res;
    }
}
