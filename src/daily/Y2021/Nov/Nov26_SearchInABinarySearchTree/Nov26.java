package daily.Y2021.Nov.Nov26_SearchInABinarySearchTree;

import util.PrintUtil;
import util.TreeNode;

public class Nov26 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        PrintUtil.println(solution.searchBST(new TreeNode(
                4,
                new TreeNode(
                        2,
                        new TreeNode(1),
                        new TreeNode(3)
                ),
                new TreeNode(7)
        ), 2).val);
    }
}
