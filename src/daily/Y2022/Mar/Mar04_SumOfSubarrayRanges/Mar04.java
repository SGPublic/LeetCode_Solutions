package daily.Y2022.Mar.Mar04_SumOfSubarrayRanges;

import util.PrintUtil;

public class Mar04 {
    private static final int[] s1 = { 1, 2, 3 };
    private static final int[] s2 = { 1, 3, 3 };
    private static final int[] s3 = { 4, -2, -3, 4, 1 };

    public static void main(String[] args) {
        Solution solution = new Solution();
        PrintUtil.println(solution.subArrayRanges(s1));
        PrintUtil.println(solution.subArrayRanges(s2));
        PrintUtil.println(solution.subArrayRanges(s3));
    }
}
