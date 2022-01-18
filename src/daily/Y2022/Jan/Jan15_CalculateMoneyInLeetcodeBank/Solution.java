package daily.Y2022.Jan.Jan15_CalculateMoneyInLeetcodeBank;

class Solution {
    public int totalMoney(int n) {
        int ans = 0;

        int fullWeek = n / 7;
        ans += 28 * fullWeek;
        ans += Math.max(0, fullWeek - 1) * 7 * fullWeek / 2;

        int left = n % 7;
        ans += left * fullWeek + (1 + left) * left / 2;

        return ans;
    }
}