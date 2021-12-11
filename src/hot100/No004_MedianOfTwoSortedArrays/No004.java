package hot100.No004_MedianOfTwoSortedArrays;

import util.PrintUtil;

public class No004 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        PrintUtil.println(solution.findMedianSortedArrays(new int[]{1, 3}, new int[]{2}));
        PrintUtil.println(solution.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}));
        PrintUtil.println(solution.findMedianSortedArrays(new int[]{}, new int[]{1}));
        PrintUtil.println(solution.findMedianSortedArrays(new int[]{2}, new int[]{}));
    }
}
