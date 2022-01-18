package daily.Y2022.Jan.Jan14_FindKPairsWithSmallestSums;

import util.PrintUtil;

public class Jan14 {
    private static final int[] s1_n1 = { 1, 7, 11 };
    private static final int[] s1_n2 = { 2, 4, 6 };
    private static final int s1_k = 3;

    private static final int[] s2_n1 = { 1, 1, 2 };
    private static final int[] s2_n2 = { 1, 2, 3 };
    private static final int s2_k = 2;

    private static final int[] s3_n1 = { 1, 2 };
    private static final int[] s3_n2 = { 3 };
    private static final int s3_k = 3;

    public static void main(String[] args) {
        Solution solution = new Solution();
        PrintUtil.println(solution.kSmallestPairs(s1_n1, s1_n2, s1_k));
        PrintUtil.println(solution.kSmallestPairs(s2_n1, s2_n2, s2_k));
        PrintUtil.println(solution.kSmallestPairs(s3_n1, s3_n2, s3_k));
    }
}
