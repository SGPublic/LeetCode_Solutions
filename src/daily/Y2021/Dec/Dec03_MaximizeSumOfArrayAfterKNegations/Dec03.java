package daily.Y2021.Dec.Dec03_MaximizeSumOfArrayAfterKNegations;

import util.ArrayFactory;
import util.PrintUtil;

public class Dec03 {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        PrintUtil.println(solution.largestSumAfterKNegations(
//                ArrayFactory.make(4, 2, 3), 1
//        ));
        PrintUtil.println(solution.largestSumAfterKNegations(
                ArrayFactory.make(3, -1, 0, 2), 3
        ));
//        PrintUtil.println(solution.largestSumAfterKNegations(
//                ArrayFactory.make(2, -3, -1, 5, -4), 2
//        ));
    }
}
