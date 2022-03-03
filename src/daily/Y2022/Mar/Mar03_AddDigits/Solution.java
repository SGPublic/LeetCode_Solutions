package daily.Y2022.Mar.Mar03_AddDigits;

public class Solution {
    public int addDigits(int num) {
        if (num == 0) return 0;
        int result = num % 9;
        return result == 0 ? 9 : result;
//        return (num - 1) % 9 + 1;
    }
}
