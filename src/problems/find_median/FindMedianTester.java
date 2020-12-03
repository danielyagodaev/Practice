package problems.find_median;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindMedianTester {

    private static int[] mergeAndSort(int[] nums1, int[] nums2){
        int[] merged = new int[nums1.length + nums2.length];
        int i=0,j=0,k=0;
        while (i<nums1.length && j<nums2.length){
            if (nums1[i] < nums2[j]){
                merged[k++] = nums1[i++];
            }
            else{
                merged[k++] = nums2[j++];
            }
        }
        while (i<nums1.length){
            merged[k++] = nums1[i++];
        }
        while (j<nums2.length){
            merged[k++] = nums2[j++];
        }
        return merged;
    }

    private static double findMedianTest(int[] nums1, int[] nums2){
        int[] merged = mergeAndSort(nums1, nums2);
        int n = merged.length;
        if (n % 2 == 0){
            int left = merged[(n/2)-1];
            int right = merged[(n/2)];
            return ((double) (left + right) / 2);
        }
        else{
            return ((double) merged[n/2]);
        }
    }

    @Test
    public void test1(){
        int[] nums1 = {1,2};
        int[] nums2 = {3,4,5};
        double median = findMedianTest(nums1, nums2);
        assertEquals(MedianTwoSortedArrays.findMedian(nums1, nums2), median);
    }

    @Test
    public void test2(){
        int[] nums1 = {4,5};
        int[] nums2 = {1,2,3};
        double median = findMedianTest(nums1, nums2);
        assertEquals(MedianTwoSortedArrays.findMedian(nums1, nums2), median);
    }

    @Test
    public void test3(){
        int[] nums1 = {1};
        int[] nums2 = {2,3,4};
        double median = findMedianTest(nums1, nums2);
        assertEquals(MedianTwoSortedArrays.findMedian(nums1, nums2), median);
    }

    @Test
    public void test4(){
        int[] nums1 = {9};
        int[] nums2 = {2,3,4};
        double median = findMedianTest(nums1, nums2);
        assertEquals(MedianTwoSortedArrays.findMedian(nums1, nums2), median);
    }

    @Test
    public void test5(){
        int[] nums1 = {1,3,5,7,9};
        int[] nums2 = {2,4,6,8,10};
        double median = findMedianTest(nums1, nums2);
        assertEquals(MedianTwoSortedArrays.findMedian(nums1, nums2), median);
    }

    @Test
    public void test6(){
        int[] nums1 = {1,3,5,7,9,11};
        int[] nums2 = {2,4,6,8,10};
        double median = findMedianTest(nums1, nums2);
        assertEquals(MedianTwoSortedArrays.findMedian(nums1, nums2), median);
    }

    @Test
    public void test7(){
        int[] nums1 = {1,3,10,20};
        int[] nums2 = {2,4,5,6,7,8,9,11,12,13,14,15,16,17,18,19};
        double median = findMedianTest(nums1, nums2);
        assertEquals(MedianTwoSortedArrays.findMedian(nums1, nums2), median);
    }


}
