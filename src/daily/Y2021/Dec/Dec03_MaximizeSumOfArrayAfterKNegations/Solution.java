package daily.Y2021.Dec.Dec03_MaximizeSumOfArrayAfterKNegations;

import java.util.PriorityQueue;

class Solution {
    @SuppressWarnings("ConstantConditions")
    public int largestSumAfterKNegations(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int num : nums) {
            queue.add(num);
        }
        while (k > 0) {
            if (queue.peek() > 0) {
                k %= 2;
                continue;
            }
            k--;
            queue.add(-queue.poll());
        }
        int ans = 0;
        while (!queue.isEmpty()) {
            ans += queue.poll();
        }
        return ans;
    }
}
