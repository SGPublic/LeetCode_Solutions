package daily.Y2022.Jan.Jan09_SlowestKey;

class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        char[] keys = keysPressed.toCharArray();

        char ans = keys[0];
        int time = releaseTimes[0];

        int index = 0;
        while (++index < releaseTimes.length) {
            int newTime = releaseTimes[index] - releaseTimes[index - 1];
            if (newTime > time) {
                ans = keys[index];
                time = newTime;
            } else if (newTime == time) {
                ans = (char) Math.max(ans, keys[index]);
            }
        }

        return ans;
    }
}