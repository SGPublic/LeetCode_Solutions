package daily.Y2021.Dec.Dec31_PerfectNumber;

class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num == 1) {
            return false;
        }
        int check = 0;
        double sqrt = Math.sqrt(num);
        for (int i = 1; i <= sqrt; i++) {
            if (num % i != 0) {
                continue;
            }
            check += i;
            if (i == sqrt) {
                continue;
            }
            check += num / i;
        }
        return num == check;
    }
}