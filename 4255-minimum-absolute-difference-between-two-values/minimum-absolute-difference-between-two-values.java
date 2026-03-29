class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int a = -1;
        int b = -1;
        int res = 101;
        for(int i = 0;i < nums.length;i++){
            if(nums[i] == 1){
                a = i;
            }
            if(nums[i] == 2){
                b = i;
            }
            if(a != -1 && b != -1){
                res = Math.min(res , Math.abs(a - b));
            }
        }
        if(a == -1 || b == -1){
            return -1;
        } else {
            return res;
        }
    }
}