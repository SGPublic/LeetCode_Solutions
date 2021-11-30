package daily.Y2021.Nov.Nov29_kThSmallestPrimeFraction;

import util.ArrayFactory;
import util.PrintUtil;

public class Nov29 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        PrintUtil.println(solution.kthSmallestPrimeFraction(ArrayFactory.make(1, 2, 3, 5), 3));
        PrintUtil.println(solution.kthSmallestPrimeFraction(ArrayFactory.make(1, 7), 1));
    }
}
