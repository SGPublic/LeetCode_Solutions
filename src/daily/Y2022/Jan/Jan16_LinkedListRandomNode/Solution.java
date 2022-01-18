package daily.Y2022.Jan.Jan16_LinkedListRandomNode;

import util.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    private final int size;
    private final List<Integer> node = new ArrayList<>();
    private final Random random = new Random();

    public Solution(ListNode head) {
        while (head != null) {
            node.add(head.val);
            head = head.next;
        }
        size = node.size();
    }

    public int getRandom() {
        return node.get(random.nextInt(size));
    }
}

/*
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */