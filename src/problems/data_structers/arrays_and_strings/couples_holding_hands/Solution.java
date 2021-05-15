package problems.data_structers.arrays_and_strings.couples_holding_hands;

public class Solution {

    public int minSwapsCouples(int[] row) {
        int res = 0;
        int n = row.length;
        for (int i=0; i<n; i+=2){
            if (!validCouple(row[i], row[i+1])){
                boolean isEven = row[i] % 2 == 0;
                for (int j=i+2; j<n; j+=2){
                    int tempIndex = -1;
                    if ((isEven && (row[j] - row[i] == 1)) || (!isEven && (row[i] - row[j] == 1))){
                        tempIndex = j;
                    }
                    else if ((isEven && (row[j+1] - row[i] == 1)) || (!isEven && (row[i] - row[j+1] == 1))){
                        tempIndex = j+1;
                    }
                    if (tempIndex != -1){
                        int temp = row[i+1];
                        row[i+1] = row[tempIndex];
                        row[tempIndex] = temp;
                        res++;
                        break;
                    }
                }
            }

        }
        return res;
    }

    private boolean validCouple(int a, int b){
        if (Math.abs(a - b) != 1){
            return false;
        }
        int even = a % 2 == 0 ? a : b;
        int odd = a % 2 == 1 ? a : b;
        return (even < odd);
    }
}
