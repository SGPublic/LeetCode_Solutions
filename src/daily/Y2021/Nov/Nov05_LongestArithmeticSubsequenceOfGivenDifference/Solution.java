package daily.Y2021.Nov.Nov05_LongestArithmeticSubsequenceOfGivenDifference;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int longestSubsequence(int[] arr, int difference) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer index : arr) {
            if (difference != 0 && map.containsKey(index)
                    && !map.containsKey(index - difference)) {
                continue;
            }
            int length = map.getOrDefault(index - difference, 0);
            map.remove(index - difference);
            map.put(index, length + 1);
        }

        int ans = 0;
        for (int index : map.values()) {
            if (index > ans) {
                ans = index;
            }
        }
        return ans;
    }
}