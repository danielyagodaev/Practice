package problems.candies;

public class Solution {

    public static int candy(int[] ratings) {
        int[] candies = new int[ratings.length];
        int res = 0;
        for (int i=0; i<ratings.length; i++){
            res += getCandyCount(ratings, i, candies);
        }
        return res;
    }

    private static int getCandyCount(int[] ratings, int index, int[] candies){
        if (candies[index] == 0){
            int leftLimit = 0, rightLimit = 0;
            if (index > 0 && ratings[index] > ratings[index-1]){
                leftLimit = getCandyCount(ratings, index-1, candies);
            }
            if (index < ratings.length-1 && ratings[index] > ratings[index+1]){
                rightLimit = getCandyCount(ratings, index+1, candies);
            }
            candies[index] = Math.max(leftLimit, rightLimit) + 1;
        }
        return candies[index];
    }
}
