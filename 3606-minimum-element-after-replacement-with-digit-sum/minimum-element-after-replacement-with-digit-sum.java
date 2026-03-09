class Solution {
    public int minElement(int[] nums) {
        int min = 999,val;
        for(int i = 0;i < nums.length;i++){
            val = nums[i];
            int sum = 0;
            while(val > 0){
                sum += val % 10;
                val /= 10;
            }
            nums[i] = sum;
            if(min > sum){
                min = sum;
            }
        }
        return min;
    } 
}