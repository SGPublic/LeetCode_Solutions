package daily.Y2021.Oct.Oct31_KeyboardRow;

import java.util.Arrays;

/**
 * 常规思路
 */
class Solution {
    public String[] findWords(String[] words) {
        String[] ans = new String[0];
        for1: for (String word : words) {
            char[] chars = word.toCharArray();
            int finds = find(chars[0]);
            for (int i = 1; i < chars.length; i++) {
                if (finds != find(chars[i])) {
                    continue for1;
                }
            }
            int size = ans.length;
            ans = Arrays.copyOf(ans, size + 1);
            ans[size] = word;
        }
        return ans;
    }

    private int find(char c) {
        return switch (c) {
            case 'Q', 'q', 'W', 'w', 'E', 'e', 'R',
                    'r', 'T', 't', 'Y', 'y', 'U', 'u',
                    'I', 'i', 'O', 'o', 'P', 'p' -> 1;
            case 'A', 'a', 'S', 's', 'D', 'd', 'F',
                    'f', 'G', 'g', 'H', 'h', 'J',
                    'j', 'K', 'k', 'L', 'l' -> 2;
            default -> 3;
        };
    }
}