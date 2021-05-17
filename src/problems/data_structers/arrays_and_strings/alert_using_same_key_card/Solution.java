package problems.data_structers.arrays_and_strings.alert_using_same_key_card;

import java.util.*;

public class Solution {

    public List<String> alertNames(String[] keyName, String[] keyTime) {
        int n = keyName.length;
        HashMap<String, List<String>> workersTimes = new HashMap<>();
        for (int i=0; i<n; i++){
            String currWorkerName = keyName[i];
            List<String> currWorkerTimes = workersTimes.computeIfAbsent(currWorkerName, k -> new ArrayList<>());
            currWorkerTimes.add(keyTime[i]);
        }
        List<String> workerNames = new ArrayList<>();
        for (Map.Entry<String, List<String>> worker : workersTimes.entrySet()){
            String[] times = worker.getValue().toArray(new String[0]);
            Arrays.sort(times);
            int k = times.length;
            for (int j=0; j<k-2; j++){
                if (sameHourPeriod(times[j], times[j+1]) && sameHourPeriod(times[j], times[j+2])){
                    workerNames.add(worker.getKey());
                    break;
                }
            }
        }
        String[] names = workerNames.toArray(new String[0]);
        Arrays.sort(names);
        return Arrays.asList(names);
    }

    private boolean sameHourPeriod(String time1, String time2){
        int time1Hours = Integer.parseInt(time1.substring(0,2));
        int time2Hours = Integer.parseInt(time2.substring(0,2));
        int hoursDiff = time2Hours - time1Hours;
        if (hoursDiff == 0){
            return true;
        }
        else if (hoursDiff > 1){
            return false;
        }
        else{
            int time1Minutes = Integer.parseInt(time1.substring(3));
            int time2Minutes = Integer.parseInt(time2.substring(3));
            return (time1Minutes >= time2Minutes);
        }
    }
}
