package daily.Y2022.Mar.Mar05_LongestUncommonSubsequence1;

class Solution {
    public int findLUSlength(String a, String b) {
        if (a.equals(b)) {
            return -1;
        }
        return Math.max(a.length(), b.length());
    }
}