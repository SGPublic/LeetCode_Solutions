package daily.Y2022.Mar.Mar05_LongestUncommonSubsequence1;

import util.PrintUtil;

public class Mar05 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        PrintUtil.println(solution.findLUSlength("aba", "cdc"));
        PrintUtil.println(solution.findLUSlength("aaa", "bbb"));
        PrintUtil.println(solution.findLUSlength("aaa", "aaa"));
    }
}
