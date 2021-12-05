package daily.Y2021.Dec.Dec05_SuperPow;

import util.ArrayFactory;
import util.PrintUtil;

public class Dec05 {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        PrintUtil.println(solution.superPow(2, ArrayFactory.make(3)));
//        PrintUtil.println(solution.superPow(2, ArrayFactory.make(1, 0)));
//        PrintUtil.println(solution.superPow(1, ArrayFactory.make(4, 3, 3, 8, 5, 2)));
        PrintUtil.println(solution.superPow(2147483647, ArrayFactory.make(2, 0, 0)));
    }
}
