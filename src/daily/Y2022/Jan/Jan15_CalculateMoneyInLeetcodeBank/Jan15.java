package daily.Y2022.Jan.Jan15_CalculateMoneyInLeetcodeBank;

import util.PrintUtil;

public class Jan15 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        PrintUtil.println(solution.totalMoney(4));
        PrintUtil.println(totalMoney(4));
        PrintUtil.println(solution.totalMoney(10));
        PrintUtil.println(totalMoney(10));
        PrintUtil.println(solution.totalMoney(20));
        PrintUtil.println(totalMoney(20));
    }

    private static int totalMoney(int n) {
        int ans = 0;
        int current = 0;
        while (true) {
            current++;
            for (int i = 0; i < 7; i++) {
                ans += current + i;
                if (--n <= 0) {
                    return ans;
                }
            }
        }
    }
}
