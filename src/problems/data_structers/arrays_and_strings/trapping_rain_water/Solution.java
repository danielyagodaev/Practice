package problems.data_structers.arrays_and_strings.trapping_rain_water;

import java.util.ArrayList;

public class Solution {

    public static int trap(int[] height) {
        int res = 0;
        ArrayList<Integer> borders = new ArrayList<>();
        int n = 0;
        for (int i=0; i<height.length; i++){
            if (isBorder(height, i)){
                while (n >= 2){
                    int prevBorder = height[borders.get(n-1)];
                    int prevPrevBorder = height[borders.get(n-2)];
                    if (height[i]>=prevBorder && prevBorder<prevPrevBorder){
                        // if the previous border is between two higher borders, it should be removed
                        borders.remove(n-1);
                        n--;
                    }
                    else{
                        break;
                    }
                }
                borders.add(i);
                n++;
            }
        }
        while (n >= 2){
            int left = borders.remove(0);
            int right = borders.get(0);
            int min = Math.min(height[left], height[right]);
            for (int j=left+1; j<right; j++){
                res += Math.max(min-height[j],0);
            }
            n--;
        }
        return res;
    }

    private static boolean isBorder(int[] height, int i){
        int n = height.length;
        if (i == 0){
            return ((i+1 < n) && (height[i]>height[i+1]));
        }
        if (i == n-1){
            return ((i-1 >= 0) && (height[i]>height[i-1]));
        }
        return ((height[i]>height[i-1] && height[i]>=height[i+1]) ||
                (height[i]>=height[i-1] && height[i]>height[i+1]));
    }
}
