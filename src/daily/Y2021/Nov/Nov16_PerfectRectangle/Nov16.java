package daily.Y2021.Nov.Nov16_PerfectRectangle;

import util.PrintUtil;

public class Nov16 {
    private static final int[][] s1 = {
            { 1, 1, 3, 3 }, { 3, 1, 4, 2 }, { 3, 2, 4, 4 },
            { 1, 3, 2, 4 }, { 2, 3, 3, 4 }
    };
    private static final int[][] s2 = {
            { 1, 1, 2, 3 }, { 1, 3, 2, 4 },
            { 3, 1, 4, 2 }, { 3, 2, 4, 4 }
    };
    private static final int[][] s3 = {
            { 1, 1, 3, 3 }, { 3, 1, 4, 2 },
            { 1, 3, 2, 4 }, { 3, 2, 4, 4 }
    };
    private static final int[][] s4 = {
            { 1, 1, 3, 3 }, { 3, 1, 4, 2 },
            { 1, 3, 2, 4 }, { 2, 2, 4, 4 }
    };
    private static final int[][] s5 = {
            { 0, 0, 1, 1 }, { 0, 1, 3, 2 }, { 1, 0, 2, 2 }
    };

    public static void main(String[] args) {
        Solution solution = new Solution();
        PrintUtil.println(solution.isRectangleCover(s1));
        PrintUtil.println(solution.isRectangleCover(s2));
        PrintUtil.println(solution.isRectangleCover(s3));
        PrintUtil.println(solution.isRectangleCover(s4));
        PrintUtil.println(solution.isRectangleCover(s5));
    }
}
