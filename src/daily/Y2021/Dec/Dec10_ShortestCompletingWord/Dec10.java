package daily.Y2021.Dec.Dec10_ShortestCompletingWord;

import util.PrintUtil;

public class Dec10 {
    private static final String[] s1 = {"step", "steps", "stripe", "stepple"};
    private static final String[] s2 = {"looks", "pest", "stew", "show"};
    private static final String[] s3 = {"suggest", "letter", "of", "husband", "easy", "education", "drug", "prevent", "writer", "old"};
    private static final String[] s4 = {"enough", "these", "play", "wide", "wonder", "box", "arrive", "money", "tax", "thus"};
    private static final String[] s5 = {"claim", "consumer", "student", "camera", "public", "never", "wonder", "simple", "thought", "use"};

    public static void main(String[] args) {
        Solution solution = new Solution();
        PrintUtil.println(solution.shortestCompletingWord("1s3 PSt", s1));
        PrintUtil.println(solution.shortestCompletingWord("1s3 456", s2));
        PrintUtil.println(solution.shortestCompletingWord("Ah71752", s3));
        PrintUtil.println(solution.shortestCompletingWord("OgEu755", s4));
        PrintUtil.println(solution.shortestCompletingWord("iMSlpe4", s5));
    }
}
