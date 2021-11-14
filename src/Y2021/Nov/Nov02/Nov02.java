package Y2021.Nov.Nov02;

import util.PrintUtil;

import java.util.Arrays;

public class Nov02 {
    private static final ListNode s1 = createNode(new int[]{ 4, 5, 1, 9 });
    private static final ListNode s2 = createNode(new int[]{ 4, 5, 1, 9 });
    private static final ListNode s3 = createNode(new int[]{ 1, 2, 3, 4 });
    private static final ListNode s4 = createNode(new int[]{ 0, 1 });
    private static final ListNode s5 = createNode(new int[]{ -3, 5, -99 });

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
        println(node);
    }

    private static ListNode createNode(int[] nums) {
        ListNode node = new ListNode(nums[nums.length - 1]);
        for (int i = nums.length - 1; i > 0; i--) {
            ListNode current = new ListNode(nums[i - 1]);
            current.next = node;
            node = current;
        }
        return node;
    }

    private static void println(ListNode node) {
        int[] array = new int[] {
                node.val
        };
        while (node.next != null) {
            node = node.next;
            array = Arrays.copyOf(array, array.length + 1);
            array[array.length - 1] = node.val;
        }
        PrintUtil.println(array);
    }
}
