package Y2021.Nov.Nov19;

import java.util.LinkedList;

class Solution {
    public int integerReplacement(int n) {
        LinkedList<Long> bfs = new LinkedList<>();
        bfs.add((long) n);
        int ans = 0;
        while (true) {
            int size = bfs.size();
            while (size-- > 0) {
                long current = bfs.removeFirst();
                if (current == 1) {
                    return ans;
                }
                if (current % 2 == 0) {
                    bfs.addLast(current / 2);
                } else {
                    bfs.addLast(current + 1);
                    bfs.addLast(current - 1);
                }
            }
            ans++;
        }
    }
}
