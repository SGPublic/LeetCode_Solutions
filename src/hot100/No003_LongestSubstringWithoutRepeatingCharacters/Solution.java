package hot100.No003_LongestSubstringWithoutRepeatingCharacters;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        int ans = 0;
        for (int i = 0; i < chars.length; i++) {
            Set<Character> substring = new HashSet<>();
            int current = 0;
            while (substring.add(chars[i + current])) {
                current++;
                if (i + current >= chars.length) {
                    break;
                }
            }
            ans = Math.max(ans, current);
        }
        return ans;
    }
}