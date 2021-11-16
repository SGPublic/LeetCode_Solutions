package Y2021.Nov.Nov16;

import util.PrintUtil;

public class Nov16 {
    private static final int[][] s1 = new int[][] {
            new int[] { 1, 1, 3, 3 }, new int[] { 3, 1, 4, 2 }, new int[] { 3, 2, 4, 4 },
            new int[] { 1, 3, 2, 4 }, new int[] { 2, 3, 3, 4 }
    };
    private static final int[][] s2 = new int[][] {
            new int[] { 1, 1, 2, 3 }, new int[] { 1, 3, 2, 4 },
            new int[] { 3, 1, 4, 2 }, new int[] { 3, 2, 4, 4 }
    };
    private static final int[][] s3 = new int[][] {
            new int[] { 1, 1, 3, 3 }, new int[] { 3, 1, 4, 2 },
            new int[] { 1, 3, 2, 4 }, new int[] { 3, 2, 4, 4 }
    };
    private static final int[][] s4 = new int[][] {
            new int[] { 1, 1, 3, 3 }, new int[] { 3, 1, 4, 2 },
            new int[] { 1, 3, 2, 4 }, new int[] { 2, 2, 4, 4 }
    };
    private static final int[][] s5 = new int[][] {
            new int[] { 0, 0, 1, 1 }, new int[] { 0, 1, 3, 2 }, new int[] { 1, 0, 2, 2 }
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
