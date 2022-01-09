package daily.Y2022.Jan.Jan09_SlowestKey;

import util.PrintUtil;

public class Jan09 {
    private static final int[] s1_i = { 9, 29, 49, 50 };
    private static final String s1_s = "cbcd";

    private static final int[] s2_i = { 12, 23, 36, 46, 62 };
    private static final String s2_s = "spuda";

    private static final int[] s3_i = { 28, 65, 97 };
    private static final String s3_s = "gaf";

    public static void main(String[] args) {
        Solution solution = new Solution();
        PrintUtil.println(solution.slowestKey(s1_i, s1_s));
        PrintUtil.println(solution.slowestKey(s2_i, s2_s));
        PrintUtil.println(solution.slowestKey(s3_i, s3_s));
    }
}
