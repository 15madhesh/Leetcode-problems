class Solution {
    public int sum(int t) {
        int val = 0;
        while (t > 0) {
            val += (t % 10);
            t /= 10;
        }
        return val;
    }

    public int smallestIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int t = nums[i];
            if (sum(nums[i]) == i) {
                return i;
            }
        }
        return -1;
    }
}