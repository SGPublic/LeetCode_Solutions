package daily.Y2021.Nov.Nov18_BinaryTreeTilt;

import util.PrintUtil;
import util.TreeNode;

public class Nov18 {
    private static final TreeNode s1 = new TreeNode(
            1,
            new TreeNode(2),
            new TreeNode(3)
    );
    private static final TreeNode s2 = new TreeNode(
            4,
            new TreeNode(
                    2,
                    new TreeNode(3),
                    new TreeNode(5)
            ),
            new TreeNode(
                    9,
                    null,
                    new TreeNode(7)
            )
    );
    private static final TreeNode s3 = new TreeNode(
            21,
            new TreeNode(
                    7,
                    new TreeNode(
                            1,
                            new TreeNode(3),
                            new TreeNode(3)
                    ),
                    new TreeNode(1)
            ),
            new TreeNode(
                    14,
                    new TreeNode(2),
                    new TreeNode(2)
            )
    );

    public static void main(String[] args) {
        Solution solution = new Solution();
        PrintUtil.println(solution.findTilt(s1));
        PrintUtil.println(solution.findTilt(s2));
        PrintUtil.println(solution.findTilt(s3));
    }
}
