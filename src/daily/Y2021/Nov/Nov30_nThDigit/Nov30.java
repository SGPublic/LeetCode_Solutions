package daily.Y2021.Nov.Nov30_nThDigit;

import util.PrintUtil;

public class Nov30 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        PrintUtil.println(solution.findNthDigit(3));
        PrintUtil.println(solution.findNthDigit(11));
        PrintUtil.println(solution.findNthDigit(9));
        PrintUtil.println(solution.findNthDigit(10));
        PrintUtil.println(solution.findNthDigit(100));
        PrintUtil.println(solution.findNthDigit(1000000000));
    }

    /**
     * 暴力求解验证答案
     */
    private static int forceFindNthDigit(int n) {
        int i = 0;
        int index = 0;
        while (true) {
            String nStr = String.valueOf(++i);
            int length = nStr.length();
            if (index + length < n) {
                index += length;
                continue;
            }
            return nStr.charAt(n - index - 1) - '0';
        }
    }
}
