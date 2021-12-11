package daily.Y2021.Dec.Dec08_MaximumSumOf3NonOverlappingSubarrays;

class Solution {
    public int[] maxSumOfThreeSubarrays(int[] nums, int k) {
        long maxSum1 = 0, maxSum12 = 0, maxSum123 = 0;
        int maxSum1Index1 = 0, maxSum12Index1 = 0, maxSum12Index2 = 0;
        int[] ans = new int[3];
        long sum1 = 0, sum2 = 0, sum3 = 0;
        for (int i = 0; i < nums.length - k * 2; i++) {
            sum1 += nums[i];
            sum2 += nums[i + k];
            sum3 += nums[i + k * 2];
            if (i < k - 1) {
                continue;
            }
            if (maxSum1 < sum1) {
                maxSum1 = sum1;
                maxSum1Index1 = i - k + 1;
            }

            if (maxSum12 < maxSum1 + sum2) {
                maxSum12 = maxSum1 + sum2;
                maxSum12Index1 = maxSum1Index1;
                maxSum12Index2 = i + 1;
            }

            if (maxSum123 < maxSum12 + sum3) {
                maxSum123 = maxSum12 + sum3;
                ans[0] = maxSum12Index1;
                ans[1] = maxSum12Index2;
                ans[2] = i + k + 1;
            }

            sum1 -= nums[i - k + 1];
            sum2 -= nums[i + 1];
            sum3 -= nums[i + k + 1];
        }
        return ans;
    }
}