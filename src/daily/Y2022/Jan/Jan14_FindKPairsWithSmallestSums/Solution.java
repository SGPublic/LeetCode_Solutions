package daily.Y2022.Jan.Jan14_FindKPairsWithSmallestSums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<Pair> queue = new PriorityQueue<>();
        int l1 = Math.min(k, nums1.length);
        int l2 = Math.min(k, nums2.length);
        for (int i = 0; i < l1; i++) {
            for (int j = 0; j < l2; j++) {
                queue.add(new Pair(nums1[i], nums2[j]));
            }
        }
        ArrayList<List<Integer>> ans = new ArrayList<>();
        int l3 = Math.min(k, queue.size());
        for (int i = 0; i < l3; i++) {
            ans.add(Pair.toList(queue.poll()));
        }
        return ans;
    }

    private static class Pair implements Comparable<Pair> {
        private final int a;
        private final int b;

        Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }

        static List<Integer> toList(Pair pair) {
            return Arrays.asList(pair.a, pair.b);
        }

        @Override
        public int compareTo(Pair o) {
            return a + b - o.a - o.b;
        }
    }
}