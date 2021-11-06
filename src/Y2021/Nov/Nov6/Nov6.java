package Y2021.Nov.Nov6;

import util.PrintUtil;

public class Nov6 {
    private static final int[] s1 = new int[] { 3, 0, 1 };
    private static final int[] s2 = new int[] { 0, 1 };
    private static final int[] s3 = new int[] { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
    private static final int[] s4 = new int[] { 0 };

    public static void main(String[] args) {
        Solution solution = new Solution();
        PrintUtil.println(solution.missingNumber(s1));
        PrintUtil.println(solution.missingNumber(s2));
        PrintUtil.println(solution.missingNumber(s3));
        PrintUtil.println(solution.missingNumber(s4));
    }
}
