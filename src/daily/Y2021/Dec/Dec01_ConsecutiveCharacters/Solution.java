package daily.Y2021.Dec.Dec01_ConsecutiveCharacters;

class Solution {
    public int maxPower(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int ans = 1;
        char current = s.charAt(0);
        int flag = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == current) {
                flag++;
                continue;
            }
            ans = Math.max(ans, flag);
            flag = 1;
            current = s.charAt(i);
        }
        ans = Math.max(ans, flag);
        return ans;
    }
}