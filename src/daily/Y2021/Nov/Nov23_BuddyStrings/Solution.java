package daily.Y2021.Nov.Nov23_BuddyStrings;

class Solution {
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        if (s.equals(goal)) {
            int[] map = new int[26];
            for (int i = 0; i < s.length(); i++) {
                int index = s.charAt(i) - 'a';
                if (map[index] == 1) {
                    return true;
                }
                map[index]++;
            }
            return false;
        }
        int diffCount = 0;
        int[] indexes = new int[2];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == goal.charAt(i)) {
                continue;
            }
            if (diffCount >= 2) {
                return false;
            }
            indexes[diffCount++] = i;
        }
        return s.charAt(indexes[0]) == goal.charAt(indexes[1])
                && s.charAt(indexes[1]) == goal.charAt(indexes[0]);
    }
}
