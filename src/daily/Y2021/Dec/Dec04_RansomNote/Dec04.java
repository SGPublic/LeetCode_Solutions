package daily.Y2021.Dec.Dec04_RansomNote;

import util.PrintUtil;

public class Dec04 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        PrintUtil.println(solution.canConstruct("a", "b"));
        PrintUtil.println(solution.canConstruct("aa", "ab"));
        PrintUtil.println(solution.canConstruct("aa", "aab"));
    }
}
