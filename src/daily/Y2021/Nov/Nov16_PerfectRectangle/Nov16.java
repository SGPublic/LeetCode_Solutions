package daily.Y2021.Nov.Nov16_PerfectRectangle;

import util.ArrayFactory;
import util.PrintUtil;

public class Nov16 {
    private static final int[][] s1 = ArrayFactory.getInterface(5, 4).setup(
            1, 1, 3, 3,    3, 1, 4, 2,    3, 2, 4, 4,    1, 3, 2, 4,    2, 3, 3, 4
    );
    private static final int[][] s2 = ArrayFactory.getInterface(4, 4).setup(
            1, 1, 2, 3,    1, 3, 2, 4,    3, 1, 4, 2,    3, 2, 4, 4
    );
    private static final int[][] s3 = ArrayFactory.getInterface(4, 4).setup(
            1, 1, 3, 3,    3, 1, 4, 2,    1, 3, 2, 4,    3, 2, 4, 4
    );
    private static final int[][] s4 = ArrayFactory.getInterface(4, 4).setup(
            1, 1, 3, 3,    3, 1, 4, 2,    1, 3, 2, 4,    2, 2, 4, 4
    );
    private static final int[][] s5 = ArrayFactory.getInterface(3, 4).setup(
            0, 0, 1, 1,    0, 1, 3, 2,    1, 0, 2, 2
    );

    public static void main(String[] args) {
        Solution solution = new Solution();
        PrintUtil.println(solution.isRectangleCover(s1));
        PrintUtil.println(solution.isRectangleCover(s2));
        PrintUtil.println(solution.isRectangleCover(s3));
        PrintUtil.println(solution.isRectangleCover(s4));
        PrintUtil.println(solution.isRectangleCover(s5));
    }
}
