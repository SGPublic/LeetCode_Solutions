package daily.Y2021.Nov.Nov10_TeemoAttacking;

class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int ans = 0;
        for (int i = 1; i < timeSeries.length; i++) {
            ans += Math.min(duration, timeSeries[i] - timeSeries[i - 1]);
        }
        return ans + duration;
    }
}