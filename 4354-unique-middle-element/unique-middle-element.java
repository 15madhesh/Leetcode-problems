class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int ct = 0;
        int mid = nums.length / 2;
        for(int i = 0;i < nums.length;i++){
            if(nums[mid] == nums[i]) ct++;
        }
        return ct == 1;
    }
}