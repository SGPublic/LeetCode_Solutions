package daily.Y2021.Dec.Dec13_MaxIncreaseToKeepCitySkyline;

import util.PrintUtil;

public class Dec13 {
    private static final int[][] s1 = {
            { 3, 0, 8, 4 },
            { 2, 4, 5, 7 },
            { 9, 2, 6, 3 },
            { 0, 3, 1, 0 }
    };
    private static final int[][] s2 = {
            { 0, 0, 0 },
            { 0, 0, 0 },
            { 0, 0, 0 }
    };

    public static void main(String[] args) {
        Solution solution = new Solution();
        PrintUtil.println(solution.maxIncreaseKeepingSkyline(s1));
        PrintUtil.println(solution.maxIncreaseKeepingSkyline(s2));
    }
}
