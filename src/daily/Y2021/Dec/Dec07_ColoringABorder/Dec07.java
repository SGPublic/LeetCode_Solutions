package daily.Y2021.Dec.Dec07_ColoringABorder;

import util.PrintUtil;

public class Dec07 {
    private static final int[][] s1 = {
            { 1, 1 }, { 1, 2 }
    };
    private static final int[][] s2 = {
            { 1, 2, 2 }, { 2, 3, 2 }
    };
    private static final int[][] s3 = {
            { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 }
    };
    private static final int[][] s4 = {
            {2, 1, 3, 2, 1, 1, 2},
            {1, 2, 3, 1, 2, 1, 2},
            {1, 2, 1, 2, 2, 2, 2},
            {2, 1, 2, 2, 2, 2, 2},
            {2, 3, 3, 3, 2, 1, 2}
    };

    public static void main(String[] args) {
        Solution solution = new Solution();
        PrintUtil.println(solution.colorBorder(s1, 0, 0, 3));
        PrintUtil.println(solution.colorBorder(s2, 0, 1, 3));
        PrintUtil.println(solution.colorBorder(s3, 1, 1, 2));
        PrintUtil.println(solution.colorBorder(s4, 4, 4, 3));
    }
}
