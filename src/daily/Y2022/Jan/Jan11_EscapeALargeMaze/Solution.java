package daily.Y2022.Jan.Jan11_EscapeALargeMaze;

import java.util.*;

class Solution {
    private static final int[][] moves = {
            { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 }
    };

    public boolean isEscapePossible(int[][] blocked, int[] source, int[] target) {
        if (blocked.length < 2) {
            return true;
        }
        Set<Point> map = new HashSet<>();
        for (int[] ints : blocked) {
            map.add(new Point(ints[0], ints[1]));
        }
        final int surface = map.size() * (map.size() - 1) / 2;
        Point S = new Point(source[0], source[1]);
        Point T = new Point(target[0], target[1]);

        Queue<Point> start = new LinkedList<>();
        start.add(S);
        int startSur = 0;
        while (!start.isEmpty()) {
            if (startSur > surface) {
                break;
            }
            int startSize = start.size();
            for (int i = 0; i < startSize; i++) {
                Point current = start.poll();
                for (int[] move : moves) {
                    Point next = current.move(move);
                    if (next == null) {
                        continue;
                    }
                    if (next.equals(T)) {
                        return true;
                    }
                    if (map.add(next)) {
                        startSur++;
                        start.add(next);
                    }
                }
            }
        }
        if (startSur <= surface) {
            return false;
        }
        Queue<Point> end = new LinkedList<>();
        end.add(T);
        int endSur = 0;
        while (!end.isEmpty()) {
            if (endSur > surface) {
                return true;
            }
            int endSize = end.size();
            for (int i = 0; i < endSize; i++) {
                Point current = end.poll();
                for (int[] move : moves) {
                    Point next = current.move(move);
                    if (next == null) {
                        continue;
                    }
                    if (map.add(next)) {
                        endSur++;
                        end.add(next);
                    }
                }
            }
        }
        return false;
    }

    private static class Point {
        private final int x;
        private final int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public Point move(int[] move) {
            int x = this.x + move[0];
            int y = this.y + move[1];
            if (x < 0 || x >= 1000000 || y < 0 || y >= 1000000) {
                return null;
            }
            return new Point(x, y);
        }

        @Override
        public boolean equals(Object o) {
            Point point = (Point) o;
            return x == point.x && y == point.y;
        }

        @Override
        public int hashCode() {
            return x * 31 + y;
        }
    }
}