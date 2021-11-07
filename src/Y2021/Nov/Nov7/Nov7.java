package Y2021.Nov.Nov7;

import util.PrintUtil;

public class Nov7 {
    private static final int[][] s1 = new int[][] {
            new int[] { 2, 2 }, new int[] { 3, 3 }
    };
    private static final int[][] s2 = new int[][] {
            new int[] { 2, 2 }, new int[] { 3, 3 }, new int[] { 3, 3 }, new int[] { 3, 3 }, new int[] { 2, 2 },
            new int[] { 3, 3 }, new int[] { 3, 3 }, new int[] { 3, 3 }, new int[] { 2, 2 }, new int[] { 3, 3 },
            new int[] { 3, 3 }, new int[] { 3, 3 }
    };
    private static final int[][] s3 = new int[0][2];

    public static void main(String[] args) {
        Solution solution = new Solution();
        PrintUtil.println(solution.maxCount(3, 3, s1));
        PrintUtil.println(solution.maxCount(3, 3, s2));
        PrintUtil.println(solution.maxCount(3, 3, s3));
    }
}
