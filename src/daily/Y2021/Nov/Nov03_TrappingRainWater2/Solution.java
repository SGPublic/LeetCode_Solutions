package daily.Y2021.Nov.Nov03_TrappingRainWater2;

import java.util.Arrays;
import java.util.Stack;

class Solution {
    public int trapRainWater(int[][] heightMap) {
        // TODO [407. Trapping Rain Water II](https://leetcode-cn.com/problems/trapping-rain-water-ii/)
        int high = heightMap[0][0];
        int low = heightMap[0][0];

        // 简化层数
        for (int[] ints : heightMap) {
            for (int anInt : ints) {
                if (anInt < low) {
                    low = anInt;
                    continue;
                }
                if (anInt > high) {
                    high = anInt;
                }
            }
        }

        int ans = 0;
        // 对每一层进行计算
        for (int i = low; i <= high; i++) {
            // 最外圈围一圈墙方便填补边缘
            this.floor = new boolean[heightMap.length + 2][heightMap[0].length + 2];
            Arrays.fill(this.floor[0], true);
            Arrays.fill(this.floor[heightMap.length + 1], true);
            for (int x = 1; x < heightMap.length + 1; x++) {
                this.floor[x][0] = true;
                this.floor[x][heightMap.length + 1] = true;
                for (int y = 1; y < heightMap[x - 1].length + 1; y++) {
                    this.floor[x][y] = heightMap[x - 1][y - 1] < i;
                }
            }
            ans += singleFloor();
        }
        return ans;
    }

    // 提取一层
    private boolean[][] floor = null;
    private int singleFloor() {
        // 填补边缘
        Stack<Pair> stack = new Stack<>();
        for (int x = 1; x < floor.length - 1; x++) {
            boolean[] line = floor[x];
            if (x == 1 || x == floor.length - 2) {
                for (int y = 0; y < line.length; y++) {
                    stack.push(new Pair(x, y));
                }
            } else {
                stack.push(new Pair(x, 1));
                stack.push(new Pair(x, line.length - 2));
            }
        }
        // BFS
        while (stack.size() > 0) {
            for (int i = 0; i < stack.size(); i++) {
                Pair pair = stack.pop();
                if (this.floor[pair.x][pair.y]) {
                    continue;
                }
                this.floor[pair.x][pair.y] = true;
                boolean up;
                boolean down;
                boolean left;
                boolean right;
                try {
                    up = this.floor[pair.x + 1][pair.y];
                    down = this.floor[pair.x - 1][pair.y];
                    left = this.floor[pair.x][pair.y - 1];
                    right = this.floor[pair.x][pair.y + 1];
                } catch (ArrayIndexOutOfBoundsException e) {
                    continue;
                }
                // 上下左右偏移
                if (!up) {
                    stack.push(new Pair(pair.x + 1, pair.y));
                }
                if (!down) {
                    stack.push(new Pair(pair.x - 1, pair.y));
                }
                if (!left) {
                    stack.push(new Pair(pair.x, pair.y - 1));
                }
                if (!right) {
                    stack.push(new Pair(pair.x, pair.y + 1));
                }
                // 四个角偏移，若未被封闭才能偏移
                if ((!up || !right) && !this.floor[pair.x + 1][pair.y + 1]) {
                    stack.push(new Pair(pair.x + 1, pair.y + 1));
                }
                if ((!up || !left) && !this.floor[pair.x + 1][pair.y - 1]) {
                    stack.push(new Pair(pair.x + 1, pair.y - 1));
                }
                if ((!down || !right) && !this.floor[pair.x - 1][pair.y + 1]) {
                    stack.push(new Pair(pair.x - 1, pair.y + 1));
                }
                if ((!down || !left) && !this.floor[pair.x - 1][pair.y - 1]) {
                    stack.push(new Pair(pair.x - 1, pair.y - 1));
                }
            }
        }

        // 计算当前层水洼个数
        int countFloor = 0;
        for (boolean[] booleans : floor) {
            for (boolean aBoolean : booleans) {
                if (!aBoolean) {
                    countFloor++;
                }
            }
        }
        return countFloor;
    }

    private static class Pair {
        final int x;
        final int y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}