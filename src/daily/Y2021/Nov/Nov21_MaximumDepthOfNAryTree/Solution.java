package daily.Y2021.Nov.Nov21_MaximumDepthOfNAryTree;

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

import util.Node;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        Queue<Node> queue = new LinkedList<>();
        int ans = 0;
        queue.add(root);
        while (!queue.isEmpty()) {
            ans++;
            int size = queue.size();
            while (size-- > 0) {
                Node current = queue.poll();
                if (current == null) {
                    break;
                }
                queue.addAll(current.children);
            }
        }
        return ans;
    }
}