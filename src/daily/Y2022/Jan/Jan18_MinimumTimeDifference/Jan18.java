package daily.Y2022.Jan.Jan18_MinimumTimeDifference;

import util.PrintUtil;

import java.util.Arrays;
import java.util.List;

public class Jan18 {
    private static final List<String> s1 = Arrays.asList("23:59", "00:00");
    private static final List<String> s2 = Arrays.asList("00:00", "23:59", "00:00");
    private static final List<String> s3 = Arrays.asList("05:31", "22:08", "00:35");

    public static void main(String[] args) {
        Solution solution = new Solution();
        PrintUtil.println(solution.findMinDifference(s1));
        PrintUtil.println(solution.findMinDifference(s2));
        PrintUtil.println(solution.findMinDifference(s3));
    }
}
