package daily.Y2021.Nov.Nov30_nThDigit;

class Solution {
    public int findNthDigit(int n) {
        int i = 0;
        while (true) {
            long base = (int) Math.pow(10, i++);
            long range = base * i * 9;
            if (n > range) {
                n -= range;
                continue;
            }
            n -= 1;
            long index = n / i + base;
            return String.valueOf(index).charAt(n % i) - '0';
        }
    }
}