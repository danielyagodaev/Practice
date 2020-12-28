package problems.insert_intervals;

public class Solution {

    public static int[][] insert(int[][] intervals, int[] newInterval) {
        int prevIndex, nextIndex;
        int i=0;
        while (i<intervals.length && newInterval[0] > intervals[i][1]){
            i++;
        }
        prevIndex = i;
        while (i<intervals.length && intervalsAreOverLapping(newInterval, intervals[i])){
            newInterval = mergeIntervals(newInterval, intervals[i++]);
        }
        nextIndex = i;
        int intervalsLength = prevIndex + (intervals.length - nextIndex) + 1;
        int[][] res = new int[intervalsLength][2];
        i=0;
        while (i < prevIndex){
            res[i][0] = intervals[i][0];
            res[i][1] = intervals[i][1];
            i++;
        }
        res[i][0] = newInterval[0];
        res[i][1] = newInterval[1];
        i++;
        for (int j=nextIndex; j<intervals.length; j++){
            res[i][0] = intervals[j][0];
            res[i][1] = intervals[j][1];
            i++;
        }
        return res;
    }

    private static boolean intervalsAreOverLapping(int[] interval1, int[] interval2){
        return interval2[0] <= interval1[1] && interval1[0] <= interval2[1];
    }

    private static int[] mergeIntervals(int[] interval1, int[] interval2){
        int[] mergedInterval = new int[2];
        mergedInterval[0] = Math.min(interval1[0], interval2[0]);
        mergedInterval[1] = Math.max(interval1[1], interval2[1]);
        return mergedInterval;
    }
}
