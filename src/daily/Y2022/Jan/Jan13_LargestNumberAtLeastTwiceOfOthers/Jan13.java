package daily.Y2022.Jan.Jan13_LargestNumberAtLeastTwiceOfOthers;

import util.PrintUtil;

public class Jan13 {
    private static final int[] s1 = { 3, 6, 1, 0 };
    private static final int[] s2 = { 1, 2, 3, 4 };
    private static final int[] s3 = { 1 };
    private static final int[] s4 = { 0, 2, 3, 0 };

    public static void main(String[] args) {
        Solution solution = new Solution();
        PrintUtil.println(solution.dominantIndex(s1));
        PrintUtil.println(solution.dominantIndex(s2));
        PrintUtil.println(solution.dominantIndex(s3));
        PrintUtil.println(solution.dominantIndex(s4));
    }
}
