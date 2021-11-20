package Y2021.Nov.Nov20;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int ans = 0;
        for (int integer : map.keySet()) {
            if (map.containsKey(integer + 1)) {
                ans = Math.max(ans, map.get(integer) + map.get(integer + 1));
            }
        }
        return ans;
    }
}