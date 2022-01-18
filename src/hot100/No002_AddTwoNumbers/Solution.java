package hot100.No002_AddTwoNumbers;

import util.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode();
        ListNode current = ans;
        do {
            current.val += getNodeVal(l1) + getNodeVal(l2);
            if (current.val > 9) {
                // 进位
                current.next = new ListNode(current.val / 10);
                current.val %= 10;
            }
            l1 = getNext(l1);
            l2 = getNext(l2);
            if (l1 == null && l2 == null) {
                break;
            }
            if (current.next == null) {
                current.next = new ListNode(0);
            }
            current = current.next;
        } while (true);
        return ans;
    }

    private ListNode getNext(ListNode node) {
        return node == null ? null : node.next;
    }

    private int getNodeVal(ListNode node) {
        return node == null ? 0 : node.val;
    }
}
