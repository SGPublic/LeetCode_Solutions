package Y2021.Oct.Oct29;

class Solution {
    public boolean isSelfCrossing(int[] distance) {
        for (int i = 3; i < distance.length; ++i) {
            if (distance[i] >= distance[i - 2] && distance[i - 1] <= distance[i - 3]) {
                return true;
            }

            if (i == 4 && (distance[3] == distance[1] && distance[4] >= distance[2] - distance[0])) {
                return true;
            }

            if (i >= 5 && (distance[i - 3] - distance[i - 5] <= distance[i - 1] && distance[i - 1] <= distance[i - 3]
                    && distance[i] >= distance[i - 2] - distance[i - 4] && distance[i - 2] > distance[i - 4])) {
                return true;
            }
        }
        return false;
    }
}