package daily.Y2021.Nov.Nov27_RandomFlipMatrix;

import java.util.*;

class Solution {
    private final Set<Pair> set = new HashSet<>();
    private final int m;
    private final int n;
    private final Random random = new Random();

    public Solution(int m, int n) {
        this.m = m;
        this.n = n;
    }

    public int[] flip() {
        Pair current;
        do {
            current = new Pair(random.nextInt(m), random.nextInt(n));
        } while (set.contains(current));
        set.add(current);
        return new int[] {
                current.x, current.y
        };
    }

    public void reset() {
        set.clear();
    }

    private static class Pair {
        final int x;
        final int y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Pair)) return false;
            Pair pair = (Pair) o;
            return x == pair.x && y == pair.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }
}

/*
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(m, n);
 * int[] param_1 = obj.flip();
 * obj.reset();
 */