package daily.Y2021.Nov.Nov09_ZumaGame;

import util.PrintUtil;

public class Nov09 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        PrintUtil.println(solution.findMinStep("WRRBBW", "RB"));
        PrintUtil.println(solution.findMinStep("WWRRBBWW", "WRBRW"));
        PrintUtil.println(solution.findMinStep("G", "GGGGG"));
        PrintUtil.println(solution.findMinStep("RBYYBBRRB", "YRBGB"));
    }
}
