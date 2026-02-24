class Solution {
    public int maxProduct(int[] nums) {
        int fm = 0,sm = 0;
        for(int i = 0;i < nums.length;i++){
            if(nums[i] > fm){
                sm = fm;
                fm = nums[i];
            }else if(nums[i] > sm){
                sm = nums[i];
            }
        }
        return (fm - 1) * (sm - 1);
    }
}