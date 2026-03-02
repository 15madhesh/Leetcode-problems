class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 0 || nums == null) return 0;
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(nums[i], dp[i - 1] + nums[i]);
            max = (max < dp[i]) ? dp[i] : max;
        }
        return max;
    }
}