package problems.recursion_and_dynamic_programming.dungeon_game;

public class Solution {

    public static int calculateMinimumHP(int[][] dungeon) {
        if (dungeon.length == 0 || dungeon[0].length == 0){
            return 1;
        }
        int n=dungeon.length, m=dungeon[0].length;
        int[][] helper = new int[n][m];
        helper[n-1][m-1] = Math.abs(Math.min(dungeon[n-1][m-1],0))+1;
        for (int i=n-1; i>=0; i--){
            for (int j=m-1; j>=0; j--){
                if (i == n-1 && j == m-1){
                    continue;
                }
                int min;
                if (i == n-1){
                    min = helper[i][j+1];
                }
                else if (j == m-1){
                    min = helper[i+1][j];
                }
                else{
                    min = Math.min(helper[i+1][j],helper[i][j+1]);
                }
                if (dungeon[i][j] < 0){
                    helper[i][j] = min + Math.abs(dungeon[i][j]);
                }
                else{
                    helper[i][j] = Math.max(min-dungeon[i][j],1);
                }
            }
        }
        return helper[0][0];
    }
}
