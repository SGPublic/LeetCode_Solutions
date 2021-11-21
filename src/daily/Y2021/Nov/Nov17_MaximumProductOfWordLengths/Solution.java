package daily.Y2021.Nov.Nov17_MaximumProductOfWordLengths;

class Solution {
    public int maxProduct(String[] words) {
        int[] hashcodes = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            hashcodes[i] = getHashCode(words[i]);
        }
        int ans = 0;
        for (int i = 0; i < hashcodes.length; i++) {
            for (int j = i + 1; j < hashcodes.length; j++) {
                // 位与运算判断是否有相同字母
                if ((hashcodes[i] & hashcodes[j]) == 0) {
                    ans = Math.max(ans, words[i].length() * words[j].length());
                }
            }
        }
        return ans;
    }

    /**
     * 利用左移按位表示是否存在字母
     */
    private int getHashCode(String word) {
        int result = 0;
        for (char c : word.toCharArray()) {
            result |= 1 << c - 'a';
        }
        return result;
    }
}