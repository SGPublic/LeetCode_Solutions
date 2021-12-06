package daily.Y2021.Dec.Dec06_TruncateSentence;

class Solution {
    public String truncateSentence(String s, int k) {
        try {
            int end = 0;
            while (k-- > 0) {
                end = s.indexOf(' ', end + 1);
            }
            return s.substring(0, end);
        } catch (StringIndexOutOfBoundsException e) {
            return s;
        }
    }
}
