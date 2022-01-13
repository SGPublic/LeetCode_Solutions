package daily.Y2022.Jan.Jan12_IncreasingTripletSubsequence;

class Solution {
    public boolean increasingTriplet(int[] nums) {
        if (nums.length < 3) {
            return false;
        }
        int arr1 = nums[0], arr2 = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > arr2) {
                return true;
            } else if (num > arr1) {
                arr2 = num;
            } else {
                arr1 = num;
            }
        }
        return false;
    }
}
