package daily.Y2021.Dec.Dec02_RelativeRanks;

import java.util.PriorityQueue;

class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] ans = new String[score.length];
        PriorityQueue<Score> queue = new PriorityQueue<>();
        for (int i = 0; i < score.length; i++) {
            queue.add(new Score(score[i], i));
        }
        while (!queue.isEmpty()) {
            Score current = queue.poll();
            String index;
            switch (queue.size()) {
                case 0:
                    index = "Gold Medal";
                    break;
                case 1:
                    index = "Silver Medal";
                    break;
                case 2:
                    index = "Bronze Medal";
                    break;
                default:
                    index = String.valueOf(queue.size() + 1);
            }
            ans[current.index] = index;
        }
        return ans;
    }

    private static class Score implements Comparable<Score> {
        final int score;
        final int index;

        public Score(int score, int index) {
            this.score = score;
            this.index = index;
        }

        @Override
        public int compareTo(Score o) {
            return this.score - o.score;
        }
    }
}