package problems.find_median;

public class MedianTwoSortedArrays {

    public static double findMedian(int[] nums1, int[] nums2){
        if (nums1.length == 0){
            return findMedianInSingleArray(nums2);
        }
        else if (nums2.length == 0){
            return findMedianInSingleArray(nums1);
        }
        else{
            if (nums1.length > nums2.length){
                return findMedianHelper(nums2, nums1);
            }
            else{
                return findMedianHelper(nums1, nums2);
            }
        }
    }

    public static double findMedianHelper(int[] nums1, int[] nums2){
        int n1 = nums1.length, n2 = nums2.length;
        int l1 = 0, r1 = n1, mid1, mid2;
        do{
            mid1 = (l1 + r1) / 2;
            mid2 = ((n1 + n2 - 1) / 2) - mid1;
            if (nums1[mid1] == nums2[mid2]){
                return nums1[mid1];
            }
            else if (nums1[mid1] < nums2[mid2]){
                l1 = mid1;
            }
            else{
                r1 = mid1;
            }

        } while (!shouldStop(nums1, nums2, l1, r1, mid1, mid2));
        mid1 = (l1 + r1) / 2;
        mid2 = ((n1 + n2 - 1) / 2) - mid1;
        if (nums1[mid1] == nums2[mid2]){
            return nums1[mid1];
        }
        else{
            int leftMax, rightMin;
            if (nums1[mid1] > nums2[mid2]){
                leftMax = getMaxSafe(nums2[mid2], nums1, mid1-1);
                rightMin = getMinSafe(nums1[mid1], nums2, mid2+1);
            }
            else{
                leftMax = getMaxSafe(nums1[mid1], nums2, mid2-1);
                rightMin = getMinSafe(nums2[mid2], nums1, mid1+1);
            }
            if ((n1 + n2) % 2 == 0){
                return ((double) (leftMax + rightMin) / 2);
            }
            else{
                return leftMax;
            }
        }
    }

    public static int getMaxSafe(int val, int[] nums, int i){
        int res = val;
        if (i >= 0 && i < nums.length){
            res = Math.max(res, nums[i]);
        }
        return res;
    }

    public static int getMinSafe(int val, int[] nums, int i){
        int res = val;
        if (i >= 0 && i < nums.length){
            res = Math.min(res, nums[i]);
        }
        return res;
    }

    public static boolean shouldStop(int[] nums1, int[] nums2, int l1, int r1, int mid1, int mid2){
        if (l1 >= r1-1){
            return true;
        }
        int leftMax, rightMin;
        if (nums1[mid1] > nums2[mid2]){
            leftMax = getMaxSafe(nums2[mid2], nums1, mid1-1);
            rightMin = getMinSafe(nums1[mid1], nums2, mid2+1);
        }
        else{
            leftMax = getMaxSafe(nums1[mid1], nums2, mid2-1);
            rightMin = getMinSafe(nums2[mid2], nums1, mid1+1);
        }
        return leftMax <= rightMin;
    }

    public static double findMedianInSingleArray(int[] nums){
        int n = nums.length;
        if (n % 2 == 0){
            int left = nums[(n/2)-1];
            int right = nums[n/2];
            return ((double) (left + right) / 2);
        }
        else{
            return (double) nums[n/2];
        }
    }

}
