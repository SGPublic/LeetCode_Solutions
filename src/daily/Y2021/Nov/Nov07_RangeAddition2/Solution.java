package daily.Y2021.Nov.Nov07_RangeAddition2;

class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        for (int[] move : ops) {
            m = Math.min(m, move[0]);
            n = Math.min(n, move[1]);
        }
        return m * n;
    }
}