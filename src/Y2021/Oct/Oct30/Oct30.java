package Y2021.Oct.Oct30;

import util.PrintUtil;

public class Oct30 {
    private static final int[] s1 = new int[]{ 1, 2, 1, 3, 2, 5 };
    private static final int[] s2 = new int[]{ -1, 0 };
    private static final int[] s3 = new int[]{ 1, 0 };

    public static void main(String[] args) {
        Solution solution = new Solution();
        PrintUtil.println(solution.singleNumber(s1));
        PrintUtil.println(solution.singleNumber(s2));
        PrintUtil.println(solution.singleNumber(s3));
    }
}
