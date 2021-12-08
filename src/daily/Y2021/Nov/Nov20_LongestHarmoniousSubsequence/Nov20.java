package daily.Y2021.Nov.Nov20_LongestHarmoniousSubsequence;

import util.PrintUtil;

public class Nov20 {
    private static final int[] s1 = { 1, 3, 2, 2, 5, 2, 3, 7 };
    private static final int[] s2 = { 1, 2, 3, 4 };
    private static final int[] s3 = { 1, 1, 1, 1 };

    public static void main(String[] args) {
        Solution solution = new Solution();
        PrintUtil.println(solution.findLHS(s1));
        PrintUtil.println(solution.findLHS(s2));
        PrintUtil.println(solution.findLHS(s3));
    }
}
