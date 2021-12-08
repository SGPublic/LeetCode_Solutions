package daily.Y2021.Nov.Nov17_MaximumProductOfWordLengths;

import util.PrintUtil;

public class Nov17 {
    private static final String[] s1 = {
            "abcw", "baz", "foo", "bar", "xtfn", "abcdef"
    };
    private static final String[] s2 = {
            "a", "ab", "abc", "d", "cd", "bcd", "abcd"
    };
    private static final String[] s3 = {
            "a", "aa", "aaa", "aaaa"
    };

    public static void main(String[] args) {
        Solution solution = new Solution();
        PrintUtil.println(solution.maxProduct(s1));
        PrintUtil.println(solution.maxProduct(s2));
        PrintUtil.println(solution.maxProduct(s3));
    }
}
