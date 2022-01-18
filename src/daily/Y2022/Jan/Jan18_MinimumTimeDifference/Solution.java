package daily.Y2022.Jan.Jan18_MinimumTimeDifference;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int findMinDifference(List<String> timePoints) {
        Queue<Integer> queue = new PriorityQueue<>();
        for (String timePoint : timePoints) {
            int m = getMinutes(timePoint);
            queue.add(m);
            queue.add(m + 1440);
        }
        int ans = Integer.MAX_VALUE;
        while (queue.size() > 1) {
            int current = queue.poll();
            int next = queue.peek();
            ans = Math.min(next - current, ans);
        }
        return ans;
    }

    private int getMinutes(String t) {
        int m = 0;
        m += ((t.charAt(0) - '0') * 10 + (t.charAt(1))) * 60;
        m += (t.charAt(3) - '0') * 10  + t.charAt(4) - '0';
        return m;
    }
}