class Solution {
    public int scoreDifference(int[] nums) {
        int f = 0,s = 0;
        int act = 1;
        for(int i = 0;i < nums.length;i++){
            if(nums[i] % 2 != 0){
                act = act == 1 ? 0 : 1;
            }
            if(i % 6 == 5){
                act = act == 1 ? 0 : 1;
            }
            if(act == 1){
                f += nums[i];
            }else{
                s += nums[i];
            }
        }
        return f - s;
    }
}