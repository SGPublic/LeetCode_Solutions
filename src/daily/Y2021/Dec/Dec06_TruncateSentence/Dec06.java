package daily.Y2021.Dec.Dec06_TruncateSentence;

import util.PrintUtil;

public class Dec06 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        PrintUtil.println(solution.truncateSentence("Hello how are you Contestant", 4));
        PrintUtil.println(solution.truncateSentence("What is the solution to this problem", 4));
        PrintUtil.println(solution.truncateSentence("chopper is not a tanuki", 5));
    }
}
