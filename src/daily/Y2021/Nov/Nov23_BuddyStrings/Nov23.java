package daily.Y2021.Nov.Nov23_BuddyStrings;

import util.PrintUtil;

public class Nov23 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        PrintUtil.println(solution.buddyStrings("ab", "ba"));
        PrintUtil.println(solution.buddyStrings("ab", "ab"));
        PrintUtil.println(solution.buddyStrings("aa", "aa"));
        PrintUtil.println(solution.buddyStrings("abcd", "badc"));
        PrintUtil.println(solution.buddyStrings("aaaaaaabc", "aaaaaaacb"));
    }
}
