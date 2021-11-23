package hot100.No002_AddTwoNumbers;

import util.PrintUtil;

import java.math.BigInteger;

public class No002 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        println(solution.addTwoNumbers(makeNode(342), makeNode(465)));
        println(solution.addTwoNumbers(makeNode(0), makeNode(0)));
        println(solution.addTwoNumbers(makeNode(9999999), makeNode(9999)));
    }

    private static ListNode makeNode(int i) {
        ListNode result = new ListNode();
        ListNode current = result;
        while (true) {
            current.val = i % 10;
            i /= 10;
            if (i <= 0) {
                return result;
            }
            current.next = new ListNode();
            current = current.next;
        }
    }

    private static void println(ListNode node) {
        BigInteger ans = BigInteger.ZERO;
        BigInteger bit = BigInteger.ONE;
        while (node != null) {
            ans = ans.add(BigInteger.valueOf(node.val).multiply(bit));
            bit = bit.multiply(BigInteger.TEN);
            node = node.next;
        }
        PrintUtil.println(ans.toString());
    }
}
