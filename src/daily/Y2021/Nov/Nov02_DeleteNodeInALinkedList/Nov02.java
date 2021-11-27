package daily.Y2021.Nov.Nov02_DeleteNodeInALinkedList;

import util.ListNode;

public class Nov02 {
    private static final ListNode s1 = ListNode.create(4, 5, 1, 9);
    private static final ListNode s2 = ListNode.create(4, 5, 1, 9);
    private static final ListNode s3 = ListNode.create(1, 2, 3, 4);
    private static final ListNode s4 = ListNode.create(0, 1);
    private static final ListNode s5 = ListNode.create(-3, 5, -99);

    public static void main(String[] args) {
        Nov02.deleteNode(s1, 5);
        Nov02.deleteNode(s2, 1);
        Nov02.deleteNode(s3, 3);
        Nov02.deleteNode(s4, 0);
        Nov02.deleteNode(s5, -3);
    }

    private static void deleteNode(ListNode node, int index) {
        Solution s = new Solution();
        ListNode targetNode = node;
        while (targetNode.val != index) {
            targetNode = targetNode.next;
        }
        s.deleteNode(targetNode);
        node.println();
    }
}
