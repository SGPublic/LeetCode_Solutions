package daily.Y2021.Dec.Dec02_RelativeRanks;

import util.PrintUtil;

public class Dec02 {
    private static final int[] s1 = { 5, 4, 3, 2, 1 };
    private static final int[] s2 = { 10, 3, 8, 9, 4 };

    public static void main(String[] args) {
        Solution solution = new Solution();
        PrintUtil.println(solution.findRelativeRanks(s1));
        PrintUtil.println(solution.findRelativeRanks(s2));
    }
}
