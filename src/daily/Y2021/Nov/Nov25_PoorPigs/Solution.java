package daily.Y2021.Nov.Nov25_PoorPigs;

class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        double times = (double) minutesToTest / minutesToDie;
        double ans = Math.log(buckets) / Math.log(1 + times);
        return (int) Math.ceil(ans);
    }
}