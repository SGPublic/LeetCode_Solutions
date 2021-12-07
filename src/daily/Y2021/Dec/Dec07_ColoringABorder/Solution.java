package daily.Y2021.Dec.Dec07_ColoringABorder;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    private static final int[][] move = {
            { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 }
    };
    public int[][] colorBorder(int[][] grid, int row, int col, int color) {
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] map = new boolean[grid.length][grid[0].length];
        queue.add(new int[] { row, col });
        map[row][col] = true;
        int current = grid[row][col];

        // 广度优先每次循环之后队列留下的都是当前已遍历过的状态空间的边缘
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0){
                int[] index = queue.poll();

                for (int[] ints : move) {
                    assert index != null;
                    int newX = index[0] + ints[0];
                    int newY = index[1] + ints[1];

                    // 到达地图边缘
                    if (newX < 0 || newY < 0 || newX >= grid.length || newY >= grid[newX].length) {
                        grid[index[0]][index[1]] = color;
                        continue;
                    }
                    // 新位置已检查过
                    if (map[newX][newY]) {
                        continue;
                    }
                    // 如果下一状态位置上的颜色与给出的坐标不一致，则说明当前位置为边缘
                    if (grid[newX][newY] != current) {
                        // 将当前位置颜色标记为给出的颜色
                        grid[index[0]][index[1]] = color;
                        continue;
                    }
                    // 下一状态位置上的颜色与给出的坐标一致，添加至队列参与下一次循环
                    queue.add(new int[] { newX, newY });
                    // 标记
                    map[newX][newY] = true;
                }
            }
        }

        return grid;
    }
}