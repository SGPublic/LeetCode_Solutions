package daily.Y2021.Dec.Dec05_SuperPow;

import java.math.BigInteger;

class Solution {
    public int superPow(int a, int[] b) {
        BigInteger mod = BigInteger.valueOf(1337);
        BigInteger bA = BigInteger.valueOf(a);
        StringBuilder sB = new StringBuilder();
        for (int i : b) {
            sB.append(i);
        }
        BigInteger bB = new BigInteger(sB.toString(), 10);
        return Integer.parseInt(bA.modPow(bB, mod).toString(10));
    }
}