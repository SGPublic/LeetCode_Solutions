package hot100.No005_LongestPalindromicSubstring;

import util.PrintUtil;

public class No005 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        PrintUtil.println(solution.longestPalindrome("babad"));
        PrintUtil.println(solution.longestPalindrome("cbbd"));
        PrintUtil.println(solution.longestPalindrome("a"));
        PrintUtil.println(solution.longestPalindrome("ac"));
    }
}
