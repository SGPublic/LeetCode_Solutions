package daily.Y2021.Nov.Nov21_MaximumDepthOfNAryTree;

import util.PrintUtil;

import java.util.ArrayList;
import java.util.Arrays;

public class Nov21 {
    private static final Node s1 = new Node(1, arrayListOf(
            new Node(3, arrayListOf(
                    new Node(5), new Node(6)
            )), new Node(2), new Node(4)
    ));
    private static final Node s2 = new Node(1, arrayListOf(
            new Node(2), new Node(3, arrayListOf(
                    new Node(6), new Node(7, arrayListOf(
                            new Node(11, arrayListOf(
                                    new Node(14)
                            ))
                    ))
            )), new Node(4, arrayListOf(
                    new Node(8, arrayListOf(
                            new Node(12)
                    ))
            )), new Node(5, arrayListOf(
                    new Node(9, arrayListOf(
                            new Node(13)
                    )), new Node(10)
            ))
    ));
    private static final Node s3 = null;

    public static void main(String[] args) {
        Solution solution = new Solution();
        PrintUtil.println(solution.maxDepth(s1));
        PrintUtil.println(solution.maxDepth(s2));
        PrintUtil.println(solution.maxDepth(s3));
    }

    private static ArrayList<Node> arrayListOf(Node... nodes) {
        return new ArrayList<>(Arrays.asList(nodes));
    }
}
