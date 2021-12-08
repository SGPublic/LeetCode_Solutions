package daily.Y2021.Nov.Nov29_kThSmallestPrimeFraction;

import util.PrintUtil;

public class Nov29 {
    private static final int[] s1 = { 1, 2, 3, 5 };
    private static final int[] s2 = { 1, 7 };

    public static void main(String[] args) {
        Solution solution = new Solution();
        PrintUtil.println(solution.kthSmallestPrimeFraction(s1, 3));
        PrintUtil.println(solution.kthSmallestPrimeFraction(s2, 1));
    }
}
