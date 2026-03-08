class Solution {
    public int smallestBalancedIndex(int[] nums) {
        long sum = 0;
        long[] prod = new long[nums.length];
        prod[nums.length - 1] = 1;
        for(int i = nums.length - 2;i >= 0;i--){
            prod[i] = prod[i + 1] * nums[i + 1];
            if(prod[i] > 1e15){
                prod[i] = Long.MAX_VALUE;
            }
        }
        for(int i = 0;i < nums.length;i++){
            if(sum == prod[i]){
                return i;
            }
            sum += nums[i];
        }
        return -1;
    }
}