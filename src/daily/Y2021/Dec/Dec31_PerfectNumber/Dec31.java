package daily.Y2021.Dec.Dec31_PerfectNumber;

import util.PrintUtil;

public class Dec31 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        PrintUtil.println(solution.checkPerfectNumber(28));
        PrintUtil.println(solution.checkPerfectNumber(6));
        PrintUtil.println(solution.checkPerfectNumber(496));
        PrintUtil.println(solution.checkPerfectNumber(8128));
        PrintUtil.println(solution.checkPerfectNumber(2));
        PrintUtil.println(solution.checkPerfectNumber(1));
    }
}
