package daily.Y2022.Jan.Jan10_AdditiveNumber;

class Solution {
    public boolean isAdditiveNumber(String num) {
        if (num.length() >= 3) {
            int end = num.charAt(0) == '0' ? 2 : num.length() - 1;
            for (int i = 1; i < end; i++) {
                long a = Long.parseLong(num.substring(0, i));
                if (next(a, num.substring(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean next(long a, String next) {
        int end = next.charAt(0) == '0' ? 2 : next.length();
        for (int i = 1; i < end; i++) {
            long b = Long.parseLong(next.substring(0, i));
            long ab = a + b;

            int cEnd = i + String.valueOf(ab).length();
            if (cEnd > next.length()) {
                return false;
            }
            String cStr = next.substring(i, cEnd);
            if (cStr.length() > 1 && cStr.charAt(0) == '0') {
                continue;
            }
            long c = Long.parseLong(cStr);

            if (ab != c) {
                continue;
            }
            if (cEnd == next.length()) {
                return true;
            }
            boolean ans = next(b, next.substring(i));
            if (ans) {
                return true;
            }
        }
        return false;
    }
}