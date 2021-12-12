package hot100.No004_MedianOfTwoSortedArrays;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // TODO [4. 寻找两个正序数组的中位数](https://leetcode-cn.com/problems/median-of-two-sorted-arrays/)
        throw new NotImplementedException();
//        int low1 = 0, half1 = findCenter(nums1.length), high1 = nums1.length;
//        int low2 = 0, half2 = findCenter(nums2.length), high2 = nums2.length;
//
//        while (nums1[half1] > nums2[half2 + 1]) {
//            high1 = half1;
//            int judge = (low1 + half1) / 2;
//            half1 -= judge;
//
//            half2 += judge;
//        }
//        while (nums2[half2] > nums1[half1 + 1]) {
//
//        }
    }

    private int findCenter(int length) {
        if (length % 2 == 0) {
            return length / 2 - 1;
        } else {
            return length / 2;
        }
    }
}