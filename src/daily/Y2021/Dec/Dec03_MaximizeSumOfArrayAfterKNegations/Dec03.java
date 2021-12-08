package daily.Y2021.Dec.Dec03_MaximizeSumOfArrayAfterKNegations;

import util.PrintUtil;

public class Dec03 {
    private static final int[] s1 = { 4, 2, 3 };
    private static final int[] s2 = { 3, -1, 0, 2 };
    private static final int[] s3 = { 2, -3, -1, 5, -4 };

    public static void main(String[] args) {
        Solution solution = new Solution();
        PrintUtil.println(solution.largestSumAfterKNegations(s1, 1));
        PrintUtil.println(solution.largestSumAfterKNegations(s2, 3));
        PrintUtil.println(solution.largestSumAfterKNegations(s3, 2));
    }
}
