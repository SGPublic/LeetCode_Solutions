package Y2021.Oct.Oct29;

import util.PrintUtil;

public class Oct29 {
    private static final int[] s1 = new int[]{
            2, 1, 1, 2
    };
    private static final int[] s2 = new int[]{
            1, 2, 3, 4
    };
    private static final int[] s3 = new int[]{
            1, 1, 1, 1
    };

    public static void main(String[] args) {
        Solution solution = new Solution();
        PrintUtil.println(solution.isSelfCrossing(s1));
        PrintUtil.println(solution.isSelfCrossing(s2));
        PrintUtil.println(solution.isSelfCrossing(s3));
    }
}
