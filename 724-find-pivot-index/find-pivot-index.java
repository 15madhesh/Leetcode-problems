class Solution {
    public int pivotIndex(int[] nums) {
        int tot = 0,sum = 0;
        for(int i = 0;i < nums.length;i++){
            tot += nums[i];
        }
        for(int i = 0;i < nums.length;i++){
            if(sum * 2 == tot - nums[i]){
                return i;
            }
            sum += nums[i];
        }
        return -1;
    }
}