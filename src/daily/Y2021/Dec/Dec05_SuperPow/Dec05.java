package daily.Y2021.Dec.Dec05_SuperPow;

import util.PrintUtil;

public class Dec05 {
    private static final int[] s1 = { 3 };
    private static final int[] s2 = { 1, 0 };
    private static final int[] s3 = { 4, 3, 3, 8, 5, 2 };
    private static final int[] s4 = { 2, 0, 0 };

    public static void main(String[] args) {
        Solution solution = new Solution();
        PrintUtil.println(solution.superPow(2, s1));
        PrintUtil.println(solution.superPow(2, s2));
        PrintUtil.println(solution.superPow(1, s3));
        PrintUtil.println(solution.superPow(2147483647, s4));
    }
}
