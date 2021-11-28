package daily.Y2021.Nov.Nov28_FindAllAnagramsInAString;

import util.PrintUtil;

public class Nov28 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        PrintUtil.println(solution.findAnagrams("cbaebabacd", "abc"));
        PrintUtil.println(solution.findAnagrams("abab", "ab"));
        PrintUtil.println(solution.findAnagrams("aa", "bb"));
        PrintUtil.println(solution.findAnagrams("aaaaaaaaaa", "aaaaaaaaaaaaa"));
    }
}
