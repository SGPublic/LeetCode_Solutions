package daily.Y2021.Nov.Nov01_DistributeCandies;

import java.util.HashSet;
import java.util.Set;

/**
 * 常规思路
 */
class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> typeCount = new HashSet<>();
        for (int candy : candyType) {
            typeCount.add(candy);
        }
        return Math.min(typeCount.size(), candyType.length / 2);
    }
}