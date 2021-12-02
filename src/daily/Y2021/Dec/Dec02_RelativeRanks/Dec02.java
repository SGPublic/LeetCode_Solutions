package daily.Y2021.Dec.Dec02_RelativeRanks;

import util.ArrayFactory;
import util.PrintUtil;

public class Dec02 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        PrintUtil.println(solution.findRelativeRanks(ArrayFactory.make(5, 4, 3, 2, 1)));
        PrintUtil.println(solution.findRelativeRanks(ArrayFactory.make(10, 3, 8, 9, 4)));
    }
}
