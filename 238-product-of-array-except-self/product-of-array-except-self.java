class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int p = 1;
        for(int i = 0;i < nums.length;i++){
            res[i] = p;
            p *= nums[i];
        }
        int l = 1;
        for(int i = nums.length - 1;i >= 0;i--){
            res[i] *= l;
            l *= nums[i];
        }
        return res;
    }
}