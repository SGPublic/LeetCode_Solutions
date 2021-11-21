package daily.Y2021.Oct.Oct30_SingleNumber3;

/**
 * 异或遍历后，分组再次异或遍历
 */
class Solution {
    public int[] singleNumber(int[] nums) {
        int flag = 0;
        for (int num : nums) {
            flag ^= num;
        }
        int k = 0;
        for (int i = 31; i >= 0; i--) {
            if (((flag >> i) & 1) == 1) {
                k = i;
                break;
            }
        }
        int[] ans = new int[2];
        for (int num : nums) {
            if (((num >> k) & 1) == 1) {
                ans[1] ^= num;
            } else {
                ans[0] ^= num;
            }
        }
        return ans;
    }
}