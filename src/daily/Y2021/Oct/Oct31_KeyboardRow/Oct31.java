package daily.Y2021.Oct.Oct31_KeyboardRow;

import util.PrintUtil;

public class Oct31 {
    private static final String[] s1 = new String[]{ "Hello", "Alaska", "Dad", "Peace" };
    private static final String[] s2 = new String[]{ "omk" };
    private static final String[] s3 = new String[]{ "adsdf", "sfd" };

    public static void main(String[] args) {
        Solution solution = new Solution();
        PrintUtil.println(solution.findWords(s1));
        PrintUtil.println(solution.findWords(s2));
        PrintUtil.println(solution.findWords(s3));
    }
}
