package daily.Y2022.Mar.Mar06_FindGoodDaysToRobTheBank;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> goodDaysToRobBank(int[] security, int time) {
        final int[] dp1 = new int[security.length];
        final int[] dp2 = new int[security.length];

        for (int i = 1; i < security.length; i++) {
            if (security[i] <= security[i - 1]) dp1[i] += dp1[i - 1] + 1;
            if (security[security.length - i - 1] <= security[security.length - i])
                dp2[security.length - i - 1] += dp2[security.length - i] + 1;
        }

        final ArrayList<Integer> result = new ArrayList<>();
        for (int i = time; i < security.length - time; i++) {
            if (dp1[i] >= time && dp2[i] >= time) result.add(i);
        }
        return result;
    }
}