package daily.Y2021.Dec.Dec13_MaxIncreaseToKeepCitySkyline;

class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n = grid.length;

        int[] maxRow = new int[n];
        int[] maxColumn = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                maxRow[i] = Math.max(grid[i][j], maxRow[i]);
                maxColumn[j] = Math.max(grid[i][j], maxColumn[j]);
            }
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int max = Math.min(maxColumn[j], maxRow[i]);
                ans += Math.max(0, max - grid[i][j]);
            }
        }

        return ans;
    }
}