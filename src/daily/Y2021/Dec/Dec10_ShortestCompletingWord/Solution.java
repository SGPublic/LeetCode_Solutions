package daily.Y2021.Dec.Dec10_ShortestCompletingWord;

class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int[] origin = count(licensePlate);
        String ans = null;
        for (String word : words) {
            int[] index = count(word);
            if (!canComplete(origin, index)) {
                continue;
            }
            if (ans == null) {
                ans = word;
                continue;
            }
            if (word.length() < ans.length()) {
                ans = word;
            }
        }
        return ans;
    }

    private int[] count(String str) {
        int[] origin = new int[26];
        String originStr = str.toLowerCase();
        for (int i = 0; i < originStr.length(); i++) {
            char index = originStr.charAt(i);
            if (index == ' ' || (index >= '0' && index <= '9')) {
                continue;
            }
            origin[index - 'a']++;
        }
        return origin;
    }

    private boolean canComplete(int[] origin, int[] current) {
        for (int i = 0; i < current.length; i++) {
            if (current[i] < origin[i]) {
                return false;
            }
        }
        return true;
    }
}