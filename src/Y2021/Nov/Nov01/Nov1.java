package Y2021.Nov.Nov01;

import util.PrintUtil;

public class Nov1 {
    private static final int[] s1 = new int[] { 1, 1, 2, 2, 3, 3 };
    private static final int[] s2 = new int[] { 1, 1, 2, 3 };
    private static final int[] s3 = new int[] { 6, 6, 6, 6 };

    public static void main(String[] args) {
        Solution solution = new Solution();
        PrintUtil.println(solution.distributeCandies(s1));
        PrintUtil.println(solution.distributeCandies(s2));
        PrintUtil.println(solution.distributeCandies(s3));
    }
}
