package problems.string.compare_version_numbers;

public class Solution {

    public static int compareVersion(String version1, String version2) {
        String[] revisions1 = version1.split("\\.");
        String[] revisions2 = version2.split("\\.");
        int n1 = revisions1.length;
        int n2 = revisions2.length;
        int n = Math.min(n1, n2);
        int i;
        long rev1, rev2;
        for (i=0; i<n; i++){
            rev1 = Long.parseLong(revisions1[i]);
            rev2 = Long.parseLong(revisions2[i]);
            if (rev1 < rev2){
                return -1;
            }
            else if (rev2 < rev1){
                return 1;
            }
        }
        while (i < n1){
            rev1 = Long.parseLong(revisions1[i]);
            if (rev1 != 0){
                return 1;
            }
            i++;
        }
        while (i < n2){
            rev2 = Long.parseLong(revisions2[i]);
            if (rev2 != 0){
                return -1;
            }
            i++;
        }
        return 0;
    }
}
