package hot100.No003_LongestSubstringWithoutRepeatingCharacters;

import util.PrintUtil;

public class No003 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        PrintUtil.println(solution.lengthOfLongestSubstring("abcabcbb"));
        PrintUtil.println(solution.lengthOfLongestSubstring("bbbbb"));
        PrintUtil.println(solution.lengthOfLongestSubstring("pwwkew"));
    }
}
