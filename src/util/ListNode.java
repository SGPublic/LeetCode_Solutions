package util;

/**
 * 链表
 */
public class ListNode {
    public int val;
    public ListNode next = null;

    public ListNode(int x) {
        val = x;
    }

    public void println() {
        println(this);
    }

    public static void println(ListNode node) {
        int[] array = new int[] {
                node.val
        };
        while (node.next != null) {
            node = node.next;
            array = ArrayFactory.append(array, node.val);
        }
        PrintUtil.println(array);
    }

    public static ListNode create(int... nums) {
        ListNode node = new ListNode(nums[nums.length - 1]);
        for (int i = nums.length - 1; i > 0; i--) {
            ListNode current = new ListNode(nums[i - 1]);
            current.next = node;
            node = current;
        }
        return node;
    }
}