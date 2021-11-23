package daily.Y2021.Nov.Nov22_ShuffleAnArray;

import java.util.Random;

class Solution {
    private final int[] origin;

    public Solution(int[] nums) {
        this.origin = nums;
    }

    public int[] reset() {
        return origin;
    }

    public int[] shuffle() {
        int[] result = origin.clone();
        Random random = new Random();
        for (int i = 0; i < result.length; i++) {
            int temp = result[i];
            int target = random.nextInt(result.length);
            result[i] = result[target];
            result[target] = temp;
        }
        return result;
    }
}

/*
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */