package Y2021.Nov.Nov21;

import java.util.ArrayList;
import java.util.List;

class Node {
    public int val;
    public List<Node> children = new ArrayList<>();

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}