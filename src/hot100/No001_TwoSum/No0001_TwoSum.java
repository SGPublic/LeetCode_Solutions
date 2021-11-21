package hot100.No001_TwoSum;

import util.PrintUtil;

public class No0001_TwoSum {
    private static final int[] s1 = new int[] {
            2, 7, 11, 15
    };
    private static final int[] s2 = new int[] {
            3, 2, 4
    };
    private static final int[] s3 = new int[] {
            3, 3
    };
    private static final int[] s4 = new int[] {
            1, 1, 1, 1, 1, 4, 1, 1, 1,
            1, 1, 7, 1, 1, 1, 1, 1
    };

    public static void main(String[] args) {
        Solution solution = new Solution();
        PrintUtil.println(solution.twoSum(s1, 9));
        PrintUtil.println(solution.twoSum(s2, 6));
        PrintUtil.println(solution.twoSum(s3, 6));
        PrintUtil.println(solution.twoSum(s4, 11));
    }
}
