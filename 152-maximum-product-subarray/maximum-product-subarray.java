class Solution {
    public int prod(int[] nums,int j){
        int[] dp = new int[nums.length - j];
        dp[0] = nums[j];
        int max = dp[0];
        int k = 1;
        for(int i = j + 1;i < nums.length;i++){
            dp[k] = nums[i] * dp[k - 1];
            max = dp[k] > max ? dp[k] : max;
           // System.out.println(dp[k]);
            k++;
        }
        return max;
    }
    public int maxProduct(int[] nums) {
        if(nums.length == 1) return nums[0];
        int max = 0;
        for(int i = 0;i < nums.length - 1;i++){
            int val = prod(nums,i);
            max = max < val ? val : max;
        }
        return max > nums[nums.length - 1] ? max : nums[nums.length - 1];     
    }
}