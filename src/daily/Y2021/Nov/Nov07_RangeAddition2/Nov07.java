package daily.Y2021.Nov.Nov07_RangeAddition2;

import util.PrintUtil;

public class Nov07 {
    private static final int[][] s1 = {
            { 2, 2 }, { 3, 3 }
    };
    private static final int[][] s2 = {
            { 2, 2 }, { 3, 3 }, { 3, 3 }, { 3, 3 }, { 2, 2 },
            { 3, 3 }, { 3, 3 }, { 3, 3 }, { 3, 3 }, { 3, 3 },
            { 3, 3 }, { 3, 3 }
    };
    private static final int[][] s3 = {};

    public static void main(String[] args) {
        Solution solution = new Solution();
        PrintUtil.println(solution.maxCount(3, 3, s1));
        PrintUtil.println(solution.maxCount(3, 3, s2));
        PrintUtil.println(solution.maxCount(3, 3, s3));
    }
}
