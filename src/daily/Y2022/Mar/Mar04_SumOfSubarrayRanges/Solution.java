package daily.Y2022.Mar.Mar04_SumOfSubarrayRanges;

public class Solution {
    public long subArrayRanges(int[] nums) {
        long result = 0;
        for (int i = 0; i < nums.length; i++) {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] < min) min = nums[j];
                if (nums[j] > max) max = nums[j];
                result += max - min;
            }
        }
        return result;
    }
}
