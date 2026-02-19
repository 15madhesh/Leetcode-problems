class Solution {
    public int smallestEqual(int[] nums) {
        int val = -1;
        for(int i = nums.length - 1;i >= 0;i--){
            if(i % 10 == nums[i]){
                val = i;
            }
        }
        return val;
    }
}