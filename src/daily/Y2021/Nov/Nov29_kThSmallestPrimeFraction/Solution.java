package daily.Y2021.Nov.Nov29_kThSmallestPrimeFraction;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        List<int[]> array = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                array.add(new int[]{arr[i], arr[j]});
            }
        }
        array.sort((o1, o2) -> o1[0] * o2[1] - o1[1] * o2[0]);
        return new int[]{array.get(k - 1)[0], array.get(k - 1)[1]};
    }
}