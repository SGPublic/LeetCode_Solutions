package Y2021.Oct.Oct31;

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
        switch(c) {
            case 'Q':
            case 'q':
            case 'W':
            case 'w':
            case 'E':
            case 'e':
            case 'R':
            case 'r':
            case 'T':
            case 't':
            case 'Y':
            case 'y':
            case 'U':
            case 'u':
            case 'I':
            case 'i':
            case 'O':
            case 'o':
            case 'P':
            case 'p':
                return 1;
            case 'A':
            case 'a':
            case 'S':
            case 's':
            case 'D':
            case 'd':
            case 'F':
            case 'f':
            case 'G':
            case 'g':
            case 'H':
            case 'h':
            case 'J':
            case 'j':
            case 'K':
            case 'k':
            case 'L':
            case 'l':
                return 2;
            default:
                return 3;
        }
    }
}