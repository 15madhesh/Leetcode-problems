class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int[] dp = new int[arr.length + 1];
        for(int i = 1;i <= arr.length;i++){
            int curmax = 0;
            for(int j = 1;j <= k && (i - j) >= 0;j++){
                curmax = Math.max(curmax, arr[i - j]);
                dp[i] = Math.max(dp[i],dp[i - j] + curmax * j);
            }
            //System.out.println(dp[i]);
        }
        return dp[arr.length];
    }
}