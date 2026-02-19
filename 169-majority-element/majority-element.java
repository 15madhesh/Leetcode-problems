class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hp = new HashMap<>();
        for(int i = 0;i < nums.length;i++){
            hp.put(nums[i] , hp.getOrDefault(nums[i] , 0) + 1);
            if(hp.get(nums[i]) > nums.length / 2){
                return nums[i];
            }
        }
        return nums[0];
    }
}