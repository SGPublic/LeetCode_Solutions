package daily.Y2021.Nov.Nov07_RangeAddition2;

import util.ArrayFactory;
import util.PrintUtil;

public class Nov07 {
    private static final int[][] s1 = ArrayFactory.getInterface(2, 2).setup(2, 2, 3, 3);
    private static final int[][] s2 = ArrayFactory.getInterface(12, 2).setup(
            2, 2,    3, 3,    3, 3,    3, 3,    2, 2,
            3, 3,    3, 3,    3, 3,    3, 3,    3, 3,
            3, 3,    3, 3
    );
    private static final int[][] s3 = ArrayFactory.getInterface(0, 2).getEmptyIntArray();

    public static void main(String[] args) {
        Solution solution = new Solution();
        PrintUtil.println(solution.maxCount(3, 3, s1));
        PrintUtil.println(solution.maxCount(3, 3, s2));
        PrintUtil.println(solution.maxCount(3, 3, s3));
    }
}
