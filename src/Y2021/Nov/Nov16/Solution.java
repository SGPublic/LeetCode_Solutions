package Y2021.Nov.Nov16;

import javafx.util.Pair;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean isRectangleCover(int[][] rectangles) {
        long total = 0;
        Set<Pair<Integer, Integer>> points = new HashSet<>();

        int left = rectangles[0][0];
        int bottom = rectangles[0][1];
        int right = rectangles[0][2];
        int top = rectangles[0][3];

        for (int[] rectangle : rectangles) {
            left = Math.min(rectangle[0], left);
            bottom = Math.min(rectangle[1], bottom);
            right = Math.max(rectangle[2], right);
            top = Math.max(rectangle[3], top);

            Pair<Integer, Integer> p1 = new Pair<>(rectangle[0], rectangle[1]);
            if (points.contains(p1)) points.remove(p1); else points.add(p1);

            Pair<Integer, Integer> p2 = new Pair<>(rectangle[0], rectangle[3]);
            if (points.contains(p2)) points.remove(p2); else points.add(p2);

            Pair<Integer, Integer> p3 = new Pair<>(rectangle[2], rectangle[1]);
            if (points.contains(p3)) points.remove(p3); else points.add(p3);

            Pair<Integer, Integer> p4 = new Pair<>(rectangle[2], rectangle[3]);
            if (points.contains(p4)) points.remove(p4); else points.add(p4);

            total += (long) (rectangle[3] - rectangle[1]) * (rectangle[2] - rectangle[0]);
        }

        if (total != (long) (top - bottom) * (right - left)) {
            return false;
        }

        if (points.size() != 4) {
            return false;
        }

        if (!points.remove(new Pair<>(left, bottom))) {
            return false;
        }
        if (!points.remove(new Pair<>(left, top))) {
            return false;
        }
        if (!points.remove(new Pair<>(right, bottom))) {
            return false;
        }
        if (!points.remove(new Pair<>(right, top))) {
            return false;
        }

        return true;
    }
}
