package daily.Y2021.Nov.Nov01_DistributeCandies;

import util.PrintUtil;

public class Nov01 {
    private static final int[] s1 = { 1, 1, 2, 2, 3, 3 };
    private static final int[] s2 = { 1, 1, 2, 3 };
    private static final int[] s3 = { 6, 6, 6, 6 };

    public static void main(String[] args) {
        Solution solution = new Solution();
        PrintUtil.println(solution.distributeCandies(s1));
        PrintUtil.println(solution.distributeCandies(s2));
        PrintUtil.println(solution.distributeCandies(s3));
    }
}
