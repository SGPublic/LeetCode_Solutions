package daily.Y2021.Dec.Dec04_RansomNote;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] chars = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            chars[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            int index = ransomNote.charAt(i) - 'a';
            if (chars[index] == 0) {
                return false;
            }
            chars[index]--;
        }
        return true;
    }
}