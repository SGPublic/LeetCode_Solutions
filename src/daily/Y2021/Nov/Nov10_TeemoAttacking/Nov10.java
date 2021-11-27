package daily.Y2021.Nov.Nov10_TeemoAttacking;

import util.ArrayFactory;
import util.PrintUtil;

public class Nov10 {
    private static final int[] s1 = ArrayFactory.make(1, 4);
    private static final int[] s2 = ArrayFactory.make(1, 2);

    public static void main(String[] args) {
        Solution solution = new Solution();
        PrintUtil.println(solution.findPoisonedDuration(s1, 2));
        PrintUtil.println(solution.findPoisonedDuration(s2, 2));
    }
}
