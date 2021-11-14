package Y2021.Nov.Nov08;

import util.PrintUtil;

public class Nov08 {
    private static final String s1_s = "1807";
    private static final String s1_g = "7810";

    private static final String s2_s = "1123";
    private static final String s2_g = "0111";

    private static final String s3_s = "1";
    private static final String s3_g = "0";

    private static final String s4_s = "1";
    private static final String s4_g = "1";


    public static void main(String[] args) {
        Solution solution = new Solution();
        PrintUtil.println(solution.getHint(s1_s, s1_g));
        PrintUtil.println(solution.getHint(s2_s, s2_g));
        PrintUtil.println(solution.getHint(s3_s, s3_g));
        PrintUtil.println(solution.getHint(s4_s, s4_g));
    }
}
