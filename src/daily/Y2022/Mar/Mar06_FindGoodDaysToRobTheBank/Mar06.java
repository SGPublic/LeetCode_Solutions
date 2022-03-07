package daily.Y2022.Mar.Mar06_FindGoodDaysToRobTheBank;

import util.PrintUtil;

public class Mar06 {
    private static final int[] s1 = { 5, 3, 3, 3, 5, 6, 2 };
    private static final int[] s2 = { 1, 1, 1, 1, 1 };
    private static final int[] s3 = { 1, 2, 3, 4, 5, 6 };
    private static final int[] s4 = { 1 };
    private static final int[] s5 = { 1, 2, 3, 4 };
    private static final int[] s6 = { 4, 3, 2, 1 };
    private static final int[] s7 = { 5, 3, 3, 3, 5, 6, 2 };

    public static void main(String[] args) {
        Solution solution = new Solution();
        PrintUtil.println(solution.goodDaysToRobBank(s1, 2));
        PrintUtil.println(solution.goodDaysToRobBank(s2, 0));
        PrintUtil.println(solution.goodDaysToRobBank(s3, 2));
        PrintUtil.println(solution.goodDaysToRobBank(s4, 5));
        PrintUtil.println(solution.goodDaysToRobBank(s5, 1));
        PrintUtil.println(solution.goodDaysToRobBank(s6, 1));
        PrintUtil.println(solution.goodDaysToRobBank(s7, 2));
    }
}
