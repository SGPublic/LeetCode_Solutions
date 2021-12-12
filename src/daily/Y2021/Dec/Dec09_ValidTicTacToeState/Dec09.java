package daily.Y2021.Dec.Dec09_ValidTicTacToeState;

import util.PrintUtil;

public class Dec09 {
    private static final String[] s1 = {
            "O  ",
            "   ",
            "   "
    };
    private static final String[] s2 = {
            "XOX",
            " X ",
            "   "
    };
    private static final String[] s3 = {
            "XXX",
            "   ",
            "OOO"
    };
    private static final String[] s4 = {
            "XOX",
            "O O",
            "XOX"
    };
    private static final String[] s5 = {
            "XOX",
            "O X",
            "X O"
    };
    private static final String[] s6 = {
            "OXX",
            "XOX",
            "OXO"
    };

    public static void main(String[] args) {
        Solution solution = new Solution();
        PrintUtil.println(solution.validTicTacToe(s1));
        PrintUtil.println(solution.validTicTacToe(s2));
        PrintUtil.println(solution.validTicTacToe(s3));
        PrintUtil.println(solution.validTicTacToe(s4));
        PrintUtil.println(solution.validTicTacToe(s5));
        PrintUtil.println(solution.validTicTacToe(s6));
    }
}
